package java01.polymorphism;

import java.util.List;

public class Order {

    Member member;

    void refund(Product product) {
        member.money = member.money + product.price;
        System.out.println("----- refund -----");
        System.out.println("product : " + product.productName);
        System.out.println("+" + product.price + " : " + member.money);
    }

    void bill() {
        List<Product> productList = member.cart.productList;
        int totalCount = 0;
        System.out.println("----- bill -----");
        for(Product product : productList) {
            totalCount += product.price;
            System.out.println("product : " + product.productName + ", price : " + product.price);
        }
        System.out.println("total count : " + totalCount);
    }

    void setBuyer(Member member) {
        this.member = member;
    }

    void buy(Product product) {
        member.money = member.money - product.price;
    }

    void buyCart() {
        for(Product product : member.cart.productList) {
            this.buy(product);
        }
    }
}
