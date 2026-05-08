# Evaluación Hito 3 - Estructuras de Datos

Este proyecto es una API REST desarrollada con Java y Spring Boot para la gestión de un instituto.

## Las Funcionalidades
* **Parte 1:** Gestion de 10 calificaciones en un arreglo unidimensional.
* **Parte 2:** Control de asientos de un aula (5x5) usando una matriz.
* **Parte 3:** Registro de estudiantes usando una Lista Enlazada propia y ordenamiento.
## Como ejecutar el proyecto
1. Clonar el repositorio que se puede hacer del boton de arriba el verde.
2. Ejecutar: desde un IDE (IntelliJ) o cuando descargue el archivo o documento puede arrastrarlo al IDE (IntelliJ) yh se abrira.
3. El servidor a iniciar es en `http://localhost:8080`.

## Ejemplos de uso
### PARTE 1: Arreglo Unidimensional (Notas)
* **Agregar nota:** `/notas/agregar?valor=90` 
* **Mostrar todas las notas:** `/notas` 
* **Mostrar promedio:** `/notas/promedio` 
* **Mostrar nota máxima:** `/notas/max` 
* **Mostrar nota mínima:** `/notas/min`

### PARTE 2: Arreglo Bidimensional (Aula)
* **Mostrar matriz:** `/aula`
* **Cantidad de ocupados:** `/aula/ocupados` 
* **Ocupar asiento:** `/aula/ocupar?fila=1&columna=2`
* **Liberar asiento:** `/aula/liberar?fila=1&columna=2`

### PARTE 3: Lista Enlazada y Ordenamiento (Estudiantes)
* **Agregar estudiante:** `/estudiantes/agregar?nombre=Ana&puntaje=95`
* **Mostrar estudiantes:** `/estudiantes` 
* **Mostrar ordenados (Mayor a Menor):** `/estudiantes/ordenados`
* **Buscar estudiante:** `/estudiantes/buscar/Juan`
