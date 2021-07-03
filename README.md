# Introduccion al lenguaje Java

## Objetivo
El objetivo de esta guía práctica es que podamos internalizar los contenidos que estudiamos hasta aquí. Para eso, nada mejor que poner manos a la obra. ¡A trabajar!
¡Buena suerte!
### Ejercicio 1
Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor que el usuario ingresará por consola.
Recordá que un número es par cuando es divisible por 2.
### Ejercicio 2
Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores que el usuario ingresará por consola.
Recordá que un número a es múltiplo de b si a es divisible por b.
### Ejercicio 3
Desarrollar un programa para informar si un número n es primo o no, siendo n un valor que el usuario ingresará por consola.
Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.


### Ejercicio 4
Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n un valor que el usuario ingresará por consola.
### Ejercicio 5
Desarrollar un programa para mostrar por consola los primeros n números naturales que tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola los primeros 5 números naturales que tienen, al menos, 2 dígitos 3. En este caso la salida será: 33, 133, 233, 303, 313.
Según cómo decidas encarar la solución de este ejercicio, es probable que necesites utilizar recursos que aún no hemos estudiado. El desafío consiste en googlear cómo utilizar dichos recursos y ¡utilizarlos!


# Introducción al lenguaje Java 2

## Objetivo
El objetivo de esta guía práctica es que podamos afianzar y profundizar los conceptos sobre colecciones y estructura de datos. Para esto vamos a plantear un único ejercicio; una vez que lo resolvamos ya no tendremos dudas sobre cómo se programa en Java.
¿Preparados?
### Ordenamiento de raíz
Desarrollar el método radixSort, que ordena un array de enteros mediante dicho algoritmo de ordenamiento: “ordenamiento de raíz”.


Como este algoritmo es relativamente complejo, luego de analizarlo dividiremos la tarea en problemas bien definidos y más acotados, de modo tal que cada uno sea, en sí mismo, un pequeño desafío.
Entendiendo el algoritmo
Radix Sort es un algoritmo diseñado para ordenar arrays de cadenas de caracteres, pues su lógica se basa en clasificar los elementos del array según cuál sea el carácter que tienen en la última posición, luego en la ante última, en la penúltima, y así sucesivamente hasta llegar a clasificarlos según cuál sea el primer carácter de cada elemento. Es importante conocer este funcionamiento, porque si vamos a ordenar un array de enteros, primero tendremos que convertirlo en un array de cadenas. Por supuesto, podemos usar Radix Sort para ordenar arrays de cualquier tipo de dato, pero para evitar complicaciones que en este momento serían irrelevantes, trabajaremos pensando en arrays de enteros: int[].
Dicho esto, el algoritmo consiste en los siguientes pasos:
1. Convertir el array que vamos a ordenar, de int[] a String[].
   Por ejemplo, si vamos a ordenar int iArr[] = {4,28,132,3,61,5}, debemos
   convertirlo en String sArr[] = {“4”,“28”,“132”,“3”,“61”,“5”}.
2. Todos los elementos del String[] deben tener la misma longitud. Para esto los completaremos con 0 (ceros) a la izquierda (coincidiendo con la cantidad de dígitos del número más grande). Según nuestro ejemplo, el array sArr debería quedar así: {“004”, “028”, “132” , “003”,“061”,“005”}.
3. Creamos 10 listas inicialmente vacías. L0 (será la lista para colocar los números que terminan con 0, En L1 colocaremos los números que terminan con 1, y genéricamente hablando, Li será la lista donde colocaremos aquellos números  cuyo último dígito es i.
4. Recorremos el String[]; por cada elemento verificamos cuál es su último dígito, lo removemos del array y lo agregamos a la lista que corresponda.
5. Recorremos las listas en orden: L0, L1,..., L9, y regeneramos el String[] con los elementos de L0, luego los de L1 y así sucesivamente.
6. Volvemos a (4), pero ahora trabajaremos con el anteúltimo dígito. Es decir L0 será la lista de los elementos que tienen 0 en su anteúltimo dígito, L1 tendrá aquellos elementos que tienen 1 en su anteúltimo lugar, etcétera.
7. En cada iteración evaluamos y clasificamos los elementos del array según cuál sea su último, anteúltimo, antepenúltimo, (...) y primer dígito. Luego de esto el array quedará ordenado.
   Ejemplo: int[] a = {3, 673, 106, 45, 2,23 }.
   Convertimos y completamos con ceros a la izquierda:
   String[] s = {003, 673, 106, 045, 002,023 } (por claridad, omití poner las comillas). Recorremos clasificando en listas según cuál sea el último dígito.
   L2 = {002}
   L3 = {003,673,023}
   L5 = {045}
   L6 = {106}
   Rearmamos el array:
   String[] s = {002,003,673,023,045,106}.
   Repetimos considerando el anteúltimo dígito.
   L0 = {002,003,106}
   L2 = {023}
   L4 = {045}
   L7 = {673}
Rearmamos el array:
String[] s = {002,003,106,023,045,673}
Repetimos considerando el antepenúltimo dígito (que en este caso es el primero). L0 = {002,003,023,045}
L1 = {106}
L6 = {673}
Rearmamos y el array quedó ordenado.
String[] s = {003,004,023,045,106,673}.
### Desarrollo del algoritmo
Como comentamos más arriba, programar este algoritmo de ordenamiento podría resultar algo complejo para programadores con poca experiencia. Sin embargo, teniendo en cuenta cada uno de los pasos del algoritmo, podemos dividir este problema complejo en varios problemas más pequeños y fáciles de resolver.
1. Desarrollar, en el orden en que aparecen, las funciones de la clase
   StringUtil.java.
2. Discutir (en grupo) y diseñar una estructura de datos que permita dar soporte al algoritmo Radix Sort.
3. Desarrollar el método radixSort según el algoritmo planteado.


# Introducción al lenguaje Java 3


## Objetivo
El objetivo de esta guía práctica es que podamos afianzar y profundizar los conceptos sobre encapsulamiento, clases y objetos. Para esto vamos a plantear una serie de ejercicios simples que nos permitirán repasar los temas que estudiamos.
¿Are you ready?
### Ejercicio 1
Crea una clase CuentaCorriente, con los métodos: ingreso, egreso, reintegro y transferencia. La clase contendrá un constructor por defecto, uno con parámetros y otro que recibirá una CuentaCorriente de la cual copiará todos sus datos. Además se deben desarrollar los métodos de acceso (para cada variable de instancia de la clase, desarrollar un método set y otro get. Por ejemplo: si la clase tiene una variable double saldo, sus métodos de acceso serán: double getSaldo() y void setSaldo(double s). Los prototipos de los métodos y constructores deberán ser discutidos y diseñados en equipo.
### Ejercicio 2
Crea una clase Contador (sí, contador de programación) con métodos que permitan incrementar y decrementar su valor. La clase contendrá un constructor por defecto, un constructor con parámetros, un constructor copia y los setters y getters (métodos de acceso) que corresponda.

### Ejercicio 3


● Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo debe ser: public String toString(). Este método debe retornar una cadena que represente al objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una cadena que represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling, J. K.”. La clase contendrá un constructor por defecto, un constructor con parámetros y los métodos de acceso.
● Agregar la línea @Override justo arriba del encabezado del método toString. Luego, cambiar el nombre del método por: tostring (todo en minúscula). ¿Qué sucede?
### Ejercicio 4
Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar y dividir fracciones. Todos los métodos deben estar sobrecargados de modo que también puedan usarse para operar entre fracciones y números enteros (por ejemplo: ⅗+2 o ⅝*4).
### Ejercicio 5
Crea una clase Fecha. La clase contendrá además de los constructores que consideres adecuados, métodos de acceso y el método toString, tal como lo explicamos en el ejercicio anterior, un método para comprobar si la fecha es correcta y otro para sumarle un día al valor actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar para implementar los métodos y constructores de Fecha.
### Ejercicio 6
Partiendo de la clase StringUtil (que usamos para resolver Radix Sort), agregar los siguientes métodos estáticos:
● public static String rpad(String s,char c,int n); idem lpad, pero agregando caracteres a la derecha.

● public static String ltrim(String s); Retorna una cadena idéntica a s pero sin espacios a la izquierda.
● public static String rtrim(String s); idem ltrim, pero sin espacios a la derecha.
● public static String trim(String s); idem lpad, pero sin espacios a derecha ni izquierda.
● public static int indexOfN(String s,char c,int n); Retorna la posición de la n-ésima
ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.


# Introducción al lenguaje Java 4


## Objetivo
El objetivo de esta guía práctica es que podamos afianzar y profundizar los conceptos sobre clase abstracta, herencia y sobreescritura. Para esto vamos a plantear una serie de ejercicios simples que nos permitirán repasar los temas que estudiamos.
¡Vamos todavía!
### Ejercicio 1
1. Crear una clase Password. El constructor debe recibir una regex (expresión regular) que valide el formato requerido para la contraseña. Investigar en Internet qué
   recursos provee Java para operar con expresiones regulares.
2. Agregar el método public void setValue(String pwd) que permite asignar una contraseña acorde a la requerida por la regex del punto anterior. En caso de no concordar, el método debe arrojar una excepción.
   a. Discusión: ¿qué tipo de excepción consideras más adecuada?
   b. Implementar el método según lo decidido en (i).
3. Escribir tres clases: PasswordFuerte, PasswordIntermedia, PasswordSimple, todas
   deben extender a Password y hardcodear una regex acorde al nivel de seguridad que el mismo nombre de la clase indica.

### Ejercicio 2
1. Crear la clase FiguraGeometrica, abstracta y con el método: public abstract double area();
2. Sobreescribir adecuadamente el método toString. Discutir en grupo: ¿tiene sentido sobreescribir el método toString en una clase abstracta?
3. Crear las clases Circulo, Triangulo y Rectangulo, todas subclases de
   FiguraGeometrica. ¿Qué error de compilación aparece? ¿Cómo lo solucionarías?
4. Agregar los atributos (variables de instancia) que corresponda en cada caso y sobreescribir adecuadamente el método area en todas las subclases de
   FiguraGeometrica.
5. Crear una clase utilitaria con un método estático: public static double areaPromedio (FiguraGeometrica arr[]), que calcule y retorne el área promedio de las figuras contenidas en el array. Crear un programa, instanciar un FiguraGeometrica[], cargarle datos e invocar a areaPromedio para obtener el área promedio. Mostrar el resultado.

# Introducción al lenguaje Java 5

## Objetivo
El objetivo de esta guía práctica es que podamos afianzar y profundizar los conceptos sobre interfaces Java, implementación y abstracción vía factorías de objetos.
Preparados, listos, ¡¡VAMOS!!
### Ejercicio 1
1. Crear la interface Precedable<T> con un método public int precedeA(T t).
2. Crear la clase Persona, con los atributos String nombre, e int dni, sus métodos de acceso y los constructores que consideres adecuados.
3. Hacer que Persona implemente Precedable<Persona>, luego sobreescribir el método int precedeA(Persona t).
4. Establecer un criterio de precedencia para implementar el método anterior. Podría ser que una persona precede a otra si su DNI es menor, o su nombre es alfabéticamente menor, etcétera.
5. Crear la clase SortUtil con el método public static <T> ordenar(Precedable<T> arr[]).

6. Dentro del método anterior desarrollar el algoritmo de la burbuja para ordenar el array.
7. Discusión: El método ordenar, ¿puede ordenar un array de cualquier tipo de dato? 8. Crear un programa, declarar un array con varias personas, ordenarlo y mostrarlo.
9. Crear la clase Celular, con los atributos: número y titular, implementar
   Precedable<Celular> y proceder del mismo modo que lo hicimos con Persona a partir del punto anterior.
   Ejercicio 2
   Discusión: si quisiéramos cambiar el criterio de precedencia entre dos personas o dos celulares, ¿qué deberíamos hacer? ¿Cuán extensible y/mantenible resulta la solución de ordenamiento que desarrollamos en el ejercicio anterior? ¿Cómo se podría mejorar?


# Introducción al lenguaje Java 6


## Objetivo
El objetivo de esta guía práctica es que podamos afianzar y profundizar los conceptos sobre interfaces Java, implementación y abstracción vía factorías de objetos.
Preparados, listos, ¡¡VAMOS!!
### Ejercicio 1
1. Crear la interface Precedable<T> con un método public int precedeA(T t).
2. Crear la clase Persona, con los atributos String nombre, e int dni, sus métodos de acceso y los constructores que consideres adecuados.
3. Hacer que Persona implemente Precedable<Persona>, luego sobreescribir el método int precedeA(Persona t).
4. Establecer un criterio de precedencia para implementar el método anterior. Podría ser que una persona precede a otra si su DNI es menor, o su nombre es alfabéticamente menor, etcétera.
5. Crear la clase SortUtil con el método public static <T> ordenar(Precedable<T> arr[]).

6. Dentro del método anterior desarrollar el algoritmo de la burbuja para ordenar el array.
7. Discusión: El método ordenar, ¿puede ordenar un array de cualquier tipo de dato? 8. Crear un programa, declarar un array con varias personas, ordenarlo y mostrarlo.
9. Crear la clase Celular, con los atributos: número y titular, implementar
   Precedable<Celular> y proceder del mismo modo que lo hicimos con Persona a partir del punto anterior.
   Ejercicio 2
   Discusión: si quisiéramos cambiar el criterio de precedencia entre dos personas o dos celulares, ¿qué deberíamos hacer? ¿Cuán extensible y/mantenible resulta la solución de ordenamiento que desarrollamos en el ejercicio anterior? ¿Cómo se podría mejorar?


Programación Java


#SaveTheRopa S.A
// Práctica integradora



SaveTheRopa S.A es una empresa que desea implementar un sistema informático de guardarropas a nivel mundial. El sistema permite a una persona guardar sus pertenencias en el guardarropas y luego retirarlas de manera sencilla con solo presentar el número identificador que recibe al guardarlas.

Las pertenencias se representan en el sistema mediante algo abstracto llamado prenda, que tiene marca y modelo, de modo que si la persona pierde el número también podría en algún momento poder llegar a reclamarlo con dicha información. Sin embargo, el reclamo será modelado en otro momento.

Crear la clase Prenda que contenga las variables marca y modelo, ambos de tipo String.

Crear la clase GuardaRopa que contenga como variable un diccionario y un contador que se utilizará como identificador. Las claves del diccionario serán Integer y como valor una lista de prendas.

Crear el método public Integer guardarPrendas(List<Prenda> listaDePrenda), en la Clase GuardaRopa, que recibe una lista de prendas y devuelve el número identificador en donde quedaron asignadas las prendas, es decir la clave del diccionario en donde guardamos las prendas.

Crear el método public void mostrarPrendas(), en la Clase GuardaRopa que imprime por pantalla todas las prendas que quedan en el guardarropas junto con el número que les corresponde.

Crear el método public List<Prenda> devolverPrendas(Integer numero), en la Clase GuardaRopa que devuelve la lista de prendas que están guardadas bajo ese número.

Crear en la clase Main un escenario en el cual alguien guarde dos prendas, reciba el código y luego reclame sus prendas.

Programación Java


#DAKAR
// Práctica integradora



Realizar punto por punto ordenadamente, sin saltear.
Realizar los diagramas de clase correspondientes en cada paso y realizar los cambios a medida que vamos resolviendo los distintos puntos.

1. Crear la clase vehículo que tenga los siguientes atributos:
Velocidad
Aceleración
AnguloDeGiro
Patente
Peso
Ruedas

2. Modelar la clase Carrera que tiene los siguientes atributos:
Distancia
PremioEnDolares
Nombre
CantidadDeVehiculosPermitidos
Lista de Vehiculos

3. Se quiere agregar dos nuevas categorias de Vehiculos:
Autos
Motos.
Los autos pesan 1.000 kilos y las motos 300 kilos, los autos tienen 4 ruedas y las motos 2.

4. Una carrera además tiene un conjunto de vehículos que participarán de la misma. Entonces, ahora la carrera va a tener la responsabilidad de poder agregar a un vehículo a la carrera, por lo que debemos definir los siguientes métodos:
public void darDeAltaAuto(velocidad,aceleracion,AnguloDeGiro,patente);
public void darDeAltaMoto(velocidad,aceleracion,AnguloDeGiro,patente);
Ambos métodos agregan un vehículo siempre y cuando haya cupo.

5. También vamos a tener la posibilidad de eliminar a un vehículo mediante dos metodos:
public void eliminarVehiculo(vehículo);
public void eliminarVehiculoConPatente(String unaPatente);

6. Queremos poder definir el ganador de una carrera:
   El ganador será aquel que tenga el máximo valor determinado por la siguiente fórmula:
   Velocidad * ½ Aceleracion / (AnguloDeGiro*(Peso-Cantidad de Ruedas * 100)

7. Las carreras también cuentan con vehículos socorristas que ante alguna emergencia van y reparan a un vehículo. Como los autos son muy diferentes a las motos, existen dos clases distintas de vehiculos socorristas. Uno de estos solo sabe socorrer autos y que otro solo sabe socorrer motos.
   Agregar las clases
   SocorristaAuto
   SocorristaMoto
   Agregar los metodos:
   SocorristaAuto → public void socorrer(Auto unAuto)
   SocorristaMoto → public void socorrer(Moto unaMoto)

7. Cuando un socorrista se acerca a un auto imprime por pantalla “Socorriendo auto” y el número de patente, cuando socorre a una moto este imprime por pantalla “Socorriendo moto” y el número de patente.

8. Agregar a la clase carrera un socorrista de autos y uno de motos,.
9. Agregar a la carrera la responsabilidad de socorrer una moto y un auto:
    public void socorrerAuto(String patente);
   
    public void socorrerMoto(String patente);


#Marte Group S.A.
// Práctica integradora

1. La empresa organizadora de eventos Marte Group S.A nos solicita implementar el sistema para el gran evento del centenario de “La Chiqui” Legrand. Este evento tendrá:
        

    Lista de Invitados
            Los invitados de Meli.
            Los Invitados Standard.
   

    Lista de fuegos artificiales
            Los fuegos artificiales individuales.
            Los packs de fuegos artificiales: los packs pueden contener uno o más fuegos artificiales individuales e incluso pueden contener otros packs.

2. El momento más importante de este evento es cuando “La Chiqui” apaga las velas de la torta. En este momento sucederán dos eventos:

    a. Por un lado, Marte Group S.A reventará todos los fuegos artificiales. Por lo tanto, a la empresa le interesa poder contar con toda la lista de fuegos artificiales disponibles.
    
    b. Por otro lado, Marte Group S.A distribuirá porciones de la torta más grande de América a todos los invitados, para que puedan degustarla. Sin embargo, el sistema debe tomar en consideración que los invitados de Meli después de comer la porción gritarán “Viva la Chiqui!!”.

###Aclaración 1: 
Cada fuego artificial individual al explotar hace su propio ruido.
###Aclaración 2: 
Crear una clase Main y crear los objetos necesarios para probar el sistema. 
