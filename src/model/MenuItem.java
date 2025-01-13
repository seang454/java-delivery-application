package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class MenuItem {
    protected String name;
    protected float price;
    protected String descrption;
    public void getDetails(){
        System.out.println("Item name   : "+name);
        System.out.println("Item price  : "+price);
        System.out.println("Description : "+descrption);
    }
}
