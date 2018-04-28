package edu.wctc.dj.storefrontspringboot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ShoppingCart2 implements Serializable {

    private List<Product> contents = new ArrayList<>();

    public ShoppingCart2() {
    }

    public List<Product> getContents() {
        return contents;
    }

    public void setContents(List<Product> contents) {
        this.contents = contents;
    }

    public int getItemsInCart() {
        return contents.size();
    }

    public void add(Product product) {
        contents.add(product);
    }

    public void remove(Product product) {
        contents.remove(product);
    }

    public void removeAll() {
        contents.clear();
    }
    
    public int getQuantities(Product product) {
        int qty = 0;
        for (Product qtyProduct : contents) {
            if (qtyProduct.equals(product)) {
                qty++;
            }
        }
        return qty;
    }

    public double getCartSubTotal() {
        double cartSubTotal = 0;
        for (Product product : contents) {
            cartSubTotal += (product.getPrice());
        }
        return cartSubTotal;
    }
    
    public double getShippingCost() {
        double shippingCost = 0;
        if (getCartSubTotal() != 0) {
            shippingCost = 6.95;
        } else {
            shippingCost = 0;
        }
        return shippingCost;
    }
    
    public double getCartTotal() {
        double cartTotal = 0;
        cartTotal = (getCartSubTotal() + getShippingCost());
        return cartTotal;
    }
}