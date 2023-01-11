package java01.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Member member = new Member();
        member.join();   // 회원가입
        member.login();  // 로그인

        Product product = new Product();
        product.setProduct();   // 상품 세팅

        // 장바구니
        // 상품1 추가
//        Tv tv = new Tv();
//        tv.price = 100;
//        tv.productName = "티브이";
//
//        // 상품2 추가
//        Computer computer = new Computer();
//        computer.price = 150;
//        computer.productName = "콤퓨타";
//
//        // 상품3 추가
//        Audio audio = new Audio();
//        audio.price = 20;
//        audio.productName = "어우디오";
//
//        // 상품 담기
//        List<Product> productList = new ArrayList<>();
//        productList.add(tv);
//        productList.add(computer);
//        productList.add(audio);
//
//        // 구매자 정보에 구매자 정보, 카트 세팅
//        member.setName("조영선");
//        member.setCart();
//        member.getCart().setProductList(productList);
//
//        // 주문 정보 세팅
//        Order order = new Order();
//        System.out.println("----- order -----");
//        System.out.println("buy before : " + member.money);
//        order.setBuyer(member);
//        order.buyCart();
//        order.bill();
//        order.refund(tv);
    }
}
