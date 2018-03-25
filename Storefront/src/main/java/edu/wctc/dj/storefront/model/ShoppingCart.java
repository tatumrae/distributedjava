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
    private double cartSubTotal = 0;
    private double cartTotal = 0;
    private double shippingCost = 0;
    
    private String cartId;
    private List<LineItem> cartItems = Arrays.asList(
            new LineItem(productService.getProduct("001"), 3),
            new LineItem(productService.getProduct("006"), 2),
            new LineItem(productService.getProduct("002"), 1)
    );
    
    
    public ShoppingCart() {
        cartId = "1234";
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
