<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	var btnLogin = document.getElementById("btnLogin");
	btnLogin.addEventListener("click", loginFunc,false);
	
	document.getElementById("btnInsert").addEventListener("click",insertFunc,false);
}

function loginFunc(){
	//alert("a");
	if(frm.userid.value ===""){
		alert("아이디 입력");
		frm.userid.focus();
		return false;
	}
	if(frm.password.value===""){
		alert("비밀번호입력");
		frm.password.focus();
		return false;
	}
	frm.action = "login.m2";
	frm.submit();
}
function insertFunc(){
	//alert("b");
	frm.action = "insert.jsp";
	frm.submit();
}

</script>
</head>
<body>
*사용자 관리 로그인(WEB MVC)*<br>
<form name="frm" method="post">
아 이 디 : <input type = "text" name="userid"><br>
비밀번호 : <input type = "text" name="password"><br>
<br>
<input type="button" value="로 그 인" id="btnLogin">
<input type="button" value="회원가입" id="btnInsert">
</form>
</body>
</html>