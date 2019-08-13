package headFirstPatternTempleMethodJFrame;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {                // Разширяем класс JFrame который содержит метод update(), управляющий перерисовкой экрана 
                                                     // Чтобы подключиться к этому алгоритму, мы переопределяем метод paint() 
	public MyFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
		
	}
	
	
	public void paint(Graphics graphics) {              // Алгоритм перерисовки JFrame візівает paint().По умолчанию метод paint()  
		super.paint(graphics);                          // не делает ничего это перехватчик Переопределенная версия paint()  
		String msg ="I rulle!!!";                       // выводит сообщение в окне
		graphics.drawString(msg, 100, 100);
		
	}
	
	public static void main(String [] args) {
		MyFrame myFrame = new MyFrame("Head first design patterns");
	}
	
}
