<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ include file = "../member/header.jsp" %> 
    
<!-- <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/resources/js/reply.js"></script> 댓글과 관련한 자바스크립트 : 비동기식
<script type="text/javascript" src="/resources/js/attach.js"></script> -->
 <main>
	<form id="Board_detail" method="GET">
			<label>Title</label><br>
				<input type="text" value="${detail.title}" name="title"  id="title_input"  class="detail_value" maxlength="70">
				<input type="hidden" value="${detail.bno}" name="bno" id="hidden_value" > <!-- hidden 처리해줘야함  -->
				
			<label>Contents</label>
		<!--<textarea rows="" cols="" name="content" id="content_area"  maxlength="300" class="text_value"  placeholder= "내용을 입력하세요"></textarea> -->
			<div class="textarea"> 
			${detail.content}
			<%-- 	<input type="text"  name="content" value="${detail.content}"> --%>
			</div>
			
			<div id="buttonSet">
				<input type="submit" value="수정" formaction="/board/modify">
				<input type="submit" value="삭제" formaction="/board/remove">
				<input type="button" value="목록으로" onclick="location.href='http://localhost:8080/board/list'"></div>
	</form>
	
			<!-- <div id="uploadResult">
			<ul>
				
			</ul>	
			</div>	 -->
</main> 
<!--  <script type="text/javascript">

			ClassicEditor
			.create(document.querySelector('#content_area'))
			.catch(error=>{
				console.error(error);
			});
</script>
	 -->
			<!-- <div><label>댓글</label></div>
			<div>
				<textarea rows="5" cols="50" id="reply"></textarea>
			</div>
			<div>	
				<input type="button" value="댓글쓰기" id="add">
			</div>
			<div id="chat">
				<ul id="replyUL">
				
				$("#replyUL").html(str);  자리 
				
				</ul>
			</div>
			<div id="replyPage"></div> -->

<%@ include file = "../member/footer.jsp" %> 

 