<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

 <!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>게시판</title>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script type="text/javascript" src="/resources/js/list.js"></script>
	<!-- 여기부터 ctrl -->
	<!-- Favicons -->
	  <link href="../resources/img/favicon.png" rel="icon">
	  <link href="../resources/img/apple-touch-icon.png" rel="apple-touch-icon">
	
	  <!-- Google Fonts -->
	  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
	
	  <!-- Vendor CSS Files -->
	  <link href="../resources/vendor/aos/aos.css" rel="stylesheet">
	  <link href="../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	  <link href="../resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
	  <link href="../resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
	  <link href="../resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
	  <link href="../resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
	
</head>
<body> 
	<jsp:include page="../member/header.jsp"></jsp:include>  <!-- include했으니 header.css 선언은 header.jsp에 링크연결 코드 있음 -->

  <!-- ======= main ======= -->
<main> 
<div class="wrapper">
<div id = "notice_contents">
		<form id="searchForm" action="/board/list" method="get">
		<h1 class="title_position">Free Board</h1>
		
			<%-- <select name="type">
				<option value="T">제목</option>
				<option value="C">내용</option>
				<option value="TC">제목+게시글</option>
			</select>
			<input type="text" name="keyword" value="${paging.cri.keyword}">
			<input type="text" name="pageNum" value="${paging.cri.pageNum}">
			<input type="text" name="amount" value="${paging.cri.amount}">
			<input type="button" value="검색">
		 --%>
		
		<table id="notice_table" border="1" class="table table-striped">
			<tr>
				<td class="td_width">No</td> <td>title</td> <td>contents</td><td class="td_width">작성자</td> <td>작성일자</td> <td class="td_width">조회수</td>
			</tr>
			
				<!-- for문 시작 -->
				<c:forEach items="${list}" var="boardlist">
					<tr>
						<td class="td_width">${boardlist.bno}</td>
						
						<td><div class="text-over-cut"><a href="/board/detail?bno=${boardlist.bno}">${boardlist.title}</a></div></td>
						<td><div class="text-over-cut">${boardlist.content}</div></td>
						<td class="td_width">${boardlist.id}</td>
						<td>${boardlist.regdate}</td>
						<td class="td_width">${boardlist.cnt}</td>
					</tr>
				</c:forEach>
				<!-- for문 끝 -->
		</table>
				
		<!-- 페이징 버튼  -->				
		 <div class="page_wrap">
		   <div class="page_nation">
		    
		    <!-- prev(이전)이 true이면 이전버튼 활성화 -->
		     	 <!-- <a class="arrow pprev" href="#"></a>  -->
		       <c:if test="${paging.prev}">
		     	 <a class="arrow prev" href="/board/list?type=${paging.cri.type}&keyword=${paging.cri.keyword}&pageNum=${paging.startPage-1}&amount=${paging.cri.amount}">이전</a>
		      </c:if>
		       
		      <!-- begin(1)이 end(10)될 동안 반복(1일 10일 될 동안 반복) -->
			 <c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="num">
		      	<a href="/board/list?type=${paging.cri.type}&keyword=${paging.cri.keyword}&pageNum=${num}&amount=${paging.cri.amount}" class="active">${num}</a>
		      </c:forEach>
		      
		 	 <!-- next(다음)이 true이면 다음버튼 활성화 -->
		 	  <c:if test="${paging.next}">
		      	<a class="arrow next" href="/board/list?type=${paging.cri.type}&keyword=${paging.cri.keyword}&pageNum=${paging.endPage+1}&amount=${paging.cri.amount}">다음</a>
		      </c:if> 
		     <!--  	<a class="arrow nnext" href="#"></a>  -->
		   </div>
		</div> 
			
 			<input id="boardWrite_btn" type="button" value="글쓰기" onclick="location.href='http://localhost:8080/board/write'">
		</form> 
	</div>
</div>
</main><!-- wrapper -->
<!-- End main -->


	<jsp:include page="../member/footer.jsp"></jsp:include>

		
