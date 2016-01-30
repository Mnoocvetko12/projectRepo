package dominos;

public class Dominos {
	public static void main(String[] args) {
		
	Menu menuDomino = Menu.createMenu();
	Restaurant rest1 = new Restaurant("ulica Lisica", "Purvia restorant na Nasheto Dominos");
	User testuser1 = new User("user1", "111", rest1);

	for(Ingridient i:Menu.peperoni.getInridients()){
		System.out.println(i.getName());
	}





	}

}
