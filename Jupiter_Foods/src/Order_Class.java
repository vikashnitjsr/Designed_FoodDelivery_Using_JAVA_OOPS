import java.util.*;
public class Order_Class {

	private User user;
	private Restaurant restaurant ;
	ArrayList<Foods>list_item=new ArrayList<>();
	private String Status;
	
	
	
	public Order_Class(User user, Restaurant restaurant,
			ArrayList<Foods> list_item, String status) {
		super();
		this.user = user;
		this.restaurant = restaurant;
		this.list_item = list_item;
		Status = status;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public ArrayList<Foods> getList_item() {
		return list_item;
	}
	public void setList_item(ArrayList<Foods> list_item) {
		this.list_item = list_item;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
}
