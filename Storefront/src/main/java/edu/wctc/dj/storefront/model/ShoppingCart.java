package edu.wctc.dj.storefront.model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ShoppingCart {
    
    public ShoppingCart() {
        
    }
    
    
    private List<LineItem> lineItemList = Arrays.asList(
            new LineItem(ProductService productService, String productId, int quantity)
            );
}
