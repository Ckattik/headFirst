package headFirstPatternAdapterEnumerationIterator;

import java.util.Iterator;
import java.util.Enumeration;

public class EnumerationIterator implements Iterator {   //����� ������� ������������� ���������� ����� ��� ��������, 
	                                                     // �� ��������� ��������� Iterator
    Enumeration enu;
    
    
    public EnumerationIterator(Enumeration enu) {        //������������ ������ Enumeration ����������� � ����������(����������)
    	this.enu = enu;
    }
    
    

    @Override
    public boolean hasNext() {                        // ����� hasNext() ���������� Iterator �������� ���������� ������ 
    	// TODO Auto-generated method stub            // hasMoreElements() ���������� Enumeration
    	return enu.hasMoreElements();
    }
    
    @Override
    public Object next() {                           // � ����� next() ���������� Iterator �������� ���������� ������ nextElement()
    	// TODO Auto-generated method stub
    	return enu.nextElement();
    }
    
    
    @Override
    public void remove() {                           // � ��������� ����� remove() ���������� Iterator() ���������� �� ��������,
    	// TODO Auto-generated method stub           // ������� �� ������ ���������� ���������� 
    	Iterator.super.remove();
    }



	
	
}
