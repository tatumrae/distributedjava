package edu.wctc.dj.storefront.data.dao;


import edu.wctc.dj.storefront.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tatum Thomas
 */
public interface IProductDAO extends JpaRepository<Product, String> {

}
