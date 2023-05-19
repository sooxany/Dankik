<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="EUC-KR">
    <title>SignUp</title><link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Wix+Madefor+Text:ital,wght@1,600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="signUp.css">
    <script src="login.js" defer></script>
  </head>

  <body>
    <div class="window">
        <div class="logo-container">
         <img src="dankik_logo.jpg" alt="로고 이미지">
         </div>
      <div class="form-wrapper">
	    <div class="form signUp">
        <div class="form-header">
          <div class="show-signup">Sign Up</div>
        </div>
        <div class="form-elements">
          <div class="form-arrow">
            <input type="text" placeholder="ID">
          </div>
          <div class="form-arrow">
            <input type="password" placeholder="Password">
          </div>
          <div class="form-arrow">
            <button id="submit-btn">Sign Up</button>
          </div>
        </div>
      </div>
    </div>
  </div>
  </body>
</html>