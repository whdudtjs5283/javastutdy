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
        // 장바구니 추가
        Tv tv = new Tv();
        tv.price = 100;

        Computer computer = new Computer();
        computer.price = 150;

        Audio audio = new Audio();
        audio.price = 20;

        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(computer);
        productList.add(audio);

        Buyer buyer = new Buyer();
        buyer.setName("조영선");
        buyer.setCart();
        buyer.getCart().setProductList(productList);
    }
}
