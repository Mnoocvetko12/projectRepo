package dominos;

import java.util.ArrayList;

public class ShoppingCart {
	private double totalSum;
	private ArrayList<Orderable> poruchka;
//	private static int currentItem;

	ShoppingCart() {
		totalSum = 0;
		poruchka =new ArrayList<Orderable>();
	}

	public void showShoppigCart(){
		for(Orderable item:poruchka){
			System.out.println(item);
		}
		System.out.println("Total sum " + this.totalSum );
	}
	
	public void addItemToShopCart(Orderable itemOrdered) {
		if (itemOrdered != null) {
			this.poruchka.add(itemOrdered);
			this.totalSum += itemOrdered.getPrice();
		}
	}

	public void deleteItemFromShoppingCart(Orderable itemOrdered) {
		if (itemOrdered != null) {
			this.poruchka.remove(itemOrdered);
			this.totalSum -= itemOrdered.getPrice();
		}
	}

	public double getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}

	public ArrayList<Orderable> getPoruchka() {
		return poruchka;
	}

	public void setPoruchka(ArrayList<Orderable> poruchka) {
		this.poruchka = poruchka;
	}

}
