### javastutdy
<h1>headline</h1>
2022\. 8\. 4\.
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
<h1>headline</h1>
2022\. 8\. 3\.
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

client <-> WEB
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
