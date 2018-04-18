package edu.wctc.dj.storefront.data;

import edu.wctc.dj.storefront.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ProductDAO {

    public List<Product> getProducts() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from PRODUCT");
            rs = stmt.executeQuery();

            List<Product> productList = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String imageURL = rs.getString("imageURL");
                String description = rs.getString("description");
                double price = Double.parseDouble(rs.getString("price"));

                Product product = new Product(id, name, imageURL, description, price);

                productList.add(product);
            }
            return productList;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public Product getProduct(String id) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from PRODUCT where id = ?");
            stmt.setString(1, id);
            rs = stmt.executeQuery();

            Product product = null;
            if (rs.next()) {
                String name = rs.getString("firstname");
                String imageURL = rs.getString("lastname");
                String description = rs.getString("description");
                double price = Double.parseDouble(rs.getString("price"));

                product = new Product(id, name, imageURL, description, price);
            }
            return product;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public List<Product> searchProducts(String query) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from PRODUCT like '%" + query + "%'");
            rs = stmt.executeQuery();

            List<Product> productList = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("firstname");
                String imageURL = rs.getString("lastname");
                String description = rs.getString("description");
                double price = Double.parseDouble(rs.getString("price"));

                Product product = new Product(id, name, imageURL, description, price);

                productList.add(product);
            }
            return productList;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
