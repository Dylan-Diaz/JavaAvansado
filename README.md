# Formulario dia 20/4/2023 Dylan Diaz

# 2687351

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




