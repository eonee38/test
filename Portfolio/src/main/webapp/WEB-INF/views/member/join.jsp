<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file = "header.jsp" %>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link href="resources/css/header.css" rel="stylesheet">

<title>포트폴리오 회원가입 페이지</title>
</head> -->
<main>
<h1>회원가입 해주세요</h1>
<form action="memberjoin" method="post"> <!-- MemberController -->
	<div class= "wrap">
		<div class= "contents">
		 아이디 <input type="text" name="id"><br>
		 비밀번호 <input type="password" name="password"><br>
		 성함 <input type="text" name="name"><br>
		 생년월일 <input type="text" name="birthday"><br>
		 연락처 <input type="text" name="phone"><br>
		 이메일 <input type="text" name="email"><br>
		 성별 <input type="text" name="gender"><br>
		 <input type="submit" value="가입하기">
		</div>
	</div>
</form>	
</main>

	<%@ include file = "footer.jsp" %>
</body>
</html>