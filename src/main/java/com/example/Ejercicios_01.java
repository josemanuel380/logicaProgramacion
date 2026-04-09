package com.example;

public class Ejercicios_01 {
    public static void main(String[] args) {

        // Operadores aritméticos
        int primerNumero = 10;
        int segundoNumero = 5;
        int suma = primerNumero + segundoNumero; // operador de suma
        int resta = primerNumero - segundoNumero; // operador de resta
        int multiplicacion = primerNumero * segundoNumero; // operador de multiplicación
        int division = primerNumero / segundoNumero; // operador de división
        int modulo = primerNumero % segundoNumero; // operador de módulo
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores de asignación
        int valor = 10;
        valor += 5; // operador de asignación de suma
        System.out.println("Asignación de suma: " + valor);
        valor -= 3; // operador de asignación de resta
        System.out.println("Asignación de resta: " + valor);
        valor *= 2; // operador de asignación de multiplicación
        System.out.println("Asignación de multiplicación: " + valor);
        valor /= 4; // operador de asignación de división
        System.out.println("Asignación de división: " + valor);
        valor %= 3; // operador de asignación de módulo
        System.out.println("Asignación de módulo: " + valor);

        // Operadores de comparación
        int numeroComparacion1 = 10;
        int numeroComparacion2 = 5;
        boolean igual = numeroComparacion1 == numeroComparacion2; // operador de igualdad
        boolean diferente = numeroComparacion1 != numeroComparacion2; // operador de desigualdad
        boolean mayor = numeroComparacion1 > numeroComparacion2; // operador de mayor que
        boolean menor = numeroComparacion1 < numeroComparacion2; // operador de menor que
        boolean mayorIgual = numeroComparacion1 >= numeroComparacion2; // operador de mayor o igual que
        boolean menorIgual = numeroComparacion1 <= numeroComparacion2; // operador de menor o igual que
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor o igual: " + mayorIgual);
        System.out.println("Menor o igual: " + menorIgual);

        // Operadores lógicos
        boolean banderaVerdadera = true;
        boolean banderaFalsa = false;
        boolean and = banderaVerdadera && banderaFalsa; // operador lógico AND
        boolean or = banderaVerdadera || banderaFalsa; // operador lógico OR
        boolean not = !banderaVerdadera; // operador lógico NOT
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);

        // Operadores de incremento y decremento
        int contador = 10;
        contador++; // operador de incremento
        System.out.println("Incremento: " + contador);
        contador--; // operador de decremento
        System.out.println("Decremento: " + contador);

        // Operadores de concatenación
        String textoSaludo = "Hola";
        String textoMundo = "Mundo";
        String concatenacion = textoSaludo + " " + textoMundo; // operador de concatenación
        System.out.println("Concatenación: " + concatenacion);

        // Operadores ternarios
        int numeroCondicion = 10;
        String resultado = (numeroCondicion > 5) ? "Mayor que 5" : "Menor o igual que 5"; // operador ternario
        System.out.println("Resultado del operador ternario: " + resultado);

        // Operadores de tipo
        Integer objetoNumero = 10;
        boolean esEntero = (objetoNumero instanceof Integer); // operador de tipo instanceof
        System.out.println("Es entero: " + esEntero);

        // Operadores de bit a bit
        int numeroBit1 = 5; // en binario: 0101
        int numeroBit2 = 3; // en binario: 0011
        int andBit = numeroBit1 & numeroBit2; // operador AND bit a bit
        int orBit = numeroBit1 | numeroBit2; // operador OR bit a bit
        int xorBit = numeroBit1 ^ numeroBit2; // operador XOR bit a bit
        int notBit = ~numeroBit1; // operador NOT bit a bit
        System.out.println("AND bit a bit: " + andBit);
        System.out.println("OR bit a bit: " + orBit);
        System.out.println("XOR bit a bit: " + xorBit);
        System.out.println("NOT bit a bit: " + notBit);

        // Operadores de desplazamiento
        int numeroDesplazamiento = 8; // en binario: 1000
        int desplazamientoIzquierda = numeroDesplazamiento << 1; // operador de desplazamiento a la izquierda
        int desplazamientoDerecha = numeroDesplazamiento >> 1; // operador de desplazamiento a la derecha
        System.out.println("Desplazamiento a la izquierda: " + desplazamientoIzquierda);
        System.out.println("Desplazamiento a la derecha: " + desplazamientoDerecha);

        /****
         * Estructuras de control
         ****/
        // Condicionales
        // if permite ejecutar un bloque de código si se cumple una condición
        String mystring = "Jose";
        if (mystring == "Jose") {
            System.out.println("mystring es igual a Jose");
            // else if permite ejecutar un bloque de código si se cumple una condición
            // diferente a la anterior
        } else if (mystring == "Maria") {
            System.out.println("mystring es igual a Maria");
            // else ejecuta el bloque de código si no se cumple ninguna de las condiciones
            // anteriores
        } else {
            System.out.println("mystring no es igual a Jose ni a Maria");
        }

        // *****Iterativas***** //

        // for permite ejecutar un bloque de código un número determinado de veces
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración for: " + i);
        }

        // while permite ejecutar un bloque de código mientras se cumpla una condición
        int maxNumber = 10;
        while (maxNumber < 20) {
            System.out.println("Iteración while: " + maxNumber);
            maxNumber++;
        }
        System.out.println("Valor final de maxNumber: " + maxNumber);

        // do-while permite ejecutar un bloque de código al menos una vez y luego
        // repetirlo mientras se cumpla una condición
        int contadorDoWhile = 0;
        do {
            System.out.println("Iteración do-while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 5);



        // *****Manejo de excepciones***** //
       
        // try-catch permite manejar excepciones que pueden ocurrir durante la ejecución del programa
        try {
            int resultadoDivision = 10 / 0; // Esto lanzará una excepción de división por cero
            System.out.println("Resultado de la división: " + resultadoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero. " + e.getMessage());
        }finally {
            // El bloque finally se ejecuta siempre, independientemente de si se lanzó una excepción o no
            System.out.println("Programa finalizado."); //
        }

    }

}
