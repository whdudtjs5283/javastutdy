package java01.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class TvMain {

    public static void main(String[] args) {
        // casting
//        Tv tv = new Tv();
//        CaptionTv c = new CaptionTv();
//
//        tv.power();
//        c.power();
//        System.out.println("===========");
//
//        Tv up = new CaptionTv();
//        up.power();
//        CaptionTv down = (CaptionTv) up;
//        down.power();
//        down.caption();

//        =================================================

//        Tv tv = new Tv();
//        tv.price = 100;
//
//        Computer computer = new Computer();
//        computer.price = 150;
//
//        Audio audio = new Audio();
//        audio.price = 20;
//
//        Buyer buyer = new Buyer();
//        System.out.println(buyer.money);
//        buyer.buy(tv);
//        buyer.buy(computer);

//        =================================================
        // 장바구니
        // 상품1 추가
        Tv tv = new Tv();
        tv.price = 100;
        tv.productName = "티브이";

        // 상품2 추가
        Computer computer = new Computer();
        computer.price = 150;
        computer.productName = "콤퓨타";

        // 상품3 추가
        Audio audio = new Audio();
        audio.price = 20;
        audio.productName = "어우디오";

        // 상품 담기
        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(computer);
        productList.add(audio);

        // 구매자 정보에 구매자 정보, 카트 세팅
        Buyer buyer = new Buyer();
        buyer.setName("조영선");
        buyer.setCart();
        buyer.getCart().setProductList(productList);

        // 주문 정보 세팅
        Order order = new Order();
        System.out.println("----- order -----");
        System.out.println("buy before : " + buyer.money);
        order.setBuyer(buyer);
        order.buyCart();
        order.bill();
        order.refund(tv);
    }
}
