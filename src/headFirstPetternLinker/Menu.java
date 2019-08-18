package headFirstPetternLinker;

import java.util.ArrayList;
import java.util.Iterator;


public class Menu extends MenuComponent {
	
	ArrayList menuComponents = new ArrayList();  // Меню может имет любое количество потомков типа MenuComponent;для их хранения будет и
	String name;                                 // использоваться внутреняя коллекция ArrayList
	String description;
	
	
 	public Menu(String name, String description) {  // Отличаеться от нашей старой реализации: с каждым меню связываеться название и описание
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
	}
 	
 	
 	@Override
 	public void add(MenuComponent menuComponent) {   // Включение в меню обьектов MenuItem или других обьектов Menu. Так как и MenuItem и 
 		// TODO Auto-generated method stub           // Menu разширяют MenuComponent хватает одного метода Также поддерживаються операции удаления 
 		menuComponents.add(menuComponent);           // и получения MenuComponent
 	}
 	
 	@Override
 	public void remove(MenuComponent menuComponent) {
 		// TODO Auto-generated method stub
 		menuComponents.remove(menuComponent);
 	}
 	
 	@Override
 	public MenuComponent getChild(int i) {
 		// TODO Auto-generated method stub
 		return (MenuComponent)menuComponents.get(i);
 	}
	
	@Override
	public String getName() {                         // Get -методы для получения названия и описания.
		// TODO Auto-generated method stub            // Обратите внимание мы не переопределяем getPrice() или isVegeterian потомучто эти методы 
		return name;                       // не имеют смысла для меню. Припопытке вызвать их для меню будет выдано исключение
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	
 	@Override
 	public void print() {                                        // Нужно лишь изменить метод print() что бы он выводил не только информацию 
		// TODO Auto-generated method stub                       // о меню, но и все компоненты : другие меню и елементы меню
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());             // Мы используем итератор для перебора всех компонентов обьекта Menu ..
		System.out.println("-----------------");                 // Ими могут быть другие обьекты Menu или oбьекты MenuItem. Так как и Menu 
		                                                         // и MenuItem реализуют метод print(), мы просто вызываем print(), а все остальное 
		Iterator iterator = menuComponents.iterator();           // они сделают сами 
		   while(iterator.hasNext()) {
			   MenuComponent menuComponent = (MenuComponent)iterator.next();  //Если в процесе перебора мы встретим другой обьект Menu,
			   menuComponent.print();                                         // его метод print() начнет новій перебор итд.
		   }
	}

}
