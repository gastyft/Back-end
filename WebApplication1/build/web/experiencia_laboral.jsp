

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP experiencia_laboral</title>
    </head>
    <body>
       <body>
        <form action="SvEstudios" method="POST">
    <div class="form-group">
      <label for="form-group">Agregar Experiencia </label>
      <input type="text" class="form-control" name="experiencia"   >
    </div>
              <input class="btn btn-primary" type="submit" value="Guardar Cambios">
              
                  </form>
        <form action="SvExperiencia" method="GET">
            <p>Si desea mostrar experiencias laborales oprima el boton "mostrar experiencias"</p>
            <button type="submit" >Mostrar experiencias</button>
            
        </form>
 <form action="SvEliminarExperiencia" method="POST">
            <p>Si desea eliminar oprima el boton "eliminar experiencia"</p>
            <p><label>Id:</label>  <input type="text" name="id_eliminar"> </p>
            <button type="submit" >Eliminar</button>
            
        </form>
    </body>
</html>
