package capitulo06.mathdatecalendar;

public class piCalculado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double piAprox = 0;
        double termino = 1;
        int denominador = 1;
        int signo = 1;

        while (Math.abs(4 * termino) > 0.0001) {
            piAprox += signo * (4 * termino);
            denominador += 2;
            signo = -signo;
            termino = 1.0 / denominador;
        }

        System.out.println("Nuestro pi aproximado es: " + piAprox);
	}
}
