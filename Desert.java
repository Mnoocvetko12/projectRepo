package dominos;

public class Desert extends Orderable {
	public static final String CATEGORY_DESERTS = "DESERTS";
	private static Menu menu;

	Desert(double price, String name, String decription, double weightOrVolume) {
		super(price, name, decription, weightOrVolume);
		menu = Menu.createMenu();
		menu.addOrderable(this);
	}
}

