package model;

import java.util.ArrayList;
import java.util.List;

public class Retaurant {
    List<MenuItem> menu;
    List<Order>orders;
    public Retaurant(){
        menu=new ArrayList<>();
        orders=new ArrayList<>();
    }
    public void addItem(MenuItem item){
        menu.add(item);
    }
    public void viewMenu(){
        System.out.println("In our retaurant we have");
        for(MenuItem item : menu){
            item.getDetails();
        }
    }
    public void proccessOrder(Order order){
        order.setStatus("Preparing");
        for (Order eachorder : orders){
            eachorder.updatStatus(order.getStatus());
        }
    }
}
