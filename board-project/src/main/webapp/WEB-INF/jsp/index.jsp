<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인 페이지</title>
    <style>
        body { font-family: sans-serif; margin: 20px; }
        nav { background: #eee; padding: 10px; margin-bottom: 20px; }
        nav a { margin-right: 15px; }
    </style>
</head>
<body>
    <h1>프로젝트 메인</h1>
    <nav>
        <a href="/">홈</a>
        <a href="/echo">Echo 테스트</a>
        <a href="/db-test">DB 연동 테스트</a>
        <a href="/postgresql-test">PostgreSQL 테스트</a>
        <a href="/mysql-test">MySQL 테스트</a>
    </nav>
    <div>
        <p>API URL 파라미터: ${apiUrl != null ? apiUrl : "없음"}</p>
        <p>이 페이지는 Spring Boot와 JSP로 구성되었습니다.</p>
    </div>
</body>
</html>
