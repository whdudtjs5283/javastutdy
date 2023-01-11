package java01.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Product {
   int price;
   String productName;

   void setPrice(int price) {
      this.price = price;
   }

   void setProductName(String productName) {
      this.productName = productName;
   }

   List<Product> productList;
   void chooseProduct() {
      System.out.println("----- choose product -----");
      System.out.println("");
      System.out.println();
   }

   void setProduct() {
      Product product1 = new Product();
      product1.setPrice(100);
      product1.setProductName("맥북");
      this.productList.add(product1);
   }
}
