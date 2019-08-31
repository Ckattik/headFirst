package headFirstPatternDeputyVirtualPartTwo;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

public class InageProxy implements Icon{

	ImageIcon imageIcone;                // в переменной храниться НАСТОЯЩИЙ обьект Icon который должен отображаться после загрузки   
	URL imageURL;                        
	Thread retrievalThread;
	boolean retrieving = false;
	
	
	public InageProxy(Url url) {                // Конструктору передаеться URL адрес изображения - того, которое должно отображаться после загрузки 
		// TODO Auto-generated constructor stub
		imageURL = url;
	}
	
	
	
	@Override
	public void getHeight() {                      // До завершения загрузки возвращаються значения длины и ширыны по умолчанию; 
		// TODO Auto-generated method stub         // Затем управление передаеться imageIcon;
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
			imageIcon.paintIcon(c, g, x, y);                                    // Если обьект уже существует то требование о перерисовке уже передаеться 
		}else {                                                                 // ему
			
			g.drawString("Loading CD cover , please wait...", x + 300, y + 190); // В противном случае выводиться сообщение о загрузке 
			if(!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnuble){
					public void run() {                                       // Здесь происходит самое интересное.Изображение прорисовываеться на экране     
						try {                                                 // (вызов делегируеться ImageIcon).Но если обьект ImageIcon еще не 
                                                                              // создан мы создаеим его
							                                                  
							imageIcon = new ImageIcon(imageURL, "CD cover");  // Здесь загружаеться НАСТОЯЩЕЕ изображение.Следует учесть что загрузка                                                
							c.repaint();                                                  // осуществляеться синхронно: конструктор ImageIcon не возвращает управление 
						}catch(Exception ex) {                                // до завершения загрузки. Соответственно операции обновления экрана и вывода сообщения приходяться 
							ex.printStackTrace();                             // осущестлять асинхронно 
						}
					}
				
				});
		retrievalThread.start();
	}
	
}
}