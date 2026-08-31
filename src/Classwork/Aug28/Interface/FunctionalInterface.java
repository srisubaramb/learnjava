package Classwork.Aug28.Interface;

import java.util.ArrayList;
import java.util.List;

interface PayOut{
    void checkOut(int amount);
//    void checkIn(); getting error since it is implement as function interface using lambda
}
interface  Products{
    List<String> products = new ArrayList<>();
    void deleteProduct(String name);
    void addProduct(String name);
    void getProducts();
}

public class FunctionalInterface implements  Products{
    @Override
    public  void deleteProduct(String name){
        boolean removed = products.remove(name);
        System.out.printf("\nThe given product is removed %s : %s" , name , removed);
    }
    @Override
    public void addProduct(String name){
        boolean added = products.add(name);
        System.out.printf("\nThe given product is added %s : %s" , name , added);
    }
    @Override
    public void getProducts(){
        System.out.println("Products : " + products);
    }
    public static void main(String[] args) {
        PayOut byCreditCard = (amount)-> {
            System.out.printf("Checking out using Credit card with amount of  %d"  , amount);
        };
        PayOut byWallet = (amount)-> {
            System.out.printf("\nChecking out using Wallet with amount of  %d"  , amount);
        };
        byCreditCard.checkOut(45);
        byWallet.checkOut(75);
        FunctionalInterface obj = new FunctionalInterface();

        obj.addProduct("Shoe");
        obj.deleteProduct("Shoe");
        obj.addProduct("Chicken Joe");
        obj.getProducts();
    }
}
