## Ejercicio 2.1
Si se puede realizar los ejercicios del punto 1 utilizando la ListaGenerica, solo deberíamos indicar el tipo de dato que va a guardar, en este caso Intigers
~~~
ListaEnlazadaGenerica<Intiger> l = new ListaEnlazadaGenerica<Intiger>();
~~~


## Ejercicio 2.4

* __a)__  La diferencia mas importante entre la ListaEnlazadaGenerica y la ListaDeEnterosEnlazada, es que la segunda solo puede tarabajar con valores de tipo Entero primitivo (int), pero la segunda puede aceptar cualquier tipo de dato una vez se referencie al crear la instancia de la clase.
* __b)__  El nodo generico se compone de un dato de tipo generico (es decir que el tipo de dato será definido al instanciar el objeto ListaGenerica) y un siguinete que tambien es un nodo generico (apunta a la dirección del siguiente nodo. Para instanciarlo, al igual que con la clase ListaGenerica, se le debe aclarar el tipo de dato que utilizará.
~~~
NodoGenerico<T> nodo = new NodoGenerico<T>();
~~~
Aquí utilizamos el `T` como generico, es decir, que ahí se colocará cualquier dato. Volviendo al punto 2.1, para poder realizar los mismos ejercicios del punto 1, se debería utilizar un wrapper de entero (Intiger):
~~~
NodoGenerico<Intiger> nodoDeEntero = new NodoGenerico<Intiger>();
~~~
* __c)__ EL método `elemento()` de la lista devuelve el elemento de la misma ubicado en la posición pasada por parametro. 
