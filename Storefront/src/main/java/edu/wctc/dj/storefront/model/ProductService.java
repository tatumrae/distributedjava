package edu.wctc.dj.storefront.model;

import edu.wctc.dj.storefront.data.ConnectionUtil;
import edu.wctc.dj.storefront.data.ProductDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ProductService {

private ProductDAO productDao = new ProductDAO();

    public Product getProduct(String id) throws Exception {
        return productDao.getProduct(id);
    }

    public List<Product> getAllProducts() throws Exception {
        return productDao.getProducts();
    }

    public List<Product> findProducts(String query) throws Exception {
        return productDao.searchProducts(query);
    }
}