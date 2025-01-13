package model;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
public class DrindkItem extends MenuItem{
    private List<String> ingredients = new ArrayList<>();
    private String size;
    public DrindkItem(String name,float price,String description,List<String > ingredients,String size) {
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
        for (String eachIngrdient : ingredients){
            System.out.println("Drink ingrdient : "+eachIngrdient);
        }
        System.out.println("Drink size : "+this.size);
    }
}
