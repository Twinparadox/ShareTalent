<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.Timestamp"
    import="sharetalent.*"
    import = "java.sql.*"
    import = "java.util.Date"
    import = "java.text.SimpleDateFormat"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="sharetalent.MemberDTO"/>
<jsp:setProperty name="dto" property="*"/>
<%
	dto.setRegisterDate(new Timestamp(System.currentTimeMillis()));
	MemberDAO dao = MemberDAO.getInstance();
	if(dao.confirmId(dto.getId()) == MemberDAO.MEMBER_EXISTENT) {
%>
<script>
alert("아이디가 이미 존재합니다.");
history.back();
</script>
<%
	} else {
		int result = dao.insertMember(dto);
		if(result == MemberDAO.MEMBER_REGISTER_SUCCESS) {
			session.setAttribute("id",dto.getId());
%>
<script>
	alert("가입을 환영합니다.");
	document.location.href="login.jsp";
</script>
<% 
	} else {
%>
<script>
	alsert("가입에 실패헀습니다.\n일시적인 오류일 수 있습니다.");
	document.location
</script>
<%
	}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty name="dto" property="accountBank"/>
</body>
</html>