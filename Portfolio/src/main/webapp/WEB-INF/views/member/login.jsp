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
	<div class="wrap">
		<div class="form">
			<form class="loginForm">
				<div class="posit">
					<div class="input">
						ID<input type="text" placeholder="아이디를 입력하세요" name="id" class="inputV" /><br>
						Password<input type="password" placeholder="비밀번호를 입력하세요." name="password" class="inputV"/><br>
					</div>
					<div class="btn">
						<input type="submit" value="로그인하기" class="login_btn"><br>
						<input type="button" value="회원가입" onclick="location.href='http://localhost:8082/join'" class="login_btn">
					</div>
				</div>
			</form>
		</div>
	</div>
</main>

	<%@ include file = "footer.jsp" %>
</body>
</html>