package edu.wctc.dj.week12.namesapp12.beans;

import edu.wctc.dj.week12.namesapp12.model.Name;
import edu.wctc.dj.week12.namesapp12.model.ShoppingCart;
import edu.wctc.dj.week12.namesapp12.model.ShoppingCartService;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("shoppingCartBean")
@Scope("session")

//@Named(value = "shoppingCartBean")
//@SessionScoped
public class ShoppingCartBean implements Serializable {

    private final String sessionId;
        private final ShoppingCart cart;
        private final ShoppingCartService shoppingCartService = new ShoppingCartService();

    public ShoppingCartBean() {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            sessionId = facesContext.getExternalContext().getSessionId(true);
            cart = shoppingCartService.getContents(sessionId);
        }
        
    public int getItemsInCart() {
        return cart.getItemsInCart();
    }
    
    public void addToCart(Name name) {
        cart.add(name);
        
        // only update cart in memory, don't update in service
        shoppingCartService.update(sessionId, cart);
    }
    
}
