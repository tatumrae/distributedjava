/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.storefront.beans;

import edu.wctc.dj.storefront.model.LineItem;
import edu.wctc.dj.storefront.model.ProductService;
import edu.wctc.dj.storefront.model.ShoppingCart;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author tatum
 */
@Named(value = "shoppingCartBean")
@SessionScoped
public class ShoppingCartBean implements Serializable {
    
    ProductService productService = new ProductService();
    ShoppingCart shoppingCart = new ShoppingCart();
    private double shippingCost = 0;
    
    private String cartId;
    private List<LineItem> cartItems = Arrays.asList(
            new LineItem(productService.getProduct("001"), 3),
            new LineItem(productService.getProduct("006"), 2),
            new LineItem(productService.getProduct("002"), 1)
    );
    @PostConstruct
    public void getCartTotals() {
        shoppingCart.calcCartTotals(cartItems);
    }
    
    public double getCartSubTotal() {
        return shoppingCart.getCartSubTotal();
    }
    
    public double getShippingCost() {
        return shoppingCart.getShippingCost();
    }

    public double getCartTotal() {
        return shoppingCart.getCartTotal();
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

    /**
     * Creates a new instance of ShoppingCartBean
     */
    public ShoppingCartBean() {
    }
    
}
