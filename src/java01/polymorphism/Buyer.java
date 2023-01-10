package java01.polymorphism;

import java.util.List;
import java.util.Objects;

public class Buyer {

    int money = 1000;   // 소유금액
    String name;        // 이름
    Cart cart;          // 장바구니

    // 오버로드
//    void buy(Tv tv) {
//        money = money - tv.price;
//        System.out.println(money);
//    }
//
//    void buy(Computer computer) {
//        money = money - computer.price;
//        System.out.println(money);
//    }
//
//    void buy(Audio audio) {
//        money = money - audio.price;
//        System.out.println(money);
//    }

    // ↑ 추상화
//    void buy(Product product) {
//        money = money - product.price;
//        System.out.println(money);
//    }

    void setName(String name) {
        System.out.println("buyer : " + name);
        this.name = name;
    }

    void setCart() {
        if(Objects.isNull(cart)) {
            Cart cart = new Cart();
            this.cart = cart;
        }
    }

    Cart getCart() {
        return this.cart;
    }
}
