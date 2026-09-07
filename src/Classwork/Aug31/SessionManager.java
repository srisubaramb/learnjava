package Classwork.Aug31;

import java.io.*;

//the Class MUST implements Serializable to be save to disk
class ShoppingCard implements Serializable{
    //SerialversioUID ensures vesrion compatability during deserialization
    private static final long serialVersionUID = 1L;

    private String customerId;
    private int itemCount;
    private double totalAmount;
    public ShoppingCard(String customerId, int itemCount, double totalAmount){
        this.customerId = customerId;
        this.itemCount = itemCount;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString(){
        return String.format(
                "Cart [Customer:  %s , Items : %d , Total : $%.2f]" , customerId , itemCount,totalAmount
        );
    }
}
public class SessionManager {
    public static void main(String[] args) {
        String filePath = "src/user_session.ser";
        ShoppingCard savedCart = new ShoppingCard("CUST-9090" , 2 , 234.9);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){
            out.writeObject(savedCart);
            System.out.println("Object is serialized and saved in disk");
        } catch(IOException e) {
            e.printStackTrace();
        }
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            ShoppingCard loadedCart = (ShoppingCard) in.readObject();
            System.out.println("Loaded deserialized object from the disk " + loadedCart);
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
