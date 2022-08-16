<%-- 
    Document   : login
    Created on : 04-ago-2022, 20:41:35
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Login</title>
    </head>
    <body>
        <h2>Ingrese la contraseña</h2>
  
  <form action="SvLogin" method="POST" >
    <div class="form-group">
      <label for="uname">Username:</label>
      <input type="text" class="form-control" id="uname" placeholder="Enter username" value= "gastyftacla1@hotmail.com" name="correo" required>
      <div class="valid-feedback">Valido.</div>
      <div class="invalid-feedback">Complete este campo.</div>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="contraseña" required>
      <div class="valid-feedback">Valido.</div>
      <div class="invalid-feedback">Complete este campo con contraseña.</div>
    </div>
    
<div>
      <input class="btn btn-danger" type="button" value="Send"  >
      
      </form>
        
    </body>
</html>
