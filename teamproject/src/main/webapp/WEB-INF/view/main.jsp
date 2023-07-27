<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main</title>
</head>
<body>
<h2>${user.name}님 안녕하세요</h2>
<form action="/logout" method="post">
    <button type="submit">로그아웃</button>
</form>
</body>
</html>