package dominos;


import java.util.LinkedList;

public class Pizza extends CustomFood implements Iconstants {
	public static final String CATEGORY_PIZZA = "PIZZA";
	private String size;
//	private String debelinaNaTestoto;
	private LinkedList<Ingridient> inridients;

	public Pizza(String name, String size, LinkedList<Ingridient> inridients) {
		super(name);
		setSize(size);
//		setDebelinaNaTestoto(debelinaNaTestoto);
		this.inridients = inridients;
		setWeightOrVolume(weightOfPizza(size
//				, debelinaNaTestoto
				));

	}

	int weightOfPizza(String size
//			, String debelinaNaTestoto
			) {
		if (size.equals(Menu.PIZZA_SIZE_S)) {
//			if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_SREDNO)) {
//				return 250;
//			}
			return 385;
		}
		if (size.equals(Menu.PIZZA_SIZE_M)) {
//			if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_TUNKO)) {
//				return 335;
//			} else if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_SREDNO)) {
//				return 385;
//			}
			return 570;
		}
		if (size.equals(Menu.PIZZA_SIZE_L)) {
//			if (debelinaNaTestoto.equals(Menu.PIZZA_TESTO_SREDNO)) {
//				return 700;
//			}
		}
		return 800;
	}
	LinkedList<Ingridient> addPizzaSustavki(Ingridient ingridient){
		if(ingridient != null){
		this.inridients.add(ingridient);}
		return this.inridients;
	}
	
	void removePizzaSustavki(Ingridient ingridient){
		if(ingridient != null){
		this.inridients.remove(ingridient);}
		
	}
//	int setIngridiens(String name) {
//		if (name.equals(Menu.PIZZA_PEPERONI)) {
//			setIngridiensPeperoni();
//			return 9.90;
//			
//			
//		}
//		if (name.equals(Menu.PIZZA_GARDEN_KLASIK)) {
//			setIngridiensGerdenClasic();
//			return 7.90;
//		}
//		// trtjabva da se dopishe s vsi4ki pizi
//
//	}
//
//	// I taka za vsichki pizzi - start
//	void setIngridiensGerdenClasic() {
//		setIngridiensBasicPizza();
//		inridiens.add(Menu.getOlivesAll());
//		inridiens.add(Menu.getGreenPeppersALL());
//		inridiens.add(Menu.getOnion_SP());
//		inridiens.add(Menu.getFreshTomatosALL());
//		inridiens.add(Menu.getMushroomsPP());
//	}
//
//	void setIngridiensPeperoni() {
//		setIngridiensBasicPizza();
//		inridiens.add(super.doubleIngridiens(Menu.getMozarelaPI()));
//		inridiens.add(Menu.getPeperoniPP());
//		inridiens.add(super.doubleIngridiens(Menu.getPeperoniPP()));
//
//	}
//	// I taka za vsichki pizzi - end
//
//	void setIngridiensBasicPizza() {
//		this.inridiens.add(Menu.getTomatoSausePP());
//		this.inridiens.add(Menu.getMozarelaPI());
//	}

	LinkedList<Ingridient> basicPizzaIngridients(){
		LinkedList<Ingridient> basic = new LinkedList<Ingridient>();
		basic.add(Menu.getTomatoSausePP());
		basic.add(Menu.getMozarelaPI());
		return basic;
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

//	public String getDebelinaNaTestoto() {
//		return debelinaNaTestoto;
//	}
//
//	public void setDebelinaNaTestoto(String debelinaNaTestoto) {
//		this.debelinaNaTestoto = debelinaNaTestoto;
//	}

	
	
}
