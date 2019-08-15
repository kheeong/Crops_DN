package com.example.user.dn2019;
import android.app.Application;
import java.util.ArrayList;

public class cart_variable extends Application {
    private String type;
    ArrayList<String> cart_item = new ArrayList<>();
    public String gettype(){
        return type;
    }
    public Integer getLen(){
        return cart_item.size();
    }
    public ArrayList<String> getCart(){
        return cart_item;
    }
    public void setCart(ArrayList<String> array){
        cart_item = array;
    }
    public void settype(String string){
        type = string;
    }

}
