package headFirstPatternTempleMethodApplet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	
	String message;
	
	public void init() {                      // Перехватчик init() позволяет выполнить необходимые действия при инициализации приложения 
		message = "Hello world, I am alive";  
		repaint();                            //repaint() -конкретный метод для Applet, при помощи которого компоненты высокого уровня 
	}                                         // оповещаються о необходимости перерисовки аплета

	
    @Override
    public void start() {                      //Перехватчик старт позволяет приложению выполнить необходимые действия непосредственно перед 
    	// TODO Auto-generated method stub     // отображением апплета на веб странице
    	message = "Now I am starting up";  
		repaint();                          
    }
	
    @Override
    public void stop() {                        //При переходе к другой странице перехватчик stop дает приложению возможность сделать все необходимое 
    	// TODO Auto-generated method stub      // для завершения работы
    	message = "Oh, now i am being stoping";  
		repaint();
    }
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	// Аплет уничтожаеться
    }
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(message, 5, 15);
	}
}
