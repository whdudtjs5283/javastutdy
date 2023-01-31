package java01.annotation;

public class AnnotationMain {

    public static void main(String[] args) {
        deprecated();
        custom();
    }

    @ElapsedTime
    public static void custom() {
        System.out.println("ElapsedTime");
    }

    @Deprecated
    public static void deprecated() {
        System.out.println("@Deprecated : 지원 종료 예정");
    }
}
