package patternDecoratorIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) throws IOException{               //Создаем обьект FileIputStream и декорируем его - сначала декоратором 
		// TODO Auto-generated method stub                                   //BufferedInputStream затем нашим фильтром LowerCaseInputStream

		int c;
		
		try {
			
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\User\\month ego\\eclipse-workspace\\NewLife\\src\\patternDecoratorIO\\text.txt"))); 
			
			while((c = in.read()) >= 0) {                         // Просто используем поток для чтения символов до конца файла и выводим символы до     
				System.out.print((char)c);                      // конца чтения.
			   
			}
			
			
			in.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
