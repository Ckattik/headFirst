package headFirstPatternTempleMethodJFrame;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {                // ��������� ����� JFrame ������� �������� ����� update(), ����������� ������������ ������ 
                                                     // ����� ������������ � ����� ���������, �� �������������� ����� paint() 
	public MyFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
		
	}
	
	
	public void paint(Graphics graphics) {              // �������� ����������� JFrame ������ paint().�� ��������� ����� paint()  
		super.paint(graphics);                          // �� ������ ������ ��� ����������� ���������������� ������ paint()  
		String msg ="I rulle!!!";                       // ������� ��������� � ����
		graphics.drawString(msg, 100, 100);
		
	}
	
	public static void main(String [] args) {
		MyFrame myFrame = new MyFrame("Head first design patterns");
	}
	
}
