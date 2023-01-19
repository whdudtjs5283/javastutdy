package java01.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public void setCart(List<Product> productList) {
        System.out.println("----- add cart -----");

        List<Product> chooseProductList = new ArrayList<>();
        chooseProductList.add(productList.get(0));
        System.out.println("add cart 1, 2");
        chooseProductList.add(productList.get(1));

        this.productList = productList;
    }

    public List<Product> getCart() {
        return this.productList;
    }


}
