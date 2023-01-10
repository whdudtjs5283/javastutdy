package java01;

public class Test01 {
    public static void main(String[] args) {

        //#region - String은 주소 값이 변하지 않음
        System.out.println("A" == "A");
        System.out.println("A".equals("A"));

        String a = "A";
        String b = "A";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println("A hash : " + "A".hashCode());
        System.out.println("A hash : " + a.hashCode());
        System.out.println("A hash : " + b.hashCode());
        //#endregion - String은 주소 값이 변하지 않음
    }
}

class A {
    int a = 0;
    public A(int a) {   // 모든 매개변수에는 this가 생략되어 있다.
        a=a;            // this.a=a;
    }
}