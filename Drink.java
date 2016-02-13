package dominos;

public class Drink extends Orderable {
	public static final String CATEGORY_DRINKS = "DRINKS";
	private static Menu menu;

	Drink(double price, String name, String decription, double weightOrVolume) {
		super(price, name, decription, weightOrVolume);
		menu = Menu.createMenu();
		menu.addOrderable(this);
	}
}