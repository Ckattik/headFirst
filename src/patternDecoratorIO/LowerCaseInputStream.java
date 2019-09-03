package patternDecoratorIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{
	
	public LowerCaseInputStream(InputStream in) {
		super(in);
		
	}

	@Override
	public int read() throws IOException {                            //Теперь необходимо реализовать два метода read.Они получают байт(или массив байтов)
		// TODO Auto-generated method stub                            //и преобразовуют каждый символ верхнего регистра к нижнему регистру
	int c = super.read();
		
		
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	
	
	
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		// TODO Auto-generated method stub
		
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset + result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		
		return result;
		
	
		
	}
	
	
	

}
