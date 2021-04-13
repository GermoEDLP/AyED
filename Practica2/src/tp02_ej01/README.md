## Ejercicio 1.4
Al momento de llamar las clases para instanciar nuevos objetos y mientras se utiliza los mismos para trabajar, no se nota diferencia alguna. Y es lo correcto, ya que la idea de usar una clase super abstracta que de los lineamientos de creación le confiere a las clases hija (subclases) una uniformidad de trabajo. Pero si nos adentramos en la creación de las clases mismas, vemos como gran diferencia, que una utiliza un array de elementos enteros y la otra usa una serie de nodos binarios entrelazados por referencia, cada una con su logica particular.

## Ejercicio 1.7
* __a)__ Si, se puede dar comportamiento a un método de la clase ListaDeEnteros, pero el mismo no puede ser `abstract`, ya que los mimmos no se definen en la clase abstracta sino que se definen en sus clases hijas. Tampoco se tendría que definir obligatoriamente en la clase hija, sino que sería heredado. Se puede sobreescribir.
La clase se define como abstracta porque posee, al menos, un método abstracto. Esta clase no se puede instanciar.
* __b)__ Creación de nodos:
    * *Nodo al principio:* Se debe crear el nodo y seleccionar como siguinete al primero de la lista
    * *Nodo en medio:* Se debe crear el nodo, poner como siguiente del anterior al lugar especificado y como siguiente se define el que estaba a continuación.
    * *Nodo al final:* Se crea el nodo y se coloca siguinete del último. Como su siguiente se coloca `null`.
* __c)__ El indice inicial de cualquier array es en la posción 0, pero, en este ejercicio, se realizan las adaptaciones necesarias para que se comience con el 1.
