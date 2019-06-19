<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("ValidMem")!=null) {%>
	<jsp.forward page="main.jsp"></jsp.forward>
<% } %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" cont ent="text/html; charset=UTF-8">
<title>Inser title here</title>

<!-- jQuery CDN -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- Bootstrap -->
<link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>

</head>
<body>
<div class="container">
	<div class="row"></div>
	<form name="frmLogin" onsubmit="return validate();" method="POST" action="loginOK.jsp" encType="UTF-8">
	<div class="form-group">
		<label for="formID">아이디</label>
		<input placeHolder="아이디" type="text" id="formID" name="user_id" value="<% if(session.getAttribute("id") != null) out.println(session.getAttribute("id")); %>" class="form-control">
	</div>
	<div class="form-group">
		<label for="formPW">비밀번호</label>
		<input placeHolder="비밀번호" type="password" id="formPW" name="user_pw" class="form-control">
	</div>
	
	<div class="form-group"><input type="submit" value="로그인" class="btn btn-primary"></div>
	<div class="form-group"><input type="button" value="회원가입" class="btn btn-primary" onclick="javascript:window.location='register.jsp'"></div>
	</form>
</div>
</body>
</html>