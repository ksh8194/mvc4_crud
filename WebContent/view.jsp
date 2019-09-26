<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	document.getElementById("btnUpdate").onclick = function(){
		if(confirm("정말 수정할까요?")){
			f.action = "updateform.m2";
			f.submit();
			
		}
	}
	document.getElementById("btnDelete").onclick = function(){
		if(confirm("정말 수정할까요?")){
			f.action = "updateform.m2";
			f.submit();
			
		}
	}
	document.getElementById("btnList").onclick = function(){
		
			f.action = "list.m2";
			f.submit();
			
		
	}
}
</script>
</head>
<body>
*회원 상세보기*<br>
<table border="1">
	<tr>
		<td>아 이 디</td><td>${user.userid}</td>
		<td>비밀번호</td><td>${user.password}</td>
	</tr>
	<tr>
		<td>사 용 자</td><td>${user.name}</td>
		<td>이 메 일</td><td>${user.email}</td>
	</tr>
	<tr>
	<td colspan="2">
		<button id="btnUpdate">수정</button>
		<button id="btnDelete">삭제</button>
		<button id="btnList">목록보기</button>
	</td>
</table>

<form name="f" method="post">
	<input type="hidden" name="userid" value="${user.userid}">
</form>

</body>
</html>