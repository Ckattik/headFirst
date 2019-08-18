package headFirstPetternLinker;

public class Waitress {

	MenuComponent allMenus;

	
	public Waitress(MenuComponent allMenus) {         //ѕередаем компонент меню верхнего уровн€ - тот, который содержит остальные Menu 
 		// TODO Auto-generated constructor stub       // мы назвали его allMenus
	 this.allMenus = allMenus;
	}
	
	
	public void printMenu() {                        // ј что бы вывести всю иерархию меню - все меню и все их елементы - достаточно вызвать метод 
		allMenus.print();                            // print()  дл€ меню верхнего уровн€
	}
	
}
