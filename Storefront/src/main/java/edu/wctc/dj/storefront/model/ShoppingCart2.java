package edu.wctc.dj.storefront.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ShoppingCart2 implements Serializable{
private final List<Product> contents = new ArrayList<>();
private double cartSubTotal = 0;
    private double cartTotal = 0;
    private double shippingCost = 0;
    
    public ShoppingCart2() {
    }
    
    public List<Product> getContents() {
        return contents;
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
    
    public double getCartSubTotal() {
        return cartSubTotal;
    }

    public void setCartSubTotal(double cartSubTotal) {
        this.cartSubTotal = cartSubTotal;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
        
    private void calcCartSubTotal(List<LineItem> cartItems) {
        for (LineItem items : cartItems) {
            cartSubTotal += (items.getProduct().getPrice() * items.getQty());
        }
        setCartSubTotal(cartSubTotal);
    }
    
    private void calcShippingCost(double cartSubTotal) {
        if (cartSubTotal != 0) {
            setShippingCost(6.95);
        } else {
            setShippingCost(0);
        }
    }
    
    private void calcCartTotal(double subTotal, double shippingCost) {
        setCartTotal(subTotal + shippingCost);
    }
    
    public void calcCartTotals(List<LineItem> cartItems) {
        calcCartSubTotal(cartItems);
        calcShippingCost(getCartSubTotal());
        calcCartTotal(getCartSubTotal(), getShippingCost());
    }
}
