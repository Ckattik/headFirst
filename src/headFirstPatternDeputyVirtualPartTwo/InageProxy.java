package headFirstPatternDeputyVirtualPartTwo;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

public class InageProxy implements Icon{

	ImageIcon imageIcone;                // � ���������� ��������� ��������� ������ Icon ������� ������ ������������ ����� ��������   
	URL imageURL;                        
	Thread retrievalThread;
	boolean retrieving = false;
	
	
	public InageProxy(Url url) {                // ������������ ����������� URL ����� ����������� - ����, ������� ������ ������������ ����� �������� 
		// TODO Auto-generated constructor stub
		imageURL = url;
	}
	
	
	
	@Override
	public void getHeight() {                      // �� ���������� �������� ������������� �������� ����� � ������ �� ���������; 
		// TODO Auto-generated method stub         // ����� ���������� ����������� imageIcon;
		if(imageIcon != null) {
			return imageIcon.getHeight();
		}else {
			return 600;
		}
	}
	
	@Override
	public void getWidth() {
		// TODO Auto-generated method stub
        if(imageIcon != null) {
        	return imageIcon.getWidth();
        	
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
				retrievalThread = new Thread(new Runnuble){
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