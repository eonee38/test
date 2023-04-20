<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file = "header.jsp" %> 
     

<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포트폴리오 로그인 페이지</title>
</head> -->
 <main>
	<div id="wrap">
		<div class="form">
			<form name="memberLogin_Form" class="loginForm" action="/portfolio/memberlogin" method="post">
					<div class="contents">
						ID<input type="text" placeholder="아이디를 입력하세요" maxlength="10" name="id" class="inputV" id="member_id" onblur="idCheck()" onmousedown="removeIdspan()"/><br>
							<span id="idspan"></span><br>
						Password<input type="password" placeholder="비밀번호를 입력하세요." maxlength="16" name="password" class="inputV" id="member_password" onblur="passCheck()" onmousedown="removePassspan()"/><br>
							<span id="passspan"></span><br>
						
							<input type="submit" value="로그인하기" id="target" class="login_btn" onclick="loginComplete();" ><br> 
							<input type="button" value="회원가입" onclick="location.href='http://localhost:8080/portfolio/memberjoin'" class="login_btn">
					</div>
			</form>
		</div>
	</div>
</main> 


 	<%@ include file = "footer.jsp" %> 
</body>
</html>