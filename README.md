## Justificación de Decisiones de Diseño (OOP)

En el diseño de este Sistema de Biblioteca, se optó por una arquitectura basada en **Interfaces** y **Clases Abstractas** para maximizar la reutilización de código, aplicar correctamente el polimorfismo y respetar los principios de la Programación Orientada a Objetos.

A continuación, se detalla el razonamiento técnico detrás de la estructura principal:

### 1. ¿Por qué usar una Clase Abstracta para `RecursoBiblioteca`?
Se definió `RecursoBiblioteca` como una clase abstracta porque representa una **relación de identidad ("Es un...")**.
* **Abstracción del mundo real:** Físicamente no existe un "Recurso de Biblioteca" genérico en un estante; existen libros, revistas o DVDs concretos. Por lo tanto, no tiene sentido permitir que esta clase se instancie directamente.
* **Reutilización de Estado (Atributos):** Todos los recursos comparten características comunes (`titulo`, `autor`, `anioPublicacion`, `prestado`). La clase abstracta nos permite centralizar estos atributos y sus constructores, evitando que las clases hijas (`Libro`, `Revista`, `DVD`) dupliquen este código.
* **Comportamiento Base:** Permite implementar métodos que funcionan exactamente igual para todos los hijos (como los *getters* o el método `estaPrestado()`), reduciendo la redundancia.

### 2. ¿Por qué usar una Interfaz para `Prestable`?
Se definió `Prestable` como una interfaz porque representa un **contrato de capacidad ("Puede hacer...")**.
* **Desacoplamiento del Comportamiento:** Prestar y devolver son acciones, no atributos físicos. Al aislar este comportamiento en una interfaz, garantizamos que cualquier clase que la implemente se comprometa a definir *cómo* se presta o se devuelve.
* **Flexibilidad Futura:** En Java no existe la herencia múltiple de clases, pero sí de interfaces. Si en el futuro la biblioteca decide prestar elementos que NO son recursos bibliográficos (por ejemplo, `Laptops` o `SalasDeEstudio`), estas clases podrán implementar la interfaz `Prestable` sin necesidad de heredar de `RecursoBiblioteca`.
* **Lógica Específica:** Los métodos `prestar()` y `devolver()` se dejaron abstractos en la interfaz porque cada recurso tiene reglas distintas. Por ejemplo, un `Libro` podría prestarse por 15 días, mientras que una `Revista` o un `DVD` de alta demanda podría prestarse solo por 3 días.

### 3. Sinergia y Polimorfismo
Al combinar ambos elementos (haciendo que la clase abstracta implemente la interfaz), logramos un sistema altamente escalable. En la clase `Main`, el uso de un arreglo de tipo `Prestable[]` o `RecursoBiblioteca[]` nos permite recorrer todos los objetos (sin importar si son libros o DVDs) y ejecutar sus métodos correspondientes, demostrando un uso limpio y eficiente del **polimorfismo**.