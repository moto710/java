package product.productview.functionview.allsearchproductsview;

import product.productmanagement.ProductManagement;
import product.productview.ProductTemplate;
import java.lang.NumberFormatException;



public class SearchProductByIdView extends ProductTemplate {
    public SearchProductByIdView() {

    }

    @Override
    protected void showBody() {
        boolean flag = false;
        int id;

        do {
            try {
                System.out.println("Enter product's ID to search:");
                id = Integer.parseInt(scanner.nextLine());
                if (ProductManagement.searchId(id) == null) {
                    System.out.printf("Product with ID \"%s\" does not exist!!!\n", id);
                    break;
                }else {
                    System.out.println(ProductManagement.searchId(id));
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Invalid input, re-enter!");
                flag = true;
            }
        } while (flag);
    }
}
