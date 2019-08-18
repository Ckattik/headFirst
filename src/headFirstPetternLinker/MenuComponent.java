package headFirstPetternLinker;

import java.util.Iterator;

/* Так как одни методы имеют смысл только для MenuItem, а другие только для 
 * Menu, реализация по умолчанию инициирует UnsupportedOperationException()
 * Если обьект MenuItem или Menu не поддерживает операцию, емуне нужно нечего делать 
 * он просто наследует реализацию по умочанию 
 */

public abstract class MenuComponent {

		
	public void add(MenuComponent menuComponent) {     // Группа <комбинацционных> методов то есть методов для добавления, удаления и получения 
		throw new UnsupportedOperationException();     // MenuComponent
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	
	
	
	public String getName() {                           // Группа "методов операций" используемых MenuItem()
		throw new UnsupportedOperationException();      // Как вы вскоре увидите при анализе кода Menu, некоторіе из этих
	}                                                   // методов также могут использоваться в Menu
	public String getDescription() {                   
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	
	public void print() {                                 // Метод print() реализуеться как в Menu так и в MenuItem, но мы предоставляем
		throw new UnsupportedOperationException();        // реализацию по умолчанию
	}
	
	public abstract Iterator createIterator();
	
	
	
	
}
