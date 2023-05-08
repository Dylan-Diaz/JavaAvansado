<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="autor" content="Dylan Diaz">
    <meta name="descripcion" content="">
    <meta name="Keywords" content="registrar usuario, formulario de registro, crear cuenta">
    <meta name="viewport" content="width=device-width, initiale-scale=1">
    <title>Registro de usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link type="text/css" rel="stylesheet" href="./css/Style.css" >
</head>
<body>
<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <div class="divStile">
            <div class="centerD">
                <img class="centerD md-4" src="./img/logoApp.png" alt="My app" width="200">
            </div>
            <div class="centerD">
                <h1>My app</h1>
            </div>
            <form action="">
                <div class="col-md-12">
                    <label for="firstname" class="form-label">Nombre de usuario:</label>
                    <input type="text" id="firstname" name="firstname" class="form-control">
                </div>
                <div class="col-md-12">
                    <label for="password" class="form-label">Contraseña:</label>
                    <input type="password" class="form-control" id="password">
                </div>
                <div class="centerD">
                    <button type="submit" class="btn btn-primary">Ingresar</button>
                </div>
            </form>
        </div>
    </section>

    <footer></footer>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</html>