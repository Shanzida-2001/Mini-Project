
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MiniProject {

    public static void main(String[] args) {

    }
}

class Garment {

    public String id;
    public String name;
    public String description;
    public String size;
    public String color;
    public double price;
    public int stockQuantity;

    void updateStock(int quantity) {
        this.stockQuantity = quantity;
    }

    double calculateDiscountPrice(double discountPercentage) {
        double discount = price * (discountPercentage / 100);
        return discount;
    }
}

class Fabric {

    public String id;
    public String type;
    public String color;
    public double pricePerMeter;

    double calculateCost(double meters) {
        double newPrice = pricePerMeter * meters;
        return newPrice;
    }
}

class Supplier {

    public String id;
    public String name;
    public String contactInfo;
    //List
    List<Fabric> suppliedFabric = new ArrayList<>();

    void addFabric(Fabric fabric) {
        suppliedFabric.add(fabric);
    }

    List<Fabric> getSuppliedFabrics() {
        return suppliedFabric;
    }
}

class Order {

    public String orderId;
    public Date orderDate;
    public List<Garment> garments = new ArrayList<>();
    private double totalAmount;
}

class Customer {

    public String customerId;
    public String name;
    public String email;
    public String phone;

}

class Inventory {

}
