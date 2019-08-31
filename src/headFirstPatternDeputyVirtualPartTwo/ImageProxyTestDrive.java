package headFirstPatternDeputyVirtualPartTwo;

public class ImageProxyTestDrive {

	ImageComponent imageComponent;
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
		
		//Создание панели и меню
		
		                                          // Создаем заместителя и связываем его с исходным URL -фдресом каждый раз когда в меню 
		Icon icon = new ImageProxy(initialURL);   // выбираеться новый диск программа создает нового заместителя    
		imageComponent = new ImageComponent(icon);// затем заместитель упаковываеться в коспонент для добавления к обьектам панели 
		frame.getContentPane().add(imageComponent);// добавляем заместителя к обьектам панели на котором должно выводиться изображение
		
		
	}

}
