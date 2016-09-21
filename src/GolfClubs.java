import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by brettgrist on 9/20/16.
 */
public class GolfClubs {
    public String price;
    public int quantity;
    public String brand;

    public GolfClubs(String price, int quantity, String brand) {
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public GolfClubs() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}