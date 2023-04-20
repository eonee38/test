<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<!-- 회원 정보 수정 및 삭제 구현   detail.jsp 참고하기 -->
</head>
<body>

<main>
<form method="post" class="Info_wrap">
	<h3></h3>
	<table class="table_style" border="1">
		<tr>
			<td>아이디</td><td>${detail.id}<input type="hidden" value="${detail.id}" name="id" /></td> <!-- 아이디는 수정 불가하도록 -->
		</tr>
		<tr>
			<td>비밀번호</td><td><input type="password" value="${detail.password}" name="password"/></td>
		</tr>
		<tr>
			<td>비밀번호 중복체크</td><td><input type="password"/></td>
		</tr>
		<tr>
			<td>이름</td><td><input type="text" value="${detail.name}" name="name"/></td>
		</tr>
		<tr>
			<td>생년월일</td><td><input type="text" value="${detail.birthday}" name="birthday"/></td>
		</tr>
		<tr>
			<td>연락처</td><td><input type="text" value="${detail.phone}" name="phone"/></td>
		</tr>
		<tr>
			<td>이메일</td><td><input type="text" value="${detail.email}" name="email"/></td>
		</tr>
		<tr>
			<td>성별</td><td><input type="text" value="${detail.gender}" name="gender"/></td>
		</tr>
	</table>
			
		<div id="btns">  <!-- form태그의 액션은 지워야 함(우선권을 가지고 있어서..) -->
			<input type="submit" value="회원정보 수정" formaction="modify"> 
			<input type="submit" value="삭제" formaction="remove">
		</div>
	
	</form>
	
	<%@ include file = "footer.jsp" %> 
</main>
</body>
</html>