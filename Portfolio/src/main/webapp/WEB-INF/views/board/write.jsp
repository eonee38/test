<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ include file = "../member/header.jsp" %>  

<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/resources/js/uploadAjax.js"></script>
<script src="https://cdn.ckeditor.com/ckeditor5/35.1.0/classic/ckeditor.js"></script>

<!--	Favicons
	  <link href="../resources/img/favicon.png" rel="icon">
	  <link href="../resources/img/apple-touch-icon.png" rel="apple-touch-icon">
	
	  Google Fonts
	  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
	
	  Vendor CSS Files
	  <link href="../resources/vendor/aos/aos.css" rel="stylesheet">
	  <link href="../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	  <link href="../resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
	  <link href="../resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
	  <link href="../resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
	  <link href="../resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet"> -->
	


<main>
		<form id="form" class="writeForm" action="/board/write" method="post">
		<label>Title</label><br> 
			<input type="text" name="title" id="title_input"  maxlength="70" class="text_value" placeholder= "필수 입력하세요"><br>

		<label>Contents</label>
		<textarea rows="" cols="" name="content" id="content_area"  maxlength="500" class="text_value"  placeholder= "내용을 입력하세요"></textarea>
		
		  <input type="file" name="uploadFile" multiple >   
		<input type="submit" id="uploadBtn" value="새 글 등록" >
	 	<input type="button" value="목록으로" onclick="location.href='http://localhost:8080/board/list'" > 
		</form>
		
		<div id="uploadResult">
			<ul>
				
			</ul>	
		</div>	

</main>
<script type="text/javascript">

			ClassicEditor
			.create(document.querySelector('#content_area'))
			.catch(error=>{
				console.error(error);
			});

</script>

<%@ include file = "../member/footer.jsp"%> 

 