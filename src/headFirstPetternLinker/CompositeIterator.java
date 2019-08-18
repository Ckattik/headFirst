package headFirstPetternLinker;


import java.util.*;

public class CompositeIterator implements Iterator {

	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {     // Здесь передаеться итератор комбинации верхнего уровня. Мы созхраняем его в стеке
		// TODO Auto-generated constructor stub
		
		stack.push(iterator);
		
		
	}
	
	@Override
	public Object next() {                                         // Когда клиент запрашивает следующий елемент, мы сначала проверяем его 
		// TODO Auto-generated method stub                         // существование вызовом hasNext()
	   if(hasNext()) {
		   Iterator iterator = (Iterator)stack.peek();
		   MenuComponent component = (MenuComponent)iterator.next(); // Если следующий елемент существует мы извлекаем текущий итератор из стека
		   if(component instanceof Menu) {                           // и получаем следующий елемент
			   stack.push(component.createIterator());               // Если компонент относиться к классу Menu обнаружена очередная комбинация 
		   }                                                         // которую необходимо включить в перебор;соответствено мы заносим его в стек 
		   return component;                                         // В любом случае метод возвращает компонент
	   }else {
		   return null;
	   }
		
		
		
		
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.empty()){                              // Чтобы проверить наличие следующего компонента мы проверяем пуст ли стек 
			return false;
		} else {
			Iterator iterator = (Iterator)stack.peek();
			if(!iterator.hasNext()) {                      // Если стек не пуст читаем из стека верхний итератор и проверяем есть ли в стеке  
				stack.pop();                               // следующий елемент. Если нет метод извлекает компонент из стека  и рекурсивно 
				return hasNext();                          // вызывает hasNext()
			}else {
				return true;                               // А если есть метод возвращает true
			}
		}

	}
	
	@Override
	public void remove() {                             //  Удаление не поддерживаеться только перебор
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
}
