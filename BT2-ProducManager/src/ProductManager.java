import Model.Product;
import storage.ProductFile;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public static List<Product> listPM = ProductFile.readFile("BT2-ProducManager/Product.dat");
    static {
//        listPM.add(new Model.Product("BG1","Bot Giat","Abba",20));
    }
    public void addProduct(Product product){
        listPM.add(product);
    }
    public String displayProduct(List<Product> listProduct){
        return listProduct.toString();
    }
}
