<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link type="text/css" rel="stylesheet" href="css/StyleRegistro.css">
    <title>Ingresar categoria</title>
    <link rel="icon" href="./img/logoApp.png">
</head>
<body>
<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <div class="titulo-A">
            <h1>Nueva Categoria:</h1>
        </div>
        <div class="row">
            <div class="form-group col-md-8">
                <form action="registerCategories" method="post">
                    <div class="form-floating">
                        <input type="text" class="form-control" id="name" name="category_name" placeholder="Nombre:" required>
                        <label for="name">Nombre</label>
                    </div>
                    <div class="boton-C">
                        <button type="submit" class="btn">Registrar</button>
                    </div>
                </form>
            </div>
            <div class="form-group col-md-4 centerD">
                <img class="md-4" src="img/producto.png" alt="My app" width="250">
            </div>
        </div>
        <div class="centerD">
            <a href="registro">Atras⎆</a>
        </div>
    </section>
    <footer>
        <p>Todos los Derechos Reservados My App © <%=displayDate()%> </p>
    </footer>

    <%!
        public String displayDate(){
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
            Date date = Calendar.getInstance().getTime();
            return dateFormat.format(date);
        }%>
</div>

</body>
</html>
