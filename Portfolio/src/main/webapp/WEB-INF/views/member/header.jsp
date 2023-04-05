<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Favicons -->
  <link href="resources/img/favicon.png" rel="icon">
  <link href="resources/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="resources/vendor/aos/aos.css" rel="stylesheet">
  <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="resources/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">


  <link href="resources/css/header.css" rel="stylesheet">
  
  <!-- 로그인페이지 css 연결 -->
	<link href="resources/css/login.css" rel="stylesheet">
	
	<!-- 회원가입페이지 css 연결  -->
	<link href="resources/css/join.css" rel="stylesheet">

</head>
<body>


 <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-center">
    <div class="container d-flex justify-content-between">

      <div class="logo">
        <h1><a href="home">eonee</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="resources/img/logo.png" alt="" class="img-fluid"></a>-->
      </div>

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto " href="home">Home</a></li>
          <li><a class="nav-link scrollto" href="home#about">About me</a></li>
          <li><a class="nav-link scrollto" href="home#services">Archiving</a></li>
          <li><a class="nav-link scrollto active" href="home#portfolio">Projects</a></li>
          <li><a class="nav-link scrollto " href="home#faq">F.A.Q</a></li>
          <li><a class="nav-link scrollto " href="home#board">Board</a></li>
       <!--    <li><a class="nav-link scrollto" href="#team">Team</a></li> -->
         <!--  <li class="dropdown"><a href="#"><span>Drop Down</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="#">Drop Down 1</a></li>
              <li class="dropdown"><a href="#"><span>Deep Drop Down</span> <i class="bi bi-chevron-right"></i></a>
                <ul>
                  <li><a href="#">Deep Drop Down 1</a></li>
                  <li><a href="#">Deep Drop Down 2</a></li>
                  <li><a href="#">Deep Drop Down 3</a></li>
                  <li><a href="#">Deep Drop Down 4</a></li>
                  <li><a href="#">Deep Drop Down 5</a></li>
                </ul>
              </li>
              <li><a href="#">Drop Down 2</a></li>
              <li><a href="#">Drop Down 3</a></li>
              <li><a href="#">Drop Down 4</a></li>
            </ul>
          </li>
          <li><a class="nav-link scrollto" href="#contact">Contact</a></li>-->
        </ul> 
        <i class="bi bi-list mobile-nav-toggle"></i>
        
        <!-- 로그인 섹션 -->
        <div class="login">
<!--         <input type="text" class="loginInput" />
        <input type="password" class="loginInput" /> -->
        <input type="submit" value="login" class="memberBtn"  onclick="location.href='http://localhost:8082/portfolio/memberlogin'"/>
        <input type="submit" value="join" class="memberBtn"   onclick="location.href='http://localhost:8082/portfolio/memberjoin'"/> 
        </div>
        
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->
  
