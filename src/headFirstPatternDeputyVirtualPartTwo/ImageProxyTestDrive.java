package headFirstPatternDeputyVirtualPartTwo;

public class ImageProxyTestDrive {

	ImageComponent imageComponent;
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
		
		//�������� ������ � ����
		
		                                          // ������� ����������� � ��������� ��� � �������� URL -������� ������ ��� ����� � ���� 
		Icon icon = new ImageProxy(initialURL);   // ����������� ����� ���� ��������� ������� ������ �����������    
		imageComponent = new ImageComponent(icon);// ����� ����������� �������������� � ��������� ��� ���������� � �������� ������ 
		frame.getContentPane().add(imageComponent);// ��������� ����������� � �������� ������ �� ������� ������ ���������� �����������
		
		
	}

}
