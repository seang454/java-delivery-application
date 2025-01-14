import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          MenuItem [] foodItem = new MenuItem[2];
        MenuItem foodItem1 = new FoodItem("Coca",2000,"American Product",List.of("sugar","water","Cafein","Cacao"),"small");
        MenuItem foodItem2 = new FoodItem("Pepsi",2500,"American Product",List.of("sugar","water","Caffein","Cacao","carbon Hydra"),"Large");
        MenuItem drinkItem1 =new DrindkItem("chiken fried",8000,"Mecdonal is the American fast food brand",List.of("Chicke","oil","flour","salt","sugar","water"),"medium");
        MenuItem drinkItem2 =new DrindkItem("Hamburger",10000,"CFC is the American fast food brand",List.of("bread","meat","omelet","vegetable"),"large");
        Order order = new Order();
        order.setOrderId(23131);
        order.setStatus("Pending");
        order.addItem(foodItem1);
        order.addItem(foodItem2);
        order.addItem(drinkItem1);
        order.addItem(drinkItem2);

        User user = new User();
        user.setName("ផោរ​កន្រ្តក");
        user.setUserId(1234);
        user.placeOrder(order);
        user.userDetail();
        user.viewHistory();

        System.out.println("=".repeat(20));
        System.out.println("In our restaurant we have ");
        Retaurant restaurant = new Retaurant();
        restaurant.addItem(foodItem1);
        restaurant.addItem(foodItem2);
        restaurant.addItem(drinkItem1);
        restaurant.addItem(drinkItem2);
        restaurant.proccessOrder(order);
        restaurant.viewMenu();
    }
}