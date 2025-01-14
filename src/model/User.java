package model;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Setter
public class User{
    private int UserId;
    private String name;
    private List <Order> ordersHistory;
    public User(){
        ordersHistory=new ArrayList<>();
    }
    public void placeOrder(Order order){
        ordersHistory.add(order);
    }
    public void viewHistory(){
        for(Order vieworder :ordersHistory){
//            if(ordersHistory.contains(vieworder.getOrderId())){
//                System.out.println("OrderId :"+vieworder.getItems()); this mistake cuz it is ArrayList
                for(MenuItem viewItem : vieworder.getItems()){
                    System.out.println("This the Item that we have in our List");
                    viewItem.getDetails();
                }
                System.out.println("OrderId    :"+vieworder.getOrderId());
                System.out.println("Our status :"+vieworder.getStatus());
                System.out.println("Total amount of ordering : "+vieworder.calcultaionTotal());

//            }else {
//                System.out.println("Don't have stock");
//            }
        }
    }
    public void userDetail(){
        System.out.println("Username who ordered : "+this.name);
        System.out.println("User Id :"+this.UserId);
        System.out.println("This is the product they have prepared ");

    }
}
