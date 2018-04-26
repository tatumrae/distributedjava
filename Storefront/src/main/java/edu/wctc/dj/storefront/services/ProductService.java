package edu.wctc.dj.storefront.services;

import edu.wctc.dj.storefront.data.dao.IProductDAO;
import edu.wctc.dj.storefront.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tatum Thomas
 */

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private IProductDAO productDao;

    public Product getProduct(String id) throws Exception {
        return productDao.findOne(id);
    }

    public List<Product> getAllProducts() throws Exception {
        return productDao.findAll();
    }

    public List<Product> findProducts(String query) throws Exception {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", startsWith().ignoreCase());
        Product product = new Product();
        product.setName(query);
        return productDao.findAll(Example.of(product, matcher));
    }
}