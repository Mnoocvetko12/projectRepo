package dominos;

import java.util.LinkedList;

public class Pizza extends CustomFood implements Iconstants {
	public static final String PIZZA_TESTO_TUNKO = "Tunko i hrupkavo";
	public static final String PIZZA_TESTO_SREDNO = "Italiansko";
	public static final String PIZZA_TESTO_DEBELO = "Tradicionno";
	public static final String CATEGORY_PIZZA = "PIZZA";
	private String size;
	// private String debelinaNaTestoto;
	private LinkedList<Ingridient> inridients;

	public Pizza(String name, String size, LinkedList<Ingridient> inridients, double price) {
		super(name);
		if (size.equals(PIZZA_S)) {
			setPrice(price);
		} else if (size.equals(PIZZA_M)) {
			setPrice(price + 3.10);
		} else
		// if (size.equals(PIZZA_L))
		{
			setPrice(price + 6.60);
		}

		setSize(size);
		// setDebelinaNaTestoto(debelinaNaTestoto);
		this.inridients = inridients;
		setWeightOrVolume(weightOfPizza(size
		// , debelinaNaTestoto
		));

	}

	int weightOfPizza(String size
	// , String debelinaNaTestoto
	) {
		if (size.equals(PIZZA_S)) {
			// if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_SREDNO)) {
			// return 250;
			// }
			return 385;
		}
		if (size.equals(PIZZA_M)) {
			// if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_TUNKO)) {
			// return 335;
			// } else if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_SREDNO)) {
			// return 385;
			// }
			return 570;
		}
		if (size.equals(PIZZA_L)) {
			// if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_SREDNO)) {
			// return 700;
			// }
		}
		return 800;
	}

	static LinkedList<Ingridient> setPeperoniIngridients() {
		LinkedList<Ingridient> temp = basicPizzaIngridients();
		temp.add(doubleIngridiens(Menu.getMozarelaPI()));
		temp.add(Menu.getPeperoniPP());
		temp.add(doubleIngridiens(Menu.getPeperoniPP()));

		return temp;

	}

	void changePrice(double priceAddition) {
		this.setPrice(this.getPrice() + priceAddition);
	}

	static LinkedList<Ingridient> basicPizzaIngridients() {
		LinkedList<Ingridient> basic = new LinkedList<Ingridient>();
		basic.add(Menu.getTomatoSausePP());
		basic.add(Menu.getMozarelaPI());
		return basic;
	}

	CustomFood modifyPlus(Ingridient sustavka) {

		return (this.addIngridients(sustavka));

	}

	CustomFood addIngridients(Ingridient sustavka) {
		this.inridients = this.addPizzaSustavki(sustavka);
		if (this.size.equals(PIZZA_S)) {
			this.setPrice(this.getPrice() + 1.50);
		}
		if (this.size.equals(PIZZA_M)) {
			this.setPrice(this.getPrice() + 2);
		}
		if (this.size.equals(PIZZA_L)) {
			this.setPrice(this.getPrice() + 2.50);
		}
		return this;
	}

	LinkedList<Ingridient> addPizzaSustavki(Ingridient ingridient) {
		if (ingridient != null) {
			this.inridients.add(ingridient);
		}
		return this.inridients;
	}

	CustomFood modifyMinus(Ingridient sustavka) {

		return (this.removeIngridients(sustavka));

	}

	CustomFood removeIngridients(Ingridient sustavka) {
		if (containsSustavka(sustavka)) {
			this.inridients = this.removePizzaSustavki(sustavka);
			if (this.size.equals(PIZZA_S)) {
				this.setPrice(this.getPrice() - 1.50);
			}
			if (this.size.equals(PIZZA_M)) {
				this.setPrice(this.getPrice() - 2);
			}
			if (this.size.equals(PIZZA_L)) {
				this.setPrice(this.getPrice() - 2.50);
			}
		}
		return this;
	}

	LinkedList<Ingridient> removePizzaSustavki(Ingridient ingridient) {
		if (containsSustavka(ingridient)) {
			if (ingridient != null) {
				this.inridients.remove(ingridient);
			}
		}
		return this.inridients;
	}

	boolean containsSustavka(Ingridient ingrid) {
		if (this.inridients.contains(ingrid)) {
			return true;
		}
		return false;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public LinkedList<Ingridient> getInridients() {
		return inridients;
	}

	public void setInridients(LinkedList<Ingridient> inridients) {
		this.inridients = inridients;
	}

	// public String getDebelinaNaTestoto() {
	// return debelinaNaTestoto;
	// }
	//
	// public void setDebelinaNaTestoto(String debelinaNaTestoto) {
	// this.debelinaNaTestoto = debelinaNaTestoto;
	// }

	// int setIngridiens(String name) {
	// if (name.equals(Menu.PIZZA_PEPERONI)) {
	// setIngridiensPeperoni();
	// return 9.90;
	//
	//
	// }
	// if (name.equals(Menu.PIZZA_GARDEN_KLASIK)) {
	// setIngridiensGerdenClasic();
	// return 7.90;
	// }
	// // trtjabva da se dopishe s vsi4ki pizi
	//
	// }
	//
	// // I taka za vsichki pizzi - start
	// void setIngridiensGerdenClasic() {
	// setIngridiensBasicPizza();
	// inridiens.add(Menu.getOlivesAll());
	// inridiens.add(Menu.getGreenPeppersALL());
	// inridiens.add(Menu.getOnion_SP());
	// inridiens.add(Menu.getFreshTomatosALL());
	// inridiens.add(Menu.getMushroomsPP());
	// }
	//
	// void setIngridiensPeperoni() {
	// setIngridiensBasicPizza();
	// inridiens.add(super.doubleIngridiens(Menu.getMozarelaPI()));
	// inridiens.add(Menu.getPeperoniPP());
	// inridiens.add(super.doubleIngridiens(Menu.getPeperoniPP()));
	//
	// }
	// // I taka za vsichki pizzi - end
	//
	// void setIngridiensBasicPizza() {
	// this.inridiens.add(Menu.getTomatoSausePP());
	// this.inridiens.add(Menu.getMozarelaPI());
	// }

}
