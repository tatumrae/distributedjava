package edu.wctc.dj.storefront.model;

/**
 *
 * @author Tatum Thomas
 */
public class LineItem {

    private Product product;
    private int qty;

    public LineItem(Product product, int qty) {
        setProduct(product);
        setQty(qty);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
