package edu.wctc.dj.storefrontspringboot.data.dao;


import edu.wctc.dj.storefrontspringboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tatum Thomas
 */
public interface IProductDAO extends JpaRepository<Product, String> {

}
