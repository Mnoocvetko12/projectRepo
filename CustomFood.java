package dominos;

public abstract class CustomFood extends Orderable {



	public CustomFood(String name) {
		super(name);
	}

	static Ingridient doubleIngridiens(Ingridient ingridient) {
		StringBuilder temp = new StringBuilder("Dopulnitelno ");
		return new Ingridient((temp.append(ingridient.getName()).toString()), ingridient.getPriceOfIngridien()*2);
	}
	void addIngridients(Ingridient sustavka){
		
		
	}

}
