package Practice;

public class Colecciones {
}

//----Consigna----
/*¿Qué colección utilizarías para resolver los siguientes casos de uso?

a) Un registro de autos que ingresan a un estacionamiento. ArrayList<Automovil> sería la
mejor opción. Es necesario llevar un órden y puede un automóvil ingresar más de una
vez al estacionamiento.
b) Un grupo de libros que pertenecen a una única persona.

c) Un registro de préstamos de libros en una biblioteca de una universidad.

d) Todos los alumnos que pertenecen a un curso.

e) Los automóviles que tiene en venta una concesionaria de autos.

f) Los nombres de todas las películas que viste en el cine en los últimos 3 años
ordenadas de la más antigua a la más reciente.
*/

//-----Respuestas------

/* b. Un grupo de libros que pertenecen a una única persona.
Colección recomendada: HashSet<Libro> o ArrayList<Libro>.
*
Si el orden no importa y solo necesitas almacenar libros únicos (sin duplicados),
* HashSet es ideal por su eficiencia en búsquedas.
Si el orden de adquisición es relevante o pueden haber duplicados (ej: dos copias
* del mismo libro), ArrayList es mejor.
*
*
* C) Un registro de préstamos de libros en una biblioteca de una universidad.
Colección recomendada: HashMap<Libro, Alumno> o HashMap<Libro, LocalDate> (si
* necesitas registrar fechas).

Porque necesitas asociar cada libro prestado con un alumno (o fecha). HashMap
* permite pares clave-valor, donde el libro sería la clave y el alumno/fecha el valor.

Si un libro puede prestarse múltiples veces (pero no al mismo tiempo), también podrías
* usar una LinkedList<Préstamo> donde Préstamo es una clase con atributos Libro, Alumno y Fecha.

* D) Todos los alumnos que pertenecen a un curso.
Colección recomendada: ArrayList<Alumno> o HashSet<Alumno> (si no hay duplicados).

ArrayList es simple y mantiene el orden de inserción (útil si el orden importa, como por
* lista alfabética).

Si los alumnos son únicos y no importa el orden, HashSet es más eficiente para evitar duplicados.

* E) Los automóviles que tiene en venta una concesionaria de autos.
Colección recomendada: TreeSet<Automovil> (si tienen un orden natural, como por precio) o
* ArrayList<Automovil> (si el orden es arbitrario).
*
Porque TreeSet automáticamente ordena los autos (ej: por modelo, precio, etc.) y evita duplicados.

Si la concesionaria tiene autos idénticos (mismo modelo, mismo precio), ArrayList permite duplicados.

* F) Los nombres de todas las películas que viste en el cine en los últimos 3 años ordenadas de la
* más antigua a la más reciente.
Colección recomendada: LinkedHashSet<String> o TreeSet<String>.

LinkedHashSet mantiene el orden de inserción (si las agregaste en orden cronológico).

TreeSet las ordena alfabéticamente o por fecha si implementas un comparador personalizado
(ej: TreeSet<Pelicula> con atributo fecha).

Si hay películas repetidas (ej: viste la misma película dos veces), usa ArrayList y ordénala
* después con Collections.sort().
*
*
*
* */

