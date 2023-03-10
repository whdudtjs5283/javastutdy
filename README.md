### javastutdy

## 2022. 9. 22
<details>
<summary>JPA queryDsl</summary>

   - gradle setting
      - https://kha0213.github.io/jpa/querydsl-quick-start/
      - 참고 : https://velog.io/@youngerjesus/%EC%9A%B0%EC%95%84%ED%95%9C-%ED%98%95%EC%A0%9C%EB%93%A4%EC%9D%98-Querydsl-%ED%99%9C%EC%9A%A9%EB%B2%95
   - https://jojoldu.tistory.com/372
      - Gradle 5.0 이상 & IntelliJ 2020.x 사용시
</details>

## 2022. 9. 10
<details>
<summary>MYSQL : WITH RECURSIVE CTE AS</summary>

   - WITH : 시작절
   - RECURSIVE : MYSQL 전용 함수
   - CTE : 재귀 쿼리 공용 명칭
</details>

<details>
<summary>form 내 input 데이터 가져오기</summary>

   - $("#form").serialize();
      - input 데이터를 직렬화하여 String화 함
      - contentType: "application/json; charset=utf-8" 사용 불가
      - application/text 사용 필요

   - $("#form").serializeArray();
      - 각 input 데이터를 json Array 형태로 만듬
      - key, value를 추출하여 json 형식으로 변경하면 contentType: "application/json; charset=utf-8" 사용 가능
         * for (var i = 0; i < formArray.length; i++) {
              returnArray[formArray[i]['name']] = formArray[i]['value'];
           }
</details>

## 2022. 9. 6
<details>
<summary>DB : NOW(), SYSDATE, CURRENTDATE</summary>

   - NOW      : 쿼리 시작 시 고정 시간(쿼리 시작시간)
   - SYSDATE  : 함수 호출 시 마다 시간이 변함(쿼리 종료시간)
</details>

<details>
<summary>HTTP 구조</summary>

   - http는 statusless 상태 : 요청, 응답 시 리소스를 잡아먹지 않기 위해
   - request
      1. start-line
         - GET) /uri HTTP 1.1 
      2. header
         - 호출에 필요한 필수 데이터
      3. body
         - 데이터
</details>

## 2022. 9. 1
<details>
<summary>타입 비교</summary>

   - java -> 레퍼런스 타입 -> 주소 -> 메모리
   - object
      - equals : 값 비교
      - == : 주소 비교
</details>

## 2022. 8. 10
<details>
<summary>javascript 선언</summary>

   - var : 어느 위치에 있든 찾을 수 있음
   - let : function 내에서만 사용가능

   - 스크립트 내 패키지 선언
   var com = {
       project : {
           name : {
               common : {}
           }
       }
   };
</details>

<details>
<summary>페이지가 그려질 때</summary>

   - SSR / CSR
     - SSR(SERVER SIDE RANDERING) : JSP
     - CSR : react, vue
</details>

<details>
<summary>이벤트 리스터 뒤에 .으로 id 지정 가능</summary>

   - ex) jQuery("#btnAddName").off("click.add").on("click.add", function(){}
</details>

## 2022. 8. 8
<details>
<summary>VO, DTO, ENTITY</summary>

  - VO : value object
  - DTO : data transfer object
     - view와 컨트롤러 데이터 전송하는 객체
  - entity : DB 다이렉트 (table)
     - DB와 direct 통신하는 객체
     - setter가 없어야 하는 이유 : 데이터가 변조되면 안돼서
        * 사회적 합의라 setter 사용해도 상관 없음
</details>

## 2022. 8. 4
<details>
<summary>비즈니스 CURD 로직 개발 순서</summary>

   - 게시판
      - 저장
      - 조회(전체, 단건)
      - 수정
      - 삭제
</details>
<details>
<summary>어플리케이션  개발 순서</summary>

   - Controller
   - DB
   - Query
   - Repository
   - Service
</details>
<details>
<summary>null check 방식</summary>

   - ObjectUtils
   - CollectionUtils
   - Optional
</details>
<details>
<summary>I/O null check 필수</summary>

   - validation
      - requried check
      - null check
</details>
<details>
<summary>의존성 주입 : DI</summary>

   - Authwired 사용x
   - 생성자 주입 방식
</details>
<details>
<summary>영속성 프레임워크</summary>

   - ORM : jpa
   - Persitence : mybatis
</details>

## 2022. 8. 3.
<details>
<summary>java: 객체지향언어</summary>

   - 캡슐화
      - 접근제어
         - private : 자기만
         - default : 같은 패키지 내
         - protected: 상속까지
         - public : 전체
   - 추상화
      - base를 가져다 씀
   - 다양성
      - 추상화된 것들을 가져다씀
   - 상속성
      - 추상화
</details>
<details>
<summary>spring life cycle : 객체에 대한 생명 주기</summary>

   - IoC : 생성/파괴
      - java가 메모리 할당/삭제 해줌
      - JVM: GC 
      - java는 memory managed language
   - 객체 > new > 메모리 할당 : 객체화, 인스턴스   
   - 어노테이션, 빈, 컨트롤러, 서비스, 레파지토리, 오토와이어드, new
</details>
<details>
<summary>application 영역</summary>

   - client(end-user) > filter > dispatcher servlet > handler mapping > interceptor > controller > view resolver
   - filter : 전처리
      - 언어 : utf-8(인코딩)
      - logging
      - etc.
   - dispatcher servlet
      - 읽고 어디로 보내는지 설정
   - handler mapping
      - dispatcher servlet에서 넘어온 데이터
   - interceptor
      - 컨트롤러 가기 전 다듬기
   - controller
      - mvc: controller > service > repository > DB
      - validation: I/O 시 validation check 필요
         - I/O : application 범위 밖에서 들어오는 것들
            - client, db
         - validation check : required, null
   - view resolver
      - view 보여줌
   - cycle 완료 후 객체 파괴

   - client > 3tier 
      - 3tier : WEB > WAS > DB
      - WAS : spring life cycle
         - cloud : 3tier를 대여(?)해줌
            * NCP

- client <-> WEB
   - http, SSL, https
      - http : header, body
         - hedaer : 요청 정보
         - body : 데이터
      - https : http에 SSL 보안 규격
</details>
<details>
<summary>패키지</summary>

   - resources
      - static : js, css, images
      - template : 화면
      - .properties : 변경점이 거의 없는 애들(코딩 규격 : coding convention)
         - prefix : 앞에다 붙일 애
         - sufix : 뒤에다 붙일 애  .html
         - thymeleaf el : jstl
         - datasource : DB
         - hikari cp
            * cp : connection pool
</details>
<details>
<summary>코딩 규격(coding convention)</summary>

   - 표준화 작업
</details>
<details>
<summary>서버</summary>

   - local, dev, qa, stg, prd(live)
</details>
<details>
<summary>mvc, react</summary>

   - mvc : embeded tomcat
   - react : embeded netty
      - 비동기(논블록킹)
</details>
<details>
<summary>인텔리제이 단축키</summary>

   - new : alt + insert
   - rename : shift + F6
</details>
