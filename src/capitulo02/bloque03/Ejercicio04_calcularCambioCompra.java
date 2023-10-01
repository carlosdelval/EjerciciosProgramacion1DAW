package capitulo02.bloque03;

import java.util.Scanner;

public class Ejercicio04_calcularCambioCompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del artículo: ");
        int precio = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        int cambio = cantidadRecibida - precio;

        int monedas100 = cambio / 100;
        cambio = cambio % 100;

        int monedas50 = cambio / 50;
        cambio = cambio % 50;

        int monedas25 = cambio / 25;
        cambio = cambio % 25;

        int monedas5 = cambio / 5;
        cambio = cambio % 5;

        int monedas1 = cambio;

        System.out.println("El cambio mínimo a devolver es:");
        if (monedas100 > 0) {
            System.out.println(monedas100 + " monedas de 100");
        }
        if (monedas50 > 0) {
            System.out.println(monedas50 + " monedas de 50");
        }
        if (monedas25 > 0) {
            System.out.println(monedas25 + " monedas de 25");
        }
        if (monedas5 > 0) {
            System.out.println(monedas5 + " monedas de 5");
        }
        if (monedas1 > 0) {
            System.out.println(monedas1 + " monedas de 1");
        }
    }
}
