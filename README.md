# Designed_Swiggy_JAVA_-OOPS
### To Execute this swiggy design : 
*    clone this repos
*    Execute Home.java file 

### These are the java classes used in this project:

[User.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/User.java) 
> This class contains user name, mobileNo , Address

[Restaurant.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/Restaurant.java)
> This class contains Resturant_ID, Resturant_Name , Resturant_address ,Order_Limit_of_Resturant.

[Order_Class.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/Order_Class.java)
> Order_Class contains all information about order like : User , Resturants, Order_Status , Food.

[Address.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/Address.java)
> Address.java class contains Adress, State , City , Phone_Number , PIN of the resturant.

[Foods.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/Foods.java)
> Foods.java contains all information about food_id, food_name , price, Cuisine;

[Foods_In_Restaurant.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/Foods_In_Restaurant.java)
> Foods_In_Restaurant.java class maintains the list of resturants in which a particular foods is available.

[Home.java](https://github.com/vikashnitjsr/Designed_Swiggy_Using_JAVA_OOPS/blob/main/Jupiter_Foods/src/Home.java)

### This Home.java class uses all above classes and  provides all required services like Swiggy.
###  important functionalities of a Home.java class 
*      A restaurant can register itself with the system and a user can create, update, delete, get her profile.
*      Users can search for the restaurant using the restaurant name.
*      Restaurants can add, update food-menu.
*      Users can see the food-menu and place an order to get the food items based on cuisine type.
*      Moreover, the following constraint exists: A restaurant has a fixed capacity of processing
       “n” orders at a time. It cannot accept more than “n” orders at a time. Value of “n” varies  for different restaurants
