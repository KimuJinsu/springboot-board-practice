# Spring Boot 게시판 프로젝트

이 프로젝트는 Spring Boot를 이용한 간단한 게시판 웹 애플리케이션입니다. 사용자는 게시글을 작성, 조회, 삭제할 수 있으며, H2 데이터베이스를 사용하여 데이터를 저장합니다.

## 주요 기능
- 게시글 목록 조회
- 게시글 작성
- 게시글 삭제
- H2 데이터베이스 사용
- Thymeleaf 템플릿 엔진을 사용한 UI 구현

## 기술 스택
- **Java 17**
- **Spring Boot 3.3.4**
- **Spring Data JPA**
- **Thymeleaf**
- **H2 Database**

## 프로젝트 구조
```bash
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.myboard
│   │   │       ├── controller
│   │   │       └── domain
│   │   │       └── repository
│   │   └── resources
│   │       ├── templates
│   │       │   └── board
│   │       │       ├── createForm.html
│   │       │       ├── list.html
│   │       └── application.properties
├── pom.xml
└── README.md
```
**API 설명**

간단한 API 문서를 추가하여 프로젝트를 사용하는 사람들에게 어떻게 API를 호출하는지 알려줍니다.

```markdown
## API 엔드포인트

- **게시글 목록 조회**
  - **GET** `/boards`
  - 설명: 등록된 모든 게시글을 조회합니다.

- **게시글 작성**
  - **POST** `/boards`
  - 설명: 새로운 게시글을 작성합니다.
  - 요청 데이터: `title`, `content` (게시글 제목 및 내용)

- **게시글 삭제**
  - **POST** `/boards/{id}/delete`
  - 설명: 특정 ID를 가진 게시글을 삭제합니다.
  - 요청 데이터: `id` (삭제할 게시글의 ID)
```

## 실행 화면

### 게시글 목록
![게시글 목록 화면](images/list.png)

### 게시글 작성
![게시글 작성 화면](images/create.png)

### 게시글 목록
![게시글 작성 화면](images/list2.png)

### 데이터베이스(H2)
![데이터베이스 화면](images/database.png)
