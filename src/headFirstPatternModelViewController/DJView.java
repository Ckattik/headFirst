package headFirstPatternModelViewController;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JProgressBar;

public class DJView implements ActionListener, BeatObserver, BPMObserver{

	BeatModelInterface model;         // В представлении храняться ссылки на модель и на контроллер. Контроллер используеться только 
	ControllerInterface controller;   // управляющими елементами до которых мы скоро доберемся
	
	JLabel bpmLabel;
	JTextField bpmTextField;
	JButton setBMPButton;
	JButton increaseBMPButton;
	JButton decreaseBMPButton;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;
	
	
	JFrame viewFrame;                 // Создание отображаемых компонентов
	JPanel viewPanel;
	JProgressBar beatBar;
	JLabel bpmOutputLabel;
	JFrame controlFrame;
	JPanel controlPanel;
    
	public DJView(ControllerInterface controller, BeatModelInterface model) {
		// TODO Auto-generated constructor stub                                // Коструктор получет ссылки на контроллер и модель
		this.controller = controller;                                          // и сохраняет их в переменной
		this.model = model;
		
		model.registerObserver((BeatObserver)this);                            // Представление регистрируеться в качестве наблюдателя 
		model.registerObserver((BPMObserver) this);                            // BeatObserver и BPMObserver модели
	}
	
	public void createView() {
		// Create all Swing components here
		viewPanel = new JPanel(new GridLayout(1,2));
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(new Dimension(100, 80));
		bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		beatBar = new JProgressBar();
		beatBar.setValue(0);
		
		JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(beatBar);
		bpmPanel.add(bpmOutputLabel);
		viewPanel.add(bpmPanel);
		viewFrame.getContentPane().add(viewPanel,BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}
	
	    public void createControls() {            // Метод создает все елементы управления и размещает их в интерфейсе приложения, а также создает меню
		//Create all Swing components here    // При вызове команды Start и Stop вызываються соответствующие методы контроллера
	
	JFrame.setDefaultLookAndFeelDecorated(true);
	controlFrame = new JFrame("Control");
	controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	controlFrame.setSize(new Dimension(100, 80));
	
	controlPanel = new JPanel(new GridLayout(1, 2));
	
	menuBar = new JMenuBar();
	menu = new JMenu("DJ Control");
	startMenuItem = new JMenuItem("Start");
	menu.add(startMenuItem);
	startMenuItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			controller.start();
		}
	});
	stopMenuItem = new JMenuItem("Stop");
	menu.add(stopMenuItem);
	stopMenuItem.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			controller.stop();
			//bpmOutputLabel.setText("offline");
		}
	});
	JMenuItem exit = new JMenuItem("Quit");
	exit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	
	menu.add(exit);
	menuBar.add(menu);
	controlFrame.setJMenuBar(menuBar);
	
	bpmTextField = new JTextField(2);
	bpmLabel = new JLabel("Enter BPM: " , SwingConstants.RIGHT);
	setBMPButton.setSize(new Dimension(10, 40));
	increaseBMPButton = new JButton(">>");
	decreaseBMPButton = new JButton("<<");
	setBMPButton.addActionListener(this);
	increaseBMPButton.addActionListener(this);
	decreaseBMPButton.addActionListener(this);
	
	JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
	
	buttonPanel.add(decreaseBMPButton);
	buttonPanel.add(increaseBMPButton);
	
	JPanel enterPanel = new JPanel(new GridLayout(1, 2));
	enterPanel.add(bpmLabel);
	enterPanel.add(bpmTextField);
	JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
	insideControlPanel.add(enterPanel);
	insideControlPanel.add(setBMPButton);
	insideControlPanel.add(buttonPanel);
	controlPanel.add(insideControlPanel);
	
	bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	
	controlFrame.getRootPane().setDefaultButton(setBMPButton);
	controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
	
	controlFrame.pack();
	controlFrame.setVisible(true);
	
	
	}
	
	public void enableStopMenuItem() {        // Методы установления и снятия блокировки команд меню Start и Stop. Как будет показано вскоре 
		stopMenuItem.setEnabled(true);        // контроллер использует эти методы для управления интерфейсом
	}
	
	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}
	
	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}
	
	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}
	
	
	@Override                                          //Метод вызываеться при щелчке на кнопке 
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == setBMPButton) {
			int bpm = Integer.parseInt(bpmTextField.getText());
			
			controller.setBPM(bpm);                                 // Если выбрана кнопка set действие передаеться контроллеру с новой частотой
			
		}else if(event.getSource() == increaseBMPButton) {
			
			controller.increaseBPM();                               // Если выбрана кнопка увеличения или уменьшения частоты эта информация также 
			                                                        // передаеться контроллеру
			
		}else if(event.getSource() == decreaseBMPButton)
		   
			controller.decreaseBPM();
	}
	
	
	
	
	
	
	public void updateBPM() {
		int bpm  = model.getBPM();
		if(bpm == 0) {
			bpmOutputLabel.setText("Current BPM :  " + model.getBPM());
		}
	}
	
	public void updateBeat() {                 // Метод updateBeat вызываеться в начале нового удара. Когда это происходит, необходимо отобразить импульс
		beatBar.setValue(100);                 // на индикаторе ритма. Для этого индикатору присваиваеться максимально возможное значение 
	}



}
