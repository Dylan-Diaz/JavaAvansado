# Formulario dia 20/4/2023 Dylan Diaz

# 2687351

# proyect-one

# HTML:

primero indique que se estaba usando la version de HTML5 con la etiqueta DOCTYPE. Luego indique que lenguaje que se va a usar seria español con el atributo lang en la etiqueta html. Dentro del head del archivo index cree las siguentes etiquetas:

**-Etiquetas meta:** en la primera etiqueta utilize el atributo charset=UTF-8 para que me permitiera agregar caracteres especiales y en la segunda utilize los atributos name=viewport y content=width=device-width, initial-scale=1.0 para que la interfaz sea responsive.

**-Etiquetas link:** en la primera etiqueta agrege la direccion https de Bootstrap en la version 5.3.0 y en la segunda la ubicacion de mi propio archivo de estilos css.

**-Etiqueta title:** en esta etiqueta escribi el titulo del archivo index y lo llame "Formulario de registro".

En la etiqueta body agrege la etiqueta div usando una clase del Bootstrap llamada container, en esta etiqueta primeramente agrege las etiquetas header, nav y section, en esta ultima etiqueta escribi todo lo que seria el codigo del formulario.

Ya dentro de la etiqueta section primeramente escribi un mensaje con la etiqueta h1 la cual le agrege una clase llamada h1 y le di un mensaje diciendo "¡Regístrate!", despues agrege la etiqueta form y dentro de esta agrege otra etiqueta div con una clase llamada formD. Dentro de este nuevo contenedor agrege otras 4 etiquetas div con una clase del Bootstrap llamada mb-3 y dentro de cada una 2 etiquetas label y input.

El label y el input de la primera etiqueta div class=mb-3 indique al usuario su nombre, siendo que en el label agrege un mensaje "Nombre", tambien agrege un atributo for indicando el nombre del id del input y ya por ultimo una clase del Bootstrap llamada "form-label".En la etiqueta input agrege las etiquetas: 

**-type:** para indicar que el tipo de input era texto. 

**-id:** para hacer unica a la etiqueta y la llame "firstname". 

**-name:** el cual la llame de igual modo que el atributo id. 

**-class:** la cual le agrege una clase del Bootstrap llamada "form-control". 

**-placeholder:** para escribir un texto de ayuda indicando al usuario que ingrese aqui su nombre. 

**-required:** para que el campo sea obligatorio llenarlo.

-pattern para indicar los patrones escritura que se permitiran en el campo.



# Evidencia dia 7/5/2023

# proyect-two

# Dylan Diaz ficha: 2687351

#Descripcion:

En este proyecto complementamos los formularios de login y registro de nuestra app con las clases en java para conectarnos a la base de datos.Creamos 4 diferentes tipos de conectores en la carpeta util y 2 clases Use para poder ejecutar el codigo de la base de datos Mysql desde la app.En cada clase Connection utilizamos la clase main y ingresamos el usuario y la contraseña de la base de datos para poder acceder a ella.

En el servidor de base de datos creamos una nueva base llamada "my_app" y creamos una tabla llamada "users_tbl", en esta tabla creamos 5 atributos los cuales son: user_id(esta es la llave primaria), user_firstname, user_lastname, user_email y user_password, los atributos que solicitamos en las clases de la carpeta util son user_firstname y user_lastname. 


# Evidencia dia 17/05/2023

# Proyect-two - Taller 5 y 6

# Dylan Josue Diaz

# Ficha: 2687351

# Descripcion:

En esta evidencia se a trabajado en las consultas CRUD desde nuestra app. Primero cree un nuevo sub-paquete en la carpeta proyecttwo que esta dentro de la carpeta java y despues cree una interfaz llamada "repository":

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/57945368-56cf-4761-a8d2-37a9d3997c42)

dentro de la interfaz declare 5 objetos:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/725bb978-0442-43b4-ba61-db4820b358b9)

despues cree una clase llamada "UserRepostoryImpl":

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/06525f2c-992e-49e1-9849-0e3ab13e45f6)

ya dentro de la clase implemente el repositorio anterior y declare 1 atributo y los 5 metodos de la consulta sql:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/654e4ebb-4499-4501-8b21-10191e3d69d6)

-El metodo LisAllObjec sirve para listar todos los registros que haya en la tabla.

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/9739633f-d96f-4ae5-a515-90d098ddba3d)

-El metodo byIdObj sirve para listar todos los registros de la tabla por id.

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/33f28436-8ec6-4eb2-a16e-e21b430ecfef)

-El metodo saveObj sirve para actualizar registros.

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/87f837d4-c6a0-4d03-b754-e4a8a2961e30)

-El metodo deleteObj sirve para eliminar registros.

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/e3fba478-4e56-40ae-8355-fb8c4032f99e)

-Por ultimo metodo createObj sirve para ingresar nuevos registros a la tabla.

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/b93a2799-defd-482c-95b0-90cef9d656bc)

Despues de esto cree otra clase en el sub-paquete reporitory llamada "TestRepositoryImpl":

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/51c3d2f2-296b-4b66-8a1f-f8440c2af754)

Dentro de la clase declare la clase main y cree un objeto llamado "repository":

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/d4ccd60b-bf69-496b-917a-345fd134f4bd)

ahora declare cada uno de los metodos anteriores, primero declare el metodo para insertar registros (saveObj Insert):

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/a043a470-c5f0-4eee-9f92-c5ef884c2885)

despues declare el metodo para listar todos los registros (listAllObj):

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/56da253f-6c2a-4411-b4b9-7ce6d4a0555b)

despues declare el metodo para listar los registros por id (byIdObj):

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/5c0e9835-44e2-4022-a87f-0b0978f88ca0)

despues declare el metodo para actualizar registros (saveObj):

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/9f388147-1aae-4d15-8459-f243d307c3c0)

y ya por ultimo declare el metodo para eliminar registros (deleteObj):

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/d031422f-0cf5-4c65-b279-070c3ddcae79)


# Evidencia 5/06/2023

# proyect-two Taller 7

# Dylan Josue Diaz

# Ficha: 2687351

# Descripcion:

En esta evidencia se a trabajado en crear e implementar funcionalmente 2 nuevos objetos en el proyecto. Primero cree 2 nuevas tablas llamadas categories y product en la base de datos:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/efe7372b-6856-4b66-a018-5093adf5a311)

luego cree las interfaces para ingresar registros a cada una de las tablas:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/7223a840-f915-4197-9f2f-390253a5928e)

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/b3f9567b-03aa-49cc-acd5-2de9373d4f55)

despues empece a crear las clases beans de cada una de estas tablas:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/12d74068-a2a9-4cc9-a79e-b8f95cb2cd4b)

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/71c40434-6938-49e3-bbc1-6e67c42834a6)

luego cree las clases Repository de cada una de las tablas:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/f34e6eb8-9b10-4733-b037-df9be91ca48d)

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/160d9fe3-5985-4206-a222-a6458b751833)

por ultimo cree las clases Servlet de cada una de las tablas:

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/cd7ef3d4-6ede-4c26-864d-bd3648b206a9)

![image](https://github.com/Dylan-Diaz/JavaAvanzado/assets/128426097/33e9692d-81a7-4bc7-8aea-d197aaa9ef3c)

la interfaz de cada uno de los nuevos registros quedo completamente funcional.
