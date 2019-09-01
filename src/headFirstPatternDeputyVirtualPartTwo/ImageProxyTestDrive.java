package headFirstPatternDeputyVirtualPartTwo;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class ImageProxyTestDrive {

	                                                                 // ImageComponent imageComponent;
	ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viwer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable(); 
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}
	
	public ImageProxyTestDrive() throws Exception{
		// TODO Auto-generated constructor stub
		
		cds.put("Ambient : Music for airports" ,"http:// images.amazon.com/images/P/B00003S2K.01.LZZZZZZZ.jpg");
		cds.put("Buddha Bar" ,"http:// images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		cds.put(" Ima " ,"http:// images.amazon.com/images/P/B00005IRM.01.LZZZZZZZ.gif");
	
	
	   URL initialURL = new URL((String)cds.get("Selected Ambiet Works, Vol. 2"));
	   menuBar = new JMenuBar();
	   menu = new JMenu("Favorite CDs");
	   menuBar.add(menu);
	   frame.setJMenuBar(menuBar);
	   
	   for(Enumeration e = cds.keys(); e.hasMoreElements();) {
		   
	      String name = (String)e.nextElement();
		   JMenuItem menuItem = new JMenuItem(name);
		   menu.add(menuItem);
		   menuItem.addActionListener(new ActionListener() {
			   @Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
		      
				   imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				   frame.repaint();
				
			}
			   
		   
		   } );
		   
	
	}
		
		
		//Создание панели и меню
		
		                                          // Создаем заместителя и связываем его с исходным URL -фдресом каждый раз когда в меню 
		Icon icon = new ImageProxy(initialURL);   // выбираеться новый диск программа создает нового заместителя    
		imageComponent = new ImageComponent(icon);        // затем заместитель упаковываеться в коспонент для добавления к обьектам панели 
		frame.getContentPane().add(imageComponent);// добавляем заместителя к обьектам панели на котором должно выводиться изображение
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		
		}
	
	  public URL getCDUrl(String name) {
		  
		  try {
			  return new URL((String)cds.get(name));
			  
		  }catch(MalformedURLException e) {
			  e.printStackTrace();
			  return null;
		  }
		  
		  
	  }

}
