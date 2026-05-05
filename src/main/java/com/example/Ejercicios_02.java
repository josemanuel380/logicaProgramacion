package com.example;

import java.util.List;

public class Ejercicios_02 {

    /*
     * #1 ¿Qué es una función en Java ☕?
     * Una función en Java, también conocida como método,
     * es un bloque de código que realiza una tarea específica
     * y se ejecuta cuando es llamado.
     */

    // Ejemplo de una función que suma dos números
    public int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    // #2 Modificadores de acceso (public, private, protected) 🔑
    public void funcionPublica() {
        // Accesible desde cualquier clase
        System.out.println("Función pública llamada");
    }

    private void funcionPrivada() {
        // Accesible solo dentro de la clase EjemploModificadores
        System.out.println("Función privada llamada");
    }

    protected void funcionProtegida() {
        // Accesible dentro de la clase EjemploModificadores y sus subclases
        System.out.println("Función protegida llamada");
    }

    void funcionPorDefecto() {
        // Accesible dentro del mismo paquete
        System.out.println("Función por defecto llamada");
    }

    /*
     * #3 Tipo de retorno
     * El tipo de retorno indica el tipo de dato que la función devolverá. Puede ser
     * un tipo primitivo (int, float, etc.), una clase, una interfaz o void si la
     * función no devuelve ningún valor.
     * 
     */

    public int obtenerEntero() {
        return 42;
    }

    public String obtenerCadenaTexto() {
        return "Hola, mundo!";
    }

    public List<String> listaDeCadenaTexto() {
        return List.of("Manzana", "Banana", "Naranja");
    }

    public void funcionSinRetorno() {
        System.out.println("Esta función no devuelve ningún valor");
    }

    /*
     * #4 Parámetros y argumentos
     * Los parámetros son variables que reciben valores de entrada cuando se llama a
     * una función.
     */

    public int sumarNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    public void mostrarCoordenadas(double x, double y, double z) {
        System.out.println("Coordenadas: (" + x + ", " + y + ", " + z + ")");
    }

    /**********************************
     * Variable Local Y Global
     **********************************/

    // 1. Variable Global (o de clase) - accesible en toda la clase
    static String mensajeGlobal = "Soy una variable global";
    int contador = 0; // Variable de instancia

    public void metodoUno() {
        // 2. Variable Local - solo vive dentro de este método
        int numeroLocal = 10;
        System.out.println(mensajeGlobal); // Acceso a la global
        System.out.println(numeroLocal);
    }

    public void metodoDos() {
        // System.out.println(numeroLocal); // ERROR: numeroLocal no existe aquí
        System.out.println(mensajeGlobal); // Acceso permitido
    }

    /*
     * Ejercicio: Escribe un programa que imprima los números del 1 al 100.
     * Pero para los múltiplos de 3, imprime "texto 1" en lugar del número,
     * y para los múltiplos de 5, imprime "texto 2". Para los números que son
     * múltiplos de ambos,imprime "texto 1 texto 2".
     */

    public int printnumber(String text, String text2) {
        int contador = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(text + " " + text2);
            } else if (i % 3 == 0) {
                System.out.println(text);
            } else if (i % 5 == 0) {
                System.out.println(text2);
            } else {
                System.out.println(i);
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Ejercicios_02 programa = new Ejercicios_02();
        // Llamada a los métodos para demostrar el uso de variables globales y locales
        programa.metodoUno();
        programa.metodoDos();

        // Llamada al método para imprimir números del 1 al 100 con las condiciones
        // dadas
        System.out.println("Total de números impresos: " + programa.printnumber("Fizz", "Buzz"));
    }

}
