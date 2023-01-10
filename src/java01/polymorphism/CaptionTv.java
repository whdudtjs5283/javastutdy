package java01.polymorphism;

public class CaptionTv extends Tv {

    String text;    // 캡션 보여줄 문자열

    void caption() {
        System.out.println("caption : " + this.text);
    }

}
