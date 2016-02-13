package dominos;

public class User implements Cloneable{

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String adres;
	private ShoppingCart kolichka;
	private Restaurant restorant;
	private static Menu menuDominos = Menu.createMenu();

	User(String username, String password, Restaurant restorant) {
		setUsername(username);
		setPassword(password);
		setRestorant(restorant);
		kolichka = new ShoppingCart();
	}

//	void addIngridientsTothePizza()
	
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
	
	void order(Orderable itemFromMenu){
//		Orderable dummy = (Orderable) itemFromMenu.clone();
		this.kolichka.addItemToShopCart(itemFromMenu);
	}


	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public ShoppingCart getKolichka() {
		return kolichka;
	}

	public void setKolichka(ShoppingCart kolichka) {
		this.kolichka = kolichka;
	}

	public Restaurant getRestorant() {
		return restorant;
	}

	public void setRestorant(Restaurant restorant) {
		this.restorant = restorant;
	}

	public static Menu getMenuDominos() {
		return menuDominos;
	}

	public static void setMenuDominos(Menu menuDominos) {
		User.menuDominos = menuDominos;
	}

	void createNewAddress() {
	}

	void modifyAddress() {
	}

	void deleteAddress() {
	}

}
