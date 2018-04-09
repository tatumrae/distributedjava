package edu.wctc.dj.storefront.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tatum Thomas
 */
public class CartService {
    private static final Map<String, ShoppingCart2> contents = new HashMap<>();
    
    public ShoppingCart2 getContents(String sessionId){
        ShoppingCart2 cart = contents.computeIfAbsent(sessionId,
               (String t) -> new ShoppingCart2());
       
       return contents.get(sessionId);
    }
    
    public void update(String sessionId, ShoppingCart2 cart) {
        contents.put(sessionId, cart);
    }
    
    public void delete(String sessionId) {
        contents.remove(sessionId);
    }
}
