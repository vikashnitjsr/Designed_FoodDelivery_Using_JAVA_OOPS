import java.util.*;
public class Foods_In_Restaurant {
	private Foods food;
	ArrayList<Restaurant>FoodInRestaurant=new ArrayList<>();
	
	
	
	public Foods_In_Restaurant(Foods food) {
		super();
		this.food = food;
	}
	public Foods getFood() {
		return food;
	}
	public void setFood(Foods food) {
		this.food = food;
	}
	public ArrayList<Restaurant> getFoodInRestaurant() {
		return FoodInRestaurant;
	}
	public void setFoodInRestaurant(ArrayList<Restaurant> foodInRestaurant) {
		FoodInRestaurant = foodInRestaurant;
	}

	
}
