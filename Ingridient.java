package dominos;

public class Ingridient {
	private String name;
	private double priceOfIngridien;

	public Ingridient(String name, double priceOfIngridien) {

		this.name = name;
		this.priceOfIngridien = priceOfIngridien;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public double getPriceOfIngridien() {
		return priceOfIngridien;
	}

	public void setPriceOfIngridien(double priceOfIngridien) {
		if (priceOfIngridien > 0) {
			this.priceOfIngridien = priceOfIngridien;
		}
	}

}