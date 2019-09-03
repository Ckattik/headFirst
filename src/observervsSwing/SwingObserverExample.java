package observervsSwing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
                                                                         //Простое приложение Swing создаем панель и размещаем на ней кнопку 
	JFrame frame;
	
	public static void main(String[] args) {
		
		SwingObserverExample example = new SwingObserverExample();
                  
		example.go();
	}
		
		
		public void go() {
			
			frame = new JFrame();
			JButton button = new JButton("Should i do it?");
			
			button.addActionListener(new AngelListener());                  //Назначаем обьекты слушателям (наблюдателями)событий кнопки 
			button.addActionListener(new DevilListener());
			frame.getContentPane().add(BorderLayout.CENTER, button);
			
			//set frame properties
			
			
		}
		                                                                 // Определение наплюдателей в виде внутрених класов
		
		class AngelListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			     System.out.println("Don't do it, you might regeret it!");	
			}
		}
		
		class DevilListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Come on do it!");                      //При изминении состояния субьекта (в даном случае кнопки) вместо update()  
			}                                                              // вызываеться метод ActionPerfomed
		}
		
		
		
		
	}
	

