import java.util.Scanner;

public class product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor

    public product(int pid , double price , int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;

    }
    //Getters
    public int getPid(){
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


