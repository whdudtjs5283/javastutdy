package java01.polymorphism;

import java.util.Objects;
import java.util.Scanner;

public class Member {

    int money = 1000;   // 소유금액
    String name;        // 이름
    String address;     // 주소
    Cart cart;          // 장바구니

    static Scanner sc = new Scanner(System.in);

    String getName() {
        return this.name;
    }

    // ↑ 추상화
//    void buy(Product product) {
//        money = money - product.price;
//        System.out.println(money);
//    }

    boolean loginCheck(String scName) {
        System.out.println("");
        if (!this.name.equals(scName)) {
            System.out.println("----- login fail -----");
            System.out.println("message : do not matched name");
            System.exit(0); // 강제 종료
        }
        System.out.println("----- login success -----");
        return true;
    }

    boolean login() {
        System.out.println("----- login -----");
        System.out.print("name : ");
        return loginCheck(sc.next());
    }

    void join() {
        System.out.println("------ join -----");
        System.out.print("name  : ");
        this.name = sc.next();
//        this.name = "jo";

        System.out.print("address : ");
        this.address = sc.next();
//        this.address = "juso";

        System.out.println("");
        System.out.println("------ join success -----");;
        System.out.println("name    : " + name);
        System.out.println("address : " + address);
        System.out.println("");
    }

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
