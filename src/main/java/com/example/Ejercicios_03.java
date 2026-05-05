package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicios_03 {
    // Arrays o Matrices en Java 🗂️
    /*
     * Un array o matriz en Java es una estructura de datos que almacena una
     * colección de elementos del mismo tipo. Los arrays tienen un tamaño fijo,
     * lo que ignifica que una vez creado, no se puede cambiar su tamaño.
     */

    public static void main(String[] args) {
        // Arrays
        System.out.println("Arrays o Matrices en Java 🗂️");
        String nombre[] = { "Juan", "Maria", "Pedro", "Ana" };
        System.out.println("Aceder a un elemento del array: " + nombre[0]); // Accede al primer elemento
        System.out.println("Longitud del array: " + nombre.length); // Muestra la longitud del array
        nombre[0] = "Jose manuel"; // Modificar un elemento del array
        System.out.println("Elemento modificado: " + nombre[0]); // Muestra el elemento modificado
        Arrays.sort(nombre);// Ordena el array alfabéticamente
        System.out.println("Array ordenado: " + Arrays.toString(nombre)); // Muestra el array ordenado
        System.out.println("Iterar sobre el array:");
        for (String n : nombre) {
            System.out.println("Elemento del array: " + n); // Itera sobre el array y muestra cada elemento
        }

        // ArraysList en Java 📋
        System.out.println("\nArraysList en Java 📋");
        ArrayList<String> listaNombres = new ArrayList<String>();
        System.out.println("Agregar elementos a la lista:");
        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Pedro");
        listaNombres.add("Ana");
        System.out.println("Elementos de la lista: " + listaNombres);
        System.out.println("Acceder a un elemento de la lista: " + listaNombres.get(0)); // Accede al primer elemento
        System.out.println("Longitud de la lista: " + listaNombres.size()); // Muestra la longitud de la lista
        listaNombres.set(0, "Jose manuel"); // Modificar un elemento de la lista
        System.out.println("Elemento modificado: " + listaNombres.get(0)); // Muestra el elemento modificado
        System.out.println("Ordenar la lista alfabéticamente:");
        listaNombres.sort(String::compareTo); // Ordena la lista alfabéticamente
        System.out.println("Lista ordenada: " + listaNombres); // Muestra la lista ordenada
        System.out.println("Iterar sobre la lista:");
        for (String n : listaNombres) {
            System.out.println("Elemento de la lista: " + n); // Itera sobre la lista y muestra cada elemento
        }
    }

}
