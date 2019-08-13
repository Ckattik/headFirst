package arraysSort;

public class DuckSort implements Comparable{

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void sort(Object [] a) {
		
		Object [] aux = (Object[])a.clone();
		
	}
	
	
	
	private static void mergeSort(Object src [], Object dest[], int low, int high, int off) {     //Шаблонный метод
		
		for(int i = low; i < hight; i ++) {
			for(int j = i; j > low && (Comparable)dest[j-1]).compareTo((Comparable)dest[j]) > 0; j--){
				swap(dest, j,j-1);
			}
		}
		return;
		
		
	}
	
}
