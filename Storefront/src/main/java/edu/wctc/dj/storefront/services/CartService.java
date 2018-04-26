package edu.wctc.dj.storefront.services;

import edu.wctc.dj.storefront.model.ShoppingCart2;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tatum Thomas
 */

@Service
@Transactional
public class CartService {
    private static final Map<String, ShoppingCart2> contents = new HashMap<>();
    
    public ShoppingCart2 getContents(String sessionId){
        ShoppingCart2 cart = contents.computeIfAbsent(sessionId,
               (String t) -> new ShoppingCart2());
       
       return cart;
    }
    
    public void update(String sessionId, ShoppingCart2 cart) {
        contents.put(sessionId, cart);
    }
    
    public void delete(String sessionId) {
        contents.remove(sessionId);
    }
}
