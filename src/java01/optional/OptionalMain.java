package java01.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        OptionalTestVO obj1 = new OptionalTestVO("조영선", 30);
        Optional<OptionalTestVO> op1 = Optional.of(obj1);
        // null point exception
        Optional<OptionalTestVO> op2 = Optional.ofNullable(null);
//        Optional<OptionalTestVO> op3 = Optional.of(null);
        // null 초기화 보다는 empty 초기화가 바람직하다
        Optional<OptionalTestVO> op4 = Optional.<OptionalTestVO>empty();

        System.out.println(op1);
        System.out.println(op2);
        // null point exception
//        System.out.println(op3);
        System.out.println(op4);

        // TODO 2 객체의 값 가져오기
        Optional<String> optVal1 = Optional.of("abc");
        // Optional 에 저장된 값 반환, null 시 예외 발생
        String str1 = optVal1.get();

        // null 일 경우 "" 리턴
        Optional<String> optVal2 = Optional.of(null);
//        String str2 = optVal2.get();

        // null 일 경우 "" 리턴
        Optional<String> optVal3 = Optional.of(null);
        String str2 = optVal3.get();


        // TODO 3 Optional 도 Stream 과 같이 filter(), map(), flatMap() 사용 가능
        int result1 = Optional.of("123")
                .filter(o -> o.length() > 0)
                .map(Integer::parseInt) // parseInt 는 예외가 발생하기 쉬운 메소드이므로 예외 처리된 메소드를 만든다.
                .orElse(-1);
        System.out.println(result1);

        int result2 = Optional.of("")
                .filter(o -> o.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);
        System.out.println(result2);


        // TODO 4 isPresent()는 Optional 객체의 값이 null 이면 false 를, 아니면 true 를 반환
        Optional<String> optPre1 = Optional.of("abc");
        Optional<String> optPre2 = Optional.ofNullable(null);
        String strPre1 = optPre1.get();
        String strPre2 = optPre2.get();


        if (optPre1.isPresent() == false) {
            System.out.println("OptPre1 not null");
        }
        // 간략 코드 변환
        // ifPresent(Consumer<T>)
        Optional.ofNullable("abc").ifPresent(System.out::println);

        if (optPre2.isPresent() == false) {
            System.out.println("OptPre2 null");
        }

        // TODO 5 ifPresent(Consumer) 는 Optional<T> 를 반환하는 findAny(),
    }
}
