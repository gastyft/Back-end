<%-- 
    Document   : estudios
    Created on : 04-ago-2022, 10:55:03
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Estudios</title>
    </head>
    <body>
        <form action="SvEstudios" method="POST">
    <div class="form-group">
      <label for="form-group">Primaria: </label>
      <input type="text" class="form-control" name="primaria"  placeholder="Complete sus estudios" [(ngModel)]="miPortfolio.estudios.primaria">
    </div>
    <div class="form-group">
      <label for="form-group">Secundaria: </label>
      <input  class="form-control" name="secundaria"  placeholder="Complete sus estudios" [(ngModel)]="miPortfolio.estudios.secundaria">
    </div>
    <div class="form-group">
      <label for="form-group">Universitario/terciario: </label>
      <input  class="form-control" name="universidad"  placeholder="Complete sus estudios"[(ngModel)]="miPortfolio.estudios.uni">
    </div>
    <div class="form-group">
      <label for="form-group">Actual: </label>
      <input  type="text" class="form-control" name="actual" placeholder="Complete sus estudios" [(ngModel)]="miPortfolio.estudios.actual" >
      
    </div>
    <input class="btn btn-primary" type="submit" value="Guardar Cambios">
        </form>
        </form>
        <form action="SvEstudios" method="GET">
            <p>Si desea mostrar estudios oprima el boton "mostrar estudios"</p>
            <button type="submit" >Mostrar estudios</button>
            
        </form>
         <form action="SvEliminarEstudios" method="POST">
            <p>Si desea eliminar oprima el boton "eliminar estudios"</p>
            <p><label>Id:</label>  <input type="text" name="id_eliminar"> </p>
            <button type="submit" >Eliminar</button>
            
        </form>

    </body>
</html>
