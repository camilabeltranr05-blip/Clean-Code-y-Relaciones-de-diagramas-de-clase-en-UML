package edu.unl.cc.domain.refactorizacion;

// Separacion de responsabilidades (SRP):
// esta clase se encarga unicamente de imprimir mensajes

public class MensajeConsola {

        // Nombre significativo: indica que el método
        // muestra un mensaje por consola

        public void printMensaje(String mensaje) {

            System.out.println("Mensaje: " + mensaje);
        }
    }

