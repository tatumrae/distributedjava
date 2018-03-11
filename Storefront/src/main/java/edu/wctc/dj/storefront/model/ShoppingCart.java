package edu.wctc.dj.storefront.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ShoppingCart {
    ProductService productService = new ProductService();
    private double cartTotal = 0;
    
    private String cartId;
    private List<LineItem> cartItems = Arrays.asList(
            new LineItem(productService.getProduct("001"), 3),
            new LineItem(productService.getProduct("006"), 2),
            new LineItem(productService.getProduct("002"), 1)
    );
    
    public ShoppingCart(String cartId) {
        this.cartId = cartId;
    }
    
    public final void addLineItem(Product product, int qty) {
        LineItem lineItem = new LineItem(product, qty);
        cartItems.add(lineItem);
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public List<LineItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<LineItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getCartTotal() {
        calcCartTotal(cartItems);
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }
    
    public double calcCartTotal(List<LineItem> cartItems) {
        for (LineItem items : cartItems) {
            cartTotal += (items.getProduct().getPrice() * items.getQty());
        }
        return cartTotal;
    }
    
    

    
    
    
}
