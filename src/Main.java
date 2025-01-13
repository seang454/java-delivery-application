import model.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuItem foodItem1 = new FoodItem("Coca",2000,"American Product",List.of("sugar","water","Cafein","Cacao"),"small");
        MenuItem foodItem2 = new FoodItem("Pepsi",2500,"American Product",List.of("sugar","water","Caffein","Cacao","carbon Hydra"),"Large");
        MenuItem drinkItem1 =new DrindkItem("chiken fried",8000,"Mecdonal is the American fast food brand",List.of(""),"medium");
        MenuItem drinkItem2 =new DrindkItem("Hamburger",10000,"CFC is the American fast food brand",List.of(""),"large");
        Order order = new Order();
        order.addItem(foodItem1);
        order.addItem(foodItem2);
        order.addItem(drinkItem1);
        order.addItem(drinkItem2);

        User user = new User();
        user.placeOrder(order);

        user.viewHistory();
    }
}