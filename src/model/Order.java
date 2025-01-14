package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Order {
    private int orderId;
    private List <MenuItem> items;
    private String status;
    public Order(){
        items = new ArrayList<>();
    }
    public void addItem(MenuItem items){
       this.items.add(items);
    }
    public void removeItem(String name){
        for (MenuItem item : items){
            if(item.getName()==name){
                items.remove(item.getName());
            }
            else {
                System.out.println("There is not "+name + " in our list");
            }
        }
    }
    public float calcultaionTotal(){
        float price = 0;
        for (MenuItem item:items){
            price += item.getPrice();
        }
        return price;
    }
    public void updatStatus(String status){
        this.status = status;
    }
}
