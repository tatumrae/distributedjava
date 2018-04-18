/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.dj.storefront.beans;

import edu.wctc.dj.storefront.model.CartService;
import edu.wctc.dj.storefront.model.LineItem;
import edu.wctc.dj.storefront.model.Product;
import edu.wctc.dj.storefront.model.ProductService;
import edu.wctc.dj.storefront.model.ShoppingCart2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author tatum
 */
@Named(value = "shoppingCartBean")
@SessionScoped
public class ShoppingCartBean implements Serializable {

    private final String sessionId;
    private final ShoppingCart2 cart;
    private final CartService shoppingCartService = new CartService();
    private List<Product> productList;

//    ProductService productService = new ProductService();
//    ShoppingCart shoppingCart = new ShoppingCart();
    private double shippingCost = 0;

//    private String cartId;
//    private List<LineItem> cartItems = Arrays.asList(
//            new LineItem(productService.getProduct("001"), 3),
//            new LineItem(productService.getProduct("006"), 2),
//            new LineItem(productService.getProduct("002"), 1)
//    );
    public ShoppingCartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        cart = shoppingCartService.getContents(sessionId);
    }

    public int getItemsInCart() {
        return cart.getItemsInCart();
    }

    public void addToCart(Product product) {
        cart.add(product);

        // only update cart in memory, don't update in service
        shoppingCartService.update(sessionId, cart);
    }
    
    public int getQuantities(Product product) {
        return cart.getQuantities(product);
    }

    public String getContents() {
        productList = cart.getContents().stream().distinct().collect(Collectors.toList());
        return "cart";
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getShippingCost() {
        return cart.getShippingCost();
    }
    
    public double getCartSubTotal() {
        return cart.getCartSubTotal();
    }

    public double getCartTotal() {
        return cart.getCartTotal();
    }

}