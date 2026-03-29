# Sistema de Gestión de Biblioteca

Este proyecto es una simulación de un sistema de biblioteca desarrollado en Java, aplicando los pilares de la Programación Orientada a Objetos (OOP), específicamente el uso de Clases Abstractas, Interfaces y Polimorfismo.

## Distribución

Para mantener un flujo de trabajo ordenado en GitHub, las tareas se han dividido de la siguiente manera:

* **Mateo (Integrador):** * Configuración inicial del repo.
    * Desarrollo de la interfaz base `Prestable`.
    * Desarrollo de la clase abstracta `RecursoBiblioteca`.
    * *Responsabilidad:* Revisión y unión (Merge) de todas las ramas al `main` para evitar conflictos.
* **Compañero 2 (Desarrollo Core):**
    * Desarrollo de las clases concretas `Libro` y `Revista`.
    * Implementación de la lógica específica de préstamos y devoluciones para estos recursos bibliográficos.
* **Compañero 3 (Desarrollo y Lógica Principal):**
    * Desarrollo de la clase concreta `DVD`.
    * Desarrollo de la clase `Main`.
    * Creación de la lógica polimórfica (arreglos/listas) para recorrer e imprimir el estado de los recursos.
* **Compañero 4 (Desarrollo Adicional y Documentación):**
    * Desarrollo de una clase externa (ej. `Laptop` o `Proyector`) que implemente la interfaz `Prestable` directamente, sin heredar de `RecursoBiblioteca`, para demostrar la flexibilidad de las interfaces.
    * Ejecución de pruebas finales y toma de capturas de pantalla.
    * Redacción del PDF final con las evidencias y justificaciones de diseño.

---

## Justificación de Decisiones de Diseño (POO)

En este Sistema de Biblioteca se eligió una arquitectura con interfaces y clases abstractas para reutilizar código, aplicar polimorfismo y mantener buenas prácticas de POO. Aquí va la idea en corto y con un tono más relajado:

### 1. Clase abstracta `RecursoBiblioteca`
Se usa porque representa algo general (un “tipo de recurso”) que en la vida real no existe por sí solo, solo existen sus versiones concretas como libros, revistas o DVDs.
* Sirve para centralizar atributos comunes (título, autor, año, estado de préstamo).
* Evita repetir código en las clases hijas.
* Permite incluir métodos que funcionan igual para todos, como verificar si está prestado.

### 2. Interfaz `Prestable`
Aquí la idea es definir lo que un objeto *puede hacer*, no lo que *es*.
* Separa el comportamiento de prestar/devolver del resto del diseño.
* Da flexibilidad: cualquier clase (aunque no sea un recurso bibliográfico, como una Laptop) puede implementar esta capacidad.
* Cada clase decide cómo implementar las reglas (por ejemplo, distintos tiempos de préstamo).

### 3. Cómo trabajan juntos
Al combinar la clase abstracta con la interfaz, el sistema se vuelve más flexible y fácil de escalar. Además, gracias al polimorfismo, se pueden manejar distintos tipos de recursos de forma uniforme (por ejemplo, meterlos todos en un mismo arreglo) sin complicaciones.
