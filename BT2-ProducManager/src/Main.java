import Model.Product;
import storage.ProductFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Product> list = ProductManager.listPM;

    public static void main(String[] args) {
//        ProductFile.writeFile("BT2-ProducManager/Product.dat",list);
        System.out.println(list.toString());
    }


}
