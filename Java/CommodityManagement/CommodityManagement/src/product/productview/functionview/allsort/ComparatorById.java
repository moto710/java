package product.productview.functionview.allsort;

import product.Product;

import java.util.Comparator;

public class ComparatorById implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int)(o1.getId() - o2.getId());
    }
}
