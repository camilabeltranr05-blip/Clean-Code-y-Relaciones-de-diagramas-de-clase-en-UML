package edu.unl.cc.view;
import edu.unl.cc.domain.refactorizacion.MensajeConsola;
import edu.unl.cc.domain.refactorizacion.NumeroPositivo;



public class RefactorizacionEjecutor {

    public static void main(String[] args) {

        // Crear los objetos de las clases.
        NumeroPositivo sumador = new NumeroPositivo();
        MensajeConsola impresora = new MensajeConsola();

        try {

            // Realizar la suma de dos números positivos.
            int resultado = sumador.addPositiveNumbers(5, 8);

            // Imprimir el resultado.
            impresora.printMensaje("El resultado de la suma es: " + resultado);

        } catch (IllegalArgumentException e) {

            // Mostrar el error si los números no son positivos.
            System.out.println("Error: " + e.getMessage());
        }
    }
}