package edu.wctc.dj.storefront.model;

/**
 *
 * @author Tatum Thomas
 */
public class LineItem {
    private ProductService productService;
    private Product product;
    private int quantity;
    private double totalCost;

    public LineItem(ProductService productService, String productId, int quantity) {
        setProductService(productService);
        setProduct(findProduct(productId));
        setQuantity(quantity);
    }

    public Product findProduct(String productId) {
        return productService.getProduct(productId);
    }

    public final void setProduct(final Product product) {
        if(product == null) {
            throw new IllegalArgumentException("product not found");
        }
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final double getTotalCost() {
        return quantity * product.getPrice();
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public final ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


}
