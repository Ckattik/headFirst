package headFirstPatternModelViewController;

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

public class DJView implements ActionListener{

	BeatModelInterface model;         // � ������������� ��������� ������ �� ������ � �� ����������. ���������� ������������� ������ 
	ControllerInterface controller;   // ������������ ���������� �� ������� �� ����� ���������
	
	JLabel bpmLabel;
	JTextField bpmTExtField;
	JButton setBMPButton;
	JButton increaseBMPButton;
	JButton decreaseBMPButton;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;
	
	
	JFrame viewFrame;                 // �������� ������������ �����������
	JPanel viewPanel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;
	
	public void createControls() {            // ����� ������� ��� �������� ���������� � ��������� �� � ���������� ����������, � ����� ������� ����
		//Create all Swing components here    // ��� ������ ������� Start � Stop ����������� ��������������� ������ �����������
	}
	
	public void enableStopMenuItem() {        // ������ ������������ � ������ ���������� ������ ���� Start � Stop. ��� ����� �������� ������ 
		stopMenuItem.setEnabled(true);        // ���������� ���������� ��� ������ ��� ���������� �����������
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
	
	
	
	
	
	
	@Override                                          //����� ����������� ��� ������ �� ������ 
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == setBMPButton) {
			int bpm = Integer.parseInt(bpmTExtField.getText());
			
			controller.setBPM(bpm);                                 // ���� ������� ������ set �������� ����������� ����������� � ����� ��������
			
		}else if(event.getSource() == increaseBMPButton) {
			
			controller.increaseBMP();                               // ���� ������� ������ ���������� ��� ���������� ������� ��� ���������� ����� 
			                                                        // ����������� �����������
			
		}else if(event.getSource() == decreaseBMPButton)
		   
			controller.decreaseBMP();
	}
	
	
	
	
	public DJView(ControllerInterface controller, BeatModelInterface model) {
		// TODO Auto-generated constructor stub                                // ���������� ������� ������ �� ���������� � ������
		this.controller = controller;                                          // � ��������� �� � ����������
		this.model = model;
		
		model.registerObserver((BeatObserver)this);                            // ������������� ��������������� � �������� ����������� 
		model.registerObserver((BPMObserver) this);                            // BeatObserver � BPMObserver ������
		
		
	}
	
	public void createView() {
		// Create all Swing components here 
	}
	
	public void updateBPM() {
		int bpm  = model.getBPM();
		if(bpm == 0) {
			bpmOutputLabel.setText("Current BPM :  " + model.getBPM());
		}
	}
	
	public void updateBeat() {                 // ����� updateBeat ����������� � ������ ������ �����. ����� ��� ����������, ���������� ���������� �������
		beatBar.setValue(100);                 // �� ���������� �����. ��� ����� ���������� �������������� ����������� ��������� �������� 
	}
}
