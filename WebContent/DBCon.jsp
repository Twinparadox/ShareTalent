<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@  page
    import="java.util.*"
    import ="java.sql.*" %>
<% 
	// null로 초기화 한다.
	Connection conn = null;
	try {
		// 사용하려는 데이터베이스명을 포함한 URL 기술
		String url = "jdbc:mysql://localhost:3306/sharetalent";
		String id = "root";
		String pw = "password"; 
		
		// 데이터베이스와 연동하기 위해 DriverManager에 등록한다.
		Class.forName("com.mysql.jdbc.Driver");
		// DriverManager 객체로부터 Connection 객체를 얻어온다.
		conn=DriverManager.getConnection(url,id,pw);
		// 커넥션이 제대로 연결되면 수행된다.
		out.println("제대로 연결되었습니다.");
		// 예외가 발생하면 예외 상황을 처리한다.
		} catch(Exception e) { e.printStackTrace(); }
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>