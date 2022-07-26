package storage;

import Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    public static void writeFile(String path, List<Product> list){
        try {
            FileOutputStream fis = new FileOutputStream(path);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(list);
            ois.close();
            fis.close();
        } catch (IOException e){
            System.out.printf(e.getMessage());
        }
    }

    public static List<Product> readFile(String path){
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
            return productList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
