package java01.polymorphism;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Order {

    Buyer buyer;

    void refund(Product product) {
        buyer.money = buyer.money + product.price;
        System.out.println("----- refund -----");
        System.out.println("product : " + product.productName);
        System.out.println("+" + product.price + " : " + buyer.money);
    }

    void bill() {
        List<Product> productList = buyer.cart.productList;
        int totalCount = 0;
        System.out.println("----- bill -----");
        for(Product product : productList) {
            totalCount += product.price;
            System.out.println("product : " + product.productName + ", price : " + product.price);
        }
        System.out.println("total count : " + totalCount);
    }

    void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    void buy(Product product) {
        buyer.money = buyer.money - product.price;
    }

    void buyCart() {
        for(Product product : buyer.cart.productList) {
            this.buy(product);
        }
    }
}
