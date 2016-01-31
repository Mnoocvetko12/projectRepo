package dominos;

public class Dominos {
	public static void main(String[] args) {
		
	Menu menuDomino = Menu.createMenu();
	Restaurant rest1 = new Restaurant("ulica Lisica", "Purvia restorant na Nasheto Dominos");
	User testuser1 = new User("user1", "111", rest1);

//	for(Ingridient i:Menu.peperoniS.getInridients()){
//		System.out.println(i.getName());
//	}
//	testuser1.order(Menu.peperoniM.modifyMinus(Menu.getMozarelaPI()));
	testuser1.order(Menu.peperoniM.modifyPlus(Menu.getMushroomsPP()));
	testuser1.order(Menu.peperoniL.modifyMinus(Menu.getBasilicumPP()));
////	testuser1.order(Menu.peperoniS);
	testuser1.getKolichka().showShoppigCart();





	}

}
