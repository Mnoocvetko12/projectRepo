package dominos;

public abstract class Orderable {
	private double price;
	private String name;
	private String decription;
	private double weightOrVolume;

	Orderable(String name) {
		setName(name);

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public double getWeightOrVolume() {
		return weightOrVolume;
	}

	public void setWeightOrVolume(double weightOrVolume) {
		this.weightOrVolume = weightOrVolume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
