<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- jQuery CDN -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- Bootstrap -->
<link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>

<title>Insert title here</title>
</head>
<body>
<%
	String userID = null;
	if(session.getAttribute("userID")!=null) {
		userID = (String)session.getAttribute("userID");
	}
%>


</body>
</html>