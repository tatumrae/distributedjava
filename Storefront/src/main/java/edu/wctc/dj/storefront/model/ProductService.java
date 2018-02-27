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
            new Product("001", "Donkey Tail", "images/Donkey_Tail_600_400.jpg", "A trailing plant with wiry stems densely covered with short thick leaves. "
                    + "Similar to Burrito except with larger, longer leaves. Silvery lime-green color, sometimes with a yellowish tint. Ideal for "
                    + "hanging baskets. Not frost hardy.", 3.95),
            new Product("002", "Portulacaria Afra Variegata", "images/PORTULACARIA_AFRA_VARIEGATA_600_400.jpg", "Sprawling, slow grower. "
                    + "Easily controlled by container size. Excellent bonsai choice. Light green 3/4\" long leaves with creamy "
                    + "white edges and purplish red stems. Drought tolerant. Tender soft succulent - will not tolerate frost.", 3.95),
            new Product("003", "Parva", "images/Parva_600_400.jpg", "grows in a mat of icy blue rosettes. Bright red spots of color adorn the "
                    + "leaf tips. This is a smaller echeveria variety (in latin, parva means dwarf). For best results plant in full to partial "
                    + "sun. Bicolor bell shaped golden and orange flowers appear in spring and early summer.", 2.95),
            new Product("004", "Echeveria Perle Von Nurnberg", "images/Perle_Von_Nurnberg_600_400.jpg", "Lovely pink color and elegant leaf shape."
                    + " Drought tolerant. Tender soft succulent - will not tolerate frost. Great for weddings.", 3.45),
            new Product("005", "Powder Puff Graptoveria", "images/Powder_Puff_Graptoveria_600_400.jpg", "Echeveria hybrid. Plump gray-green leaves "
                    + "with blushes of pink. Heat and drought tolerant. Moderate growth rate. Not frost hardy. Formerly listed as Pachyphytum sp.", 4.45),
            new Product("006", "Sedevaria Jet Bead", "images/Sedevaria_Jet_Bead_600_400.jpg", "Small pointed leaves with a color range of dark bronze "
                    + "green to black. Short, semi upright stems. Drought and heat tolerant. Nice in containers. Good houseplant with easy care.", 4.45),
            new Product("007", "Zebra Haworthia", "images/Zebra_Haworthia_600_400.jpg", "White ridges formed horizontally across dark green foliage"
                    + " resembles zebra striping. Forms 6 to 8 inch clumps, 3 to 4 inches tall. Great indoor plant on sunny or bright windowsills. "
                    + "Needs good drainage. Heat and drought tolerant. Tender soft succulent - will not tolerate frost.", 3.95),
            new Product("008", "Echeveria Black Prince", "images/black_prince_600_400.jpg", "Beautiful dark green to black rosettes. Drought tolerant. "
                    + "Frost tender succulent.", 3.95),
            new Product("009", "Jelly Bean", "images/jelly_bean_600_400.jpg", "Small bead-like leaves in lovely shades of pale green, pink and cream."
                    + " Grows easily from pieces when they drop onto the soil. Tender soft succulent. Not frost hardy.", 3.95),
            new Product("010", "Panda Ear", "images/panda_ear_600_400.jpg", "Long, fuzzy, felt like, oval shaped leaves. Soft gray with chocolate "
                    + "brown margins and tips. Drought tolerant. Water when dry. Adequate drainage. Will not tolerate frost.", 4.45),
            new Product("011", "String of Pearls", "images/string_of_pearls_600_400.jpg", "Strands of pearl shaped green beads. Trailing habit, "
                    + "excellent in hanging containers. Not frost hardy.", 3.95)
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
        List<Product> theList = new ArrayList<Product>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().startsWith(search)) {
                theList.add(product);
            }
        }
        return theList;
    }
}
