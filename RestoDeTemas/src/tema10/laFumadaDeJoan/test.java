package tema10.laFumadaDeJoan;

public class test {

    // 4 clases y 1 interfaz.
    // Interfaz llamada iFuerza, con un método
    // getNivelMidiclorianos();
    // un setNivelMidiclorianos();
    // defautl int estableceNivelMidiclorianos() {
    // devuelve un número aleatorio entre 10000 y 30000
    // }
    // String getColorSable() {}
    // void setColorSable() {}

    // static String estableceColorSable(List<String> listaColores) {
    // devuelve null si la lista está vacía, y un color al azar si no lo está.
    // Hacerlo llamando a collections usando shuffle.
    // Collections.suffle(listaColores);
    // }

    // String getNombre();
    // void setNombre(boolean esJarJarBinks);
    // String generaNombre();

    // static int estableceFuerzaMental(){
    // Devuelve un número aleatorio entre 1 y 10
    // }

    // private static int aleatorioEntero(int limite, int inicio) {
    // Devuelve un entero aleatorio entre el inicio y el limite.
    // }

    // clase MisticoDeLaFuerza 4 atrib private final
    // String nombre, String apellido, String ciudadNatal, String nombreMadre.
    // Constructor
    // String getNombre(String nombre) {
    // devuelve los dos primeros caracteres de el nombre pasado.
    // }
    // String getApellido(String apellido) {
    // devuelve los tres primeros caracteres de el apellido pasado.
    // }
    // String getCiudadNatal(String ciudadNatal) {
    // devuelve los tres primeros caracteres de el ciudadNatal pasado.
    // }
    // String getNombreMadre(String nombreMadre) {
    // devuelve los dos primeros caracteres de el nombreMadre pasado.
    // }

    // clase Jedi hereda de MisticoDeLaFuerza e implementa las interficies iFuerza y
    // Comparable.
    // clase encapsulada. Atrib: int nivelMidiclorianos, String colorSable, String
    // nombre, int FuerzaMental.
    // constructor que necesita los atributos de la clase de la que hereda, y además
    // pide el color del sable y la fuerza mental.
    // llamaremos dentro del constructor: setNivelMidiclorianos, setColorSable,
    // setNombre pasando como parámetro false, setFuerzaMental(fuerzaMental).

    // 2nd constructor: 4 parámetros de la clase padre estarán vacíos.
    // llamaremos dentro del constructor: setNivelMidiclorianos, setColorSable,
    // setNombre pasando como parámetro true, setFuerzaMental(1).
    // Sobreescribir getNivelMidiclorianos, setNivelMidiclorianos llamando a
    // estableceNivelMidiclorianos, getColorSable, getNombre, setNombre si el
    // booleano es true, devuelve JarJar Binks, sino, devuelve una cadena que es:
    // getApellido espacio getNombreMadre concatenado con getCiudadNatal,
    // getFuerzaMental, setFuerzaMental.

    // String toString() { devuelve información de la clase }

    // Un método que nos dé un orden natural a nivel de nombre.

    // Sith hereda de MisticoDeLaFuerza con encapsulados.
    //  clase encapsulada. Atrib: int nivelMidiclorianos, String colorSable, String
    // nombre, String nombreJedi.

    // constructor ciudadNatal, nombreMadre y colorSable.

    // setNivelMidiclorianos, setNombre y setColorSable.

    // constructor vacío con un setNivelMidiclorianos, setNombre con parametro true y setColorSable

    // getNivelMidiclorianos, setNivelMidiclorianos, getColorSable, setColorSable, getNombre, setNombre(String nombre) si es true, se pone el nombre Darth Binks, sino se pone dath espacio getNombreMadre + getCiudadNatal.
    // setNombreJedi, toString que devuelve el nomnbre, color de sable, nivel midicloriano y si nombre jedi no es null, devuelve el antiguo nombre jedi.

    // Test:
    // Menú:
    // 14 puntos:
    // 1. dar de alta jedi. Llamará a un método y se le pasará un conjunto que podrá tener jedis y siths.
    // 2. dar de alta sith. Llamará a un método y se le pasará un conjunto que podrá tener jedis y siths.
    // 3. Mostrar listado de todos los siths y jedis.
    // 4. Mostrar listado de todos los jedis. Se le pasa a una función el conjunto y un predicado para ver si son o no jedis.
    // 5. Mostrar listado de todos los siths. Se le pasa a una función el conjunto y un predicado para ver si son o no jedis.
    // 6. Recuento total de ese conjunto, usando stream.
    // 7. Recuento de jedis.
    // 8. Recuento de siths.
    // 9. Recuento de los que tengan un nivel de midicloriano superior a 25000.
    // 10. Listado de jedis ordenados por fuerza mental.
    // 11. Listado de sith ordenado por nivel de midicloriano.
    // 12. Tranformar en sith a todos los jedis que tengan una fuerza mental inferior a 6.
    // 0. Salir
}
