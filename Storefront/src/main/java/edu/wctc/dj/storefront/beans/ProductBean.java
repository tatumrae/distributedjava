package edu.wctc.dj.storefront.beans;

import edu.wctc.dj.storefront.model.Product;
import edu.wctc.dj.storefront.model.ProductService;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author tatum
 */
@Named(value = "productBean")
@SessionScoped
public class ProductBean implements Serializable {
    
    private final ProductService productService = new ProductService();
    private Product product;
    private List<Product> productList;

    public ProductBean() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    public String showProductDetail(Product product) {
        this.product = product;
        return "productDetail";
    }
    
    public String allProducts() {
        productList = productService.getAllProducts();
        return "productList";
    }
}
