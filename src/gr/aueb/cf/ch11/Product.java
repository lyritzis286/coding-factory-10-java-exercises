package gr.aueb.cf.ch11;

public class Product {
    private double price;
    private String name;
    private String description;
    private long id;
    private int quantity;
    private boolean inStock;

    public Product() {

    }

    public Product(double price, String name, String description, long id, int quantity, boolean inStock) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.id = id;
        this.quantity = quantity;
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
