package edu.unl.cc.domain.refactorizacion;

// Nombres significativos: el nombre de la clase indica
// que se encarga de sumar números positivos
public class NumeroPositivo {

    // Nombre significativo: el metodo describe
    // la operacion que realiza y los parametros que recibe
    public int addPositiveNumbers(int primerNumero, int segundoNumero) {

        // Simplificación de la logica: se valida primero
        // si alguno de los números no es positivo
        if (primerNumero <= 0 || segundoNumero <= 0) {

            // Manejo de errores: se lanza una excepcion
            // en lugar de imprimir un mensaje de error por consola
            throw new IllegalArgumentException(
                    "Los números deben ser positivos"
            );
        }

        // Simplificacion: se elimina la variable innecesaria
        // y se devuelve directamente el resultado
        return primerNumero + segundoNumero;
    }
}

// Magic Numbers: el valor 0 representa el límite natural
// para comprobar si un número es positivo, por lo que
// no es necesario convertirlo en una constante


