# Guía APE 6 y Cierre de la APE – Arreglos en Java

## Datos del estudiante

| Campo | Detalle |
|---|---|
| **Nombre completo** | Carlos Esteban Zambrano Chicaiza |
| **Universidad** | Universidad Técnica de Ambato |
| **Carrera** | Ingeniería de Software |
| **Nivel / Paralelo** | Primero "B" |
| **Asignatura** | Algoritmos y Lógica de Programación |

## Descripción

Este proyecto reúne la solución en Java de los ejercicios de la **Primera parte de la Guía APE 6** y del **Cierre de la APE**, ambos sobre el uso de arreglos (vectores). Cada ejercicio está en un archivo independiente y las pruebas de escritorio de cada parte están en un solo archivo.

## Estructura del proyecto

### Primera parte (Guía APE 6)

| Archivo | Contenido |
|---|---|
| `Ejercicio1.java` | Control de gastos semanales y ajuste por inflación |
| `Ejercicio2.java` | Filtro y suma condicionada de producción |
| `Ejercicio3.java` | Análisis de asistencia y rendimiento |
| `PruebasEscritorio.java` | Pruebas de escritorio de los 3 ejercicios |

### Cierre de la APE

| Archivo | Contenido |
|---|---|
| `CierreEjercicio1.java` | Búsqueda y conteo |
| `CierreEjercicio2.java` | Máximo y mínimo con arreglos paralelos |
| `CierreEjercicio3.java` | Integrador con `java.util.Arrays` |
| `PruebasEscritorioCierre.java` | Pruebas de escritorio de los 3 ejercicios |

## Resumen de los ejercicios

### Primera parte

1. **Gastos semanales:** registra 7 gastos diarios en un arreglo `double`, calcula el total y el promedio, aplica un aumento del 10 % a los días que superaron el promedio, muestra el arreglo en orden inverso y cuenta los días con incremento.
2. **Producción:** lee 10 turnos de producción, suma las piezas en índices pares, cuenta los turnos con cantidad impar mayor a 15 y muestra el promedio con 2 decimales.
3. **Asistencia y rendimiento:** pide `n` estudiantes, valida notas entre 0 y 20, calcula el promedio (sin división entera), aprobados (nota ≥ 14), reprobados y lista los estudiantes por debajo del promedio.

### Cierre

1. **Búsqueda y conteo:** pide un número por teclado y muestra cuántas veces aparece en el arreglo y su primera posición; si no existe, imprime "No existe".
2. **Arreglos paralelos:** a partir de `nombres` y `notas`, muestra el nombre y la nota más alta y más baja (con `posMax` y `posMin`) y el promedio con 2 decimales.
3. **Clase `Arrays`:** crea una copia con `Arrays.copyOf`, ordena solo la copia con `Arrays.sort`, muestra ambos arreglos con `Arrays.toString`, indica el segundo número mayor y la posición del 14 con `Arrays.binarySearch`.

## Cómo compilar y ejecutar

Requisito: tener instalado el JDK (Java 8 o superior).

Desde la carpeta del proyecto, compilar todos los archivos:

```
javac *.java
```

Ejecutar el que se necesite, por ejemplo:

```
java Ejercicio1
java CierreEjercicio3
java PruebasEscritorio
java PruebasEscritorioCierre
```

Los ejercicios que piden datos (`Ejercicio1`, `Ejercicio2`, `Ejercicio3` y `CierreEjercicio1`) los solicitan por teclado. Los archivos de pruebas de escritorio no piden datos: usan valores fijos e imprimen las tablas de seguimiento.

## Entrega

PDF con capturas de la ejecución y proyecto comprimido.
