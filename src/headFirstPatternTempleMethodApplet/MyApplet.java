package headFirstPatternTempleMethodApplet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	
	String message;
	
	public void init() {                      // ����������� init() ��������� ��������� ����������� �������� ��� ������������� ���������� 
		message = "Hello world, I am alive";  
		repaint();                            //repaint() -���������� ����� ��� Applet, ��� ������ �������� ���������� �������� ������ 
	}                                         // ������������ � ������������� ����������� ������

	
    @Override
    public void start() {                      //����������� ����� ��������� ���������� ��������� ����������� �������� ��������������� ����� 
    	// TODO Auto-generated method stub     // ������������ ������� �� ��� ��������
    	message = "Now I am starting up";  
		repaint();                          
    }
	
    @Override
    public void stop() {                        //��� �������� � ������ �������� ����������� stop ���� ���������� ����������� ������� ��� ����������� 
    	// TODO Auto-generated method stub      // ��� ���������� ������
    	message = "Oh, now i am being stoping";  
		repaint();
    }
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	// ����� �������������
    }
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(message, 5, 15);
	}
}
