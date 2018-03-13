/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.storefront.beans;

import edu.wctc.dj.storefront.model.LineItem;
import edu.wctc.dj.storefront.model.ProductService;
import java.util.Arrays;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author tatum
 */
@Named(value = "shoppingCartBean")
@Dependent
public class ShoppingCartBean {
    
    ProductService productService = new ProductService();
    private double cartTotal = 0;
    
    private String cartId;
    private List<LineItem> cartItems = Arrays.asList(
            new LineItem(productService.getProduct("001"), 3),
            new LineItem(productService.getProduct("006"), 2),
            new LineItem(productService.getProduct("002"), 1)
    );

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
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
