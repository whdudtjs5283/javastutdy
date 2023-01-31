package java01.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Product {
   int price;
   String productName;
   List<Product> productList;

   public Product() {
      productList = new ArrayList<>();
   }
   void setPrice(int price) {
      this.price = price;
   }

   void setProductName(String productName) {
      this.productName = productName;
   }

   List<Product> chooseProduct() {
      System.out.println("----- choose product -----");

      List<Product> chooseProductList = new ArrayList<>();
      chooseProductList.add(productList.get(0));
      System.out.println("add cart 1, 2");
      chooseProductList.add(productList.get(1));

      return chooseProductList;
   }

   List<Product> getProductList() {

      if (Objects.isNull(productList)) {
//         return ;
      }
      System.out.println("----- product list -----");
      for (int i = 0; i < productList.size(); i++) {
         System.out.println((i+1) + " : " + productList.get(i).productName + ", " + productList.get(i).price + "$");
      }
      System.out.println("");
      return productList;
   }

   void setProduct() {

      Tv tv = new Tv();
      tv.price = 100;
      tv.productName = "tvooi";

      // 상품2 추가
      Computer computer = new Computer();
      computer.price = 150;
      computer.productName = "compyuta";

      // 상품3 추가
      Audio audio = new Audio();
      audio.price = 20;
      audio.productName = "auoodio";

      this.productList.add(tv);
      this.productList.add(computer);
      this.productList.add(audio);
   }
}
