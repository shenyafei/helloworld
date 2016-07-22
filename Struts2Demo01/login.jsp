<%@ page pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>Struts2 Person Login Test</title>
  </head>
  
  <body>
    <form action="UserLogin" method="post">
    	UserName:<input type="text" name="per.username"></input><br>
    	Password:<input type="password" name="per.password"></input><br>
    	<button type="submit" value="Submit">Submit</button>
    </form>
  </body>
</html>
