<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link type="text/css"  href="./css/style.css" rel="stylesheet" >
    <title>Formulario de registro</title>
</head>
<body>
<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <h1 class="h1">¡Regístrate!<h1>
            <hr>
        <form>
            <div class="formD">
                <div class="mb-3">
                    <label for="firstName" class="form-label">Nombre</label>
                    <input type="text" id="firstName" name="firstName" class="form-control"  aria-describedby="emailHelp" placeholder="Ingrese su nombre" required pattern="[A-Za-z]{2,40}">
                </div>
                <div class="mb-3">
                    <label for="lastName" class="form-label">Apellido</label>
                    <input type="text" id="lastName" name="lastName"class="form-control"  aria-describedby="emailHelp" placeholder="Ingrese su apellido" required pattern="[A-Za-z]{2,40}">
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Correo</label>
                    <input type="email" id="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Ingrese su direccion de correo electronico" required pattern="{70}">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña</label>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Ingrese su contraseña" required pattern="^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$">
                </div>
                <button type="submit" class="boton btn btn-danger">Enviar</button>
            </div>
        </form>
    </section>
    <footer>
        <hr>
    </footer>

</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</html>