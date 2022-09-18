Andrea, Luis y Fernando, son coleccionistas de figuras de colección del álbum del mundial de futbol. Estos coleccionistas coleccionan figuras y siempre desean tener más figuras en su colección. Para facilitar la renovación de colección los estudiantes intercambian figuras. Estos estudiantes luchan para tener "la colección dorada": Una lista de figuras especiales y de muy alto valor económico. 
Cada Coleccionista siempre tiene una lista con los números de las figuras que les faltan para completar "la Colección dorada" y otra lista con los números de las figuras que están dispuestos a intercambiar. 

Adicionalmente, han notado que las figuras que coleccionan, pueden ser categorizadas (Selecciones, Delanteros, Porteros, etc.) y han decido numerar estas categorías 1, 2, 3, 4, 5, ..., etc.

A los estudiantes de misión tic 2022 les han pedido el desarrollo de un software que ayude a estos coleccionistas que les haga más fácil la categorización y el intercambio de Figuras.  Es una gran oportunidad de negocio y los estudiantes va a construir el software y luego lo va a vender a estos coleccionistas.  El software tiene muchas funciones y usted va a trabajar como desarrollador en los módulos iniciales. El arquitecto de Software, le indica a usted, unos requerimientos para construir una clase de Java que hace parte del módulo más importante.  El arquitecto le pide que esta clase se llame Figuras.

El arquitecto solicita que exista un método llamado "clases" que, dada una lista de enteros, donde cada entero es la categoría de las figuras, retorne una lista con las categorías únicas.

Por ejemplo, suponiendo que 10 Figuras son categorizadas de la siguiente manera:
[1,2,5,5,5,1,2,5,5,5]
la función debe retornar la lista
[1,2,5]

2). El arquitecto solicita que exista un método llamado "meFaltanDeLaClase" el cual recibe tres parámetros. El primero es una lista con las figuras que a un coleccionista le hacen falta para completar la Colección Dorada. El segundo es una lista de las categorías a la que pertenece cada una de las obras de la Colección Dorada. El tercero es un entero representando una de las categorías. Este método debe retornar una lista con los números de Figuras que faltan para completar pero que son de la categoría especificada en el tercer parámetro.

Por ejemplo, si se ejecuta la función:
meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 5)
debe retornar la lista: [3,8]

Por ejemplo, si ejecutan la
función:
meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 2)
Se debe retornar la lista: [1,6]

3). El arquitecto solicita que exista un método llamado "noTengo" que dada una lista con las figuras que tiene el coleccionista A, una lista con las figuras que tiene el coleccionista B, retorne la lista con las figuras que son de interés para el coleccionista B.

Por ejemplo, si se llama:
notengo([3,5,7,10,15,16],[4,10,5,8])
Se debe retornar la lista: [3,7,15,16]

4.  Algunos Coleccionistas han desarrollado la capacidad de generar duplicados certificados de las figuras. Esto les permite intercambiar figuras y así mismo facilitar el proceso para completar la Colección Dorada. El arquitecto solicita que exista un método llamado "puedoCambiar" que reciba la lista de duplicados que tiene el Coleccionista A y la lista de duplicados que tiene el Coleccionista B y que retorne el número de Figuras que pueden cambiar.

Por ejemplo, llamar la función:
puedocambiar([3,5,7,10,15,16],[4,10,5,8])
Debe retornar
2

Porque al Coleccionista B le interesan las figuras [3,7,15,16] del coleccionista A, mientras que al coleccionista A solo le interesan las figuras [4,8] del coleccionista B. Para que sea evaluada correctamente, la función debe retornar un Integer.
