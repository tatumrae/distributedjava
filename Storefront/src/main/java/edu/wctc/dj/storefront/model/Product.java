package edu.wctc.dj.storefront.model;

/**
 *
 * @author Tatum Thomas
 */
public class Product {
    private String id;
    private String name;
    private String imageURL;
    private String description;
    private double price;

    public Product(String id, String name, String imageURL, String description, double price) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
