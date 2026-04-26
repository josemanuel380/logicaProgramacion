package com.example;

public class Ejercicios_02 {
    public static void main(String[] args) {
        Ejercicios_02 ejercicios = new Ejercicios_02();

        System.out.println(ejercicios.obtenerEntero());
        System.out.println(ejercicios.obtenerCadena());
        ejercicios.imprimirMensaje();
        ejercicios.imprimirMensaje();
        ejercicios.imprimirMensaje();
        ejercicios.mensaje("jose manuel");
        ejercicios.myPersona("jose manuel", 25);
        System.out.println(ejercicios.mensaje("bienvenido", "jose manuel", 25));

    }

    /***
     * Funciones definida por el usuario: Son aquellas que el programador
     * crea para realizar tareas específicas.
     ***/

    // imprime entero
    public int obtenerEntero() {
        return 20;
    }

    // imprime cadena
    public String obtenerCadena() {
        return "Hola, Java";
    }

    // funcion sin retorno
    public void imprimirMensaje() {
        System.out.println("Este es un mensaje de ejemplo.");
    }

    // Fucnion con un argumento
    public void mensaje(String saludo) {
        System.out.println("Hola, " + saludo);
    }

    // Funcion con varios argumentos
    public void myPersona(String nombre, int edad) {
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Funcion con retorno y varios argumentos
    public String mensaje(String saludo, String nombre , int edad) {
        return saludo + ", " + nombre + " y tengo " + edad + " años.";
    }
}
