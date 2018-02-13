package edu.wctc.dj.storefront.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class ProductService {

    private List<Product> productList = Arrays.asList(
            new Product("001", "Donkey Tail"),
            new Product("002", "Portulacaria Afra Variegata"),
            new Product("003", "Parva"),
            new Product("004", "Echeveria Perle Von Nurnberg"),
            new Product("005", "Powder Puff Graptoveria"),
            new Product("006", "Sedevaria Jet Bead"),
            new Product("007", "Zebra Haworthia"),
            new Product("008", "Echeveria Black Prince"),
            new Product("009", "Jelly Bean"),
            new Product("010", "Panda Ear"),
            new Product("011", "String of Pearls")
    );

    public Product getProduct(String id) {

        Product theProduct = null;
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                theProduct = product;
            }
        }
        return theProduct;
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public List<Product> findProducts(String search) {
        search = search.toLowerCase();
        List<Product> theList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().startsWith(search)) {
                theList.add(product);
            }
        }
        return theList;
    }
}
