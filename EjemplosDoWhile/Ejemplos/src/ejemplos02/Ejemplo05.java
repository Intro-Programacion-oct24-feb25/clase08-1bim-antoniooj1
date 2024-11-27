/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclado por el usuario.
 */
package ejemplos02;
/**
 *
 * @author reroes
 */import java.util.Scanner;

public class Ejemplo05 {
    

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        Scanner entrada = new Scanner(System.in);
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        System.out.println("Ingrese su potencia");
        potencia = entrada.nextInt();
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
