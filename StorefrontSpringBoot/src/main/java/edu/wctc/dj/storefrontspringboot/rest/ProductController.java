package edu.wctc.dj.storefrontspringboot.rest;

import edu.wctc.dj.storefrontspringboot.model.Product;
import edu.wctc.dj.storefrontspringboot.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tatum Thomas
 */

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    
        // Create (i.e. POST)
    @RequestMapping(method = POST, path = "/product")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
    
    // Read (i.e. GET)
    @RequestMapping(method = GET, path = "/product") 
    public List<Product> getProducts() throws Exception {
        List<Product> productList = productService.getAllProducts();
        return productList;
    }
    
    @RequestMapping(method = GET, path = "/product/{id}") 
    public Product getProduct(@PathVariable String id)  {
        Product product = productService.getProduct(id);
        return product;
    }
    
    // Update (i.e. PUT)
    @RequestMapping(method = PUT, path = "/product") 
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
    
    // Delete
    @RequestMapping(method = DELETE, path = "/product/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}
