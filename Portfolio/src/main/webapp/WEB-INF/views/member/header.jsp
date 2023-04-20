<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>eonee's portfolio</title>
<!-- 포트폴리오 -->

<!-- Favicons -->
  <link href="/resources/img/favicon.png" rel="icon">
  <link href="/resources/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="/resources/vendor/aos/aos.css" rel="stylesheet">
  <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="/resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="/resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="/resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="/resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

	<!-- header.css  -->
  <link type="text/css" href="/resources/css/header.css" rel="stylesheet"> 
  
	<!-- footer.css -->
	<link href="/resources/css/footer.css" rel="stylesheet">
	
	<!-- 회원가입페이지 css 연결  -->
	<link href="/resources/css/join.css" rel="stylesheet"> 
	
	<!-- 회원정보 수정 페이지 css 연결 -->
 	<link href="/resources/css/memberInfo.css" rel="stylesheet"> 
	
	
	<!-- 게시글리스트, 상세페이지, 글쓰기 화면 css 연결 -->
 	<link href="/resources/css/list.css" rel="stylesheet" >
	<link href="/resources/css/detail.css" rel="stylesheet" > 
	<link href="/resources/css/write.css" rel="stylesheet" >
	<link href="/resources/css/editPage.css" rel="stylesheet" >
	

	<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
	  
<!-- 게시글 js -->
	<script type="text/javascript" src="/resources/js/list.js"></script>
	


</head>
<body>
  <!-- ======= Header ======= -->
 <header id="header" class="fixed-top d-flex align-items-center">
    <div class="container d-flex justify-content-between">

      <div class="logo">
        <h1><a href="/">eonee</a></h1>
       <!--  <a href="index.html"><img src="resources/img/logo.png" alt="" class="img-fluid"></a> -->
      </div>

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto " href="/">Home</a></li>
          <li><a class="nav-link scrollto" href="/#about">About me</a></li>
          <li><a class="nav-link scrollto" href="/#services">Archiving</a></li>
          <li><a class="nav-link scrollto active" href="/#portfolio">Projects</a></li>
          <li><a class="nav-link scrollto " href="/#faq">F.A.Q</a></li>
          <li><a class="nav-link scrollto " href="/#board">Board</a></li>
        </ul> 
        <i class="bi bi-list mobile-nav-toggle"></i>
        
        <!-- 로그인 섹션 -->
        <div class="login">
        <input type="submit" value="LOGIN" class="memberBtn"   onclick="location.href='http://localhost:8080/memberjoin'"/> 
        </div>
        
      </nav><!-- .navbar -->

    </div> 
  </header><!-- End Header -->
  
