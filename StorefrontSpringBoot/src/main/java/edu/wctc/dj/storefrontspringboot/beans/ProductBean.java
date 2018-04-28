package edu.wctc.dj.storefrontspringboot.beans;


import edu.wctc.dj.storefrontspringboot.model.Product;
import edu.wctc.dj.storefrontspringboot.service.ProductService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author tatum
 */
@Component("productBean")
@Scope("session")
public class ProductBean implements Serializable {
    
    @Autowired
    private ProductService productService;
    
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
    
    public String allProducts() throws Exception {
        productList = productService.getAllProducts();
        return "productList";
    }
    
}
