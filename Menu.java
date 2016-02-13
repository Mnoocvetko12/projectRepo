package dominos;

import java.util.ArrayList;

public class Menu implements Iconstants{
	private ArrayList<Orderable> orderablesList;
	private ArrayList<Restaurant> restaurantsList;
	
	private static Menu menuEdinstveno = null;

	private Menu() {
		orderablesList = new ArrayList<>();
		restaurantsList = new ArrayList<>();
	}

	public static Menu createMenu() {
		if (menuEdinstveno == null) {
			menuEdinstveno = new Menu();
		}
		return menuEdinstveno;
	}
	public void addOrderable(Orderable orderable) {
		if(orderable != null) {
		orderablesList.add(orderable);
		}
		}
	
	public void addRestaurant(Restaurant restaurant) {
		if(restaurant != null) {
		restaurantsList.add(restaurant);
		}
	}

	public ArrayList<Orderable> getOrderablesList() {
		return orderablesList;
	}

	public ArrayList<Restaurant> getRestaurantsList() {
		return restaurantsList;
	}





	
	

}
