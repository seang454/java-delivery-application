package model;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
public class FoodItem extends MenuItem {
    private List<String> ingredients;
    private String size;

    public FoodItem(String name,float price,String description,List<String > ingredients,String size) {
        super(name,price,description);
        this.size=size;
        this.ingredients=ingredients;
    }
    @Override
    public void getDetails(){
        System.out.println("=".repeat(20));
        System.out.println("This is our all food item which we have ");
        System.out.println("=".repeat(20));
        super.getDetails();
        for (String eachIngredient : ingredients){
            System.out.println("FoodIngredients : "+eachIngredient);
        }
        System.out.println("Food Size : "+ this.size);
    }
}
