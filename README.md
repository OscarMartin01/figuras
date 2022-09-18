Andrea, Luis y Fernando, son coleccionistas de figuras de colecci�n del �lbum del mundial de futbol. Estos coleccionistas coleccionan figuras y siempre desean tener m�s figuras en su colecci�n. Para facilitar la renovaci�n de colecci�n los estudiantes intercambian figuras. Estos estudiantes luchan para tener "la colecci�n dorada": Una lista de figuras especiales y de muy alto valor econ�mico. 
Cada Coleccionista siempre tiene una lista con los n�meros de las figuras que les faltan para completar "la Colecci�n dorada" y otra lista con los n�meros de las figuras que est�n dispuestos a intercambiar.�

Adicionalmente, han notado que las figuras que coleccionan, pueden ser categorizadas (Selecciones, Delanteros, Porteros, etc.) y han decido numerar estas categor�as 1, 2, 3, 4, 5, ..., etc.

A los estudiantes de misi�n tic 2022 les han pedido el desarrollo de un software que ayude a estos coleccionistas que les haga m�s f�cil la categorizaci�n y el intercambio de Figuras.� Es una gran oportunidad de negocio y los estudiantes va a construir el software y luego lo va a vender a estos coleccionistas.� El software tiene muchas funciones y usted va a trabajar como desarrollador en los m�dulos iniciales. El arquitecto de Software, le indica a usted, unos requerimientos para construir�una clase de Java que hace parte del m�dulo m�s importante.� El arquitecto le pide que esta clase se llame Figuras.

El arquitecto solicita que exista un m�todo llamado�"clases"�que, dada una lista de enteros, donde cada entero es la categor�a de las figuras,�retorne una lista con las categor�as �nicas.

Por ejemplo, suponiendo que 10 Figuras son categorizadas de la siguiente manera:
[1,2,5,5,5,1,2,5,5,5]
la funci�n debe retornar la lista
[1,2,5]

2).�El arquitecto solicita que exista un m�todo llamado�"meFaltanDeLaClase"�el cual recibe tres par�metros.�El primero es una lista con las figuras que a un coleccionista le hacen falta para completar la Colecci�n Dorada. El segundo es una lista de las categor�as a la que pertenece cada una de las obras de la Colecci�n Dorada. El tercero es un entero representando una de las categor�as. Este m�todo debe retornar una lista con los n�meros de Figuras que faltan para completar pero que son de la categor�a especificada en el tercer par�metro.

Por ejemplo, si se ejecuta la funci�n:
meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 5)
debe retornar la lista: [3,8]

Por ejemplo, si ejecutan la
funci�n:
meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 2)
Se debe retornar la lista: [1,6]

3). El arquitecto solicita que exista un m�todo llamado�"noTengo"�que dada una lista con las figuras que tiene el coleccionista A, una lista con las figuras que tiene el coleccionista B, retorne la lista con las figuras que son de inter�s para el coleccionista B.

Por ejemplo, si se llama:
notengo([3,5,7,10,15,16],[4,10,5,8])
Se debe retornar la lista: [3,7,15,16]

4.��Algunos Coleccionistas han desarrollado la capacidad de generar duplicados certificados de las figuras. Esto les permite intercambiar figuras y as� mismo facilitar el proceso para completar la Colecci�n Dorada.�El arquitecto solicita que exista un m�todo llamado�"puedoCambiar" que reciba la lista de duplicados que tiene el Coleccionista A y la lista de duplicados que tiene el Coleccionista B y que retorne el n�mero de Figuras que pueden cambiar.

Por ejemplo, llamar la funci�n:
puedocambiar([3,5,7,10,15,16],[4,10,5,8])
Debe retornar
2

Porque al Coleccionista B le interesan las figuras [3,7,15,16] del coleccionista A, mientras que al coleccionista A solo le interesan las figuras�[4,8] del coleccionista B.�Para que sea evaluada correctamente, la funci�n debe retornar un�Integer.
