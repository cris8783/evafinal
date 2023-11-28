<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
   <title>Login PetSmile</title>
</head>
<body>
<div >
<h1>Bienvenido a Clinica</h1>
<h4> Iniciar sesion</h4>
<form action="controladores" method="POST">
      Usuario: <input type="text" name="user"/><br/>
      Constraseña: <input type="text" name="pass"/><br/>
      <input type="submit" value="Enviar"/>
</form>
</div>
</body>
</html>