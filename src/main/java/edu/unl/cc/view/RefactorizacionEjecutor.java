package edu.unl.cc.view;

import edu.unl.cc.domain.refactorizacion.MensajeConsola;
import edu.unl.cc.domain.refactorizacion.NumeroPositivo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RefactorizacionEjecutor {

    public static void main(String[] args) {

        // Crear los objetos de las clases.
        NumeroPositivo sumador = new NumeroPositivo();
        MensajeConsola impresora = new MensajeConsola();

        Scanner scanner = new Scanner(System.in);

        try {

            // Solicitar los numeros al usuario.
            System.out.print("Ingrese el primer número: ");
            int primerNumero = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int segundoNumero = scanner.nextInt();

            // Realizar la suma de los numeros positivos.
            int resultado = sumador.addPositiveNumbers(
                    primerNumero, segundoNumero
            );

            // Imprimir el resultado.
            impresora.printMensaje(
                    "El resultado de la suma es: " + resultado
            );

        } catch (IllegalArgumentException e) {

            // Mostrar el error si los numeros no son positivos.
            System.out.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {

            // Mostrar el error si se ingresan datos que no son enteros.
            System.out.println("Error: Debe ingresar números enteros.");

        } finally {
            scanner.close();
        }
    }
}