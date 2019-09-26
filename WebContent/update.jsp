<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="logincheck.jsp" %>
**사용자 수정**<br>
<form name="f" method="post">
아이디 : ${user.userid}

</form>
</body>
</html>