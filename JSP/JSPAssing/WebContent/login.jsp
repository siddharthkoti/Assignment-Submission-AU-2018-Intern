<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css.css" />
<script type="text/javascript" src="js.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manager Login Accolite</title>
</head>
<body>

	<div class="container">
  
  <div class="row" id="pwd-container">
    <div class="col-md-4"></div>
    
    <div class="col-md-4">
      
        <form method="post" name = "form" action="login">
          <img src="http://i.imgur.com/RcmcLv4.png" class="img-responsive" alt="" />
          <br />
          <input type="email" name="email" id  = "email" placeholder="Email"  class="form-control input-lg" value="student@gmail.com" required />
          
          <input type="password" name="password" id="password"  value ="q" class="form-control input-lg"  placeholder="Password" required/>
          
          
          <div class="pwstrength_viewport_progress"></div>
          
          
          <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Sign in</button>
          
          
        </form>
        
        
      </div>
      
      
      

  </div>
  
     
  
  
</div>

</body>
</html>