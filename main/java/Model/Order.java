package Model;
import Model.Client;
import Model.Product;

public class Order {
    private int id;
    private int clientId;
    private int productId;
    private int quantity;
    private double sum;
    private String dateOrd;

    public Order() {
    }

    public Order(int id, int clientId, int productId, int quantity, double sum, String dateOrd) {
        this.id = id;
        this.clientId = clientId;
        this.productId = productId;
        this.quantity = quantity;
        this.sum = sum;
        this.dateOrd = dateOrd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getDateOrd() {
        return dateOrd;
    }

    public void setDateOrd(String dateOrd) {
        this.dateOrd = dateOrd;
    }
}
