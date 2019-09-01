package headFirstPatternDeputyVirtualPartTwo;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageProxy implements Icon{

	ImageIcon imageIcon;                // � ���������� ��������� ��������� ������ Icon ������� ������ ������������ ����� ��������   
	URL imageURL;                        
	Thread retrievalThread;
	boolean retrieving = false;
	
	
	public ImageProxy(URL url) {                // ������������ ����������� URL ����� ����������� - ����, ������� ������ ������������ ����� �������� 
		// TODO Auto-generated constructor stub
		imageURL = url;
	}
	
	
	
	@Override
	public int getIconHeight() {                      // �� ���������� �������� ������������� �������� ����� � ������ �� ���������; 
		// TODO Auto-generated method stub         // ����� ���������� ����������� imageIcon;
		if(imageIcon != null) {
			return imageIcon.getIconHeight();
		}else {
			
			return 600;
		}
	}
	
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
        if(imageIcon != null) {
        	return imageIcon.getIconWidth();
        	
        }else {
        	return  800;
        }
	}
	

	
	
	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if(imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);                                    // ���� ������ ��� ���������� �� ���������� � ����������� ��� ����������� 
		}else {                                                                 // ���
			
			g.drawString("Loading CD cover , please wait...", x + 300, y + 190); // � ��������� ������ ���������� ��������� � �������� 
			if(!retrieving) {
				retrieving = true;
				
				retrievalThread = new Thread(new Runnable()  {
					public void run() {                                       // ����� ���������� ����� ����������.����������� ���������������� �� ������     
						try {                                                 // (����� ������������� ImageIcon).�� ���� ������ ImageIcon ��� �� 
                                                                              // ������ �� �������� ���
							                                                  
							imageIcon = new ImageIcon(imageURL, "CD cover");  // ����� ������������ ��������� �����������.������� ������ ��� ��������                                                
							c.repaint();                                                  // ��������������� ���������: ����������� ImageIcon �� ���������� ���������� 
						}catch(Exception ex) {                                // �� ���������� ��������. �������������� �������� ���������� ������ � ������ ��������� ����������� 
							ex.printStackTrace();                             // ����������� ���������� 
						}
					
				}
				
				});
				
		retrievalThread.start();
	}
	
}
}
	}