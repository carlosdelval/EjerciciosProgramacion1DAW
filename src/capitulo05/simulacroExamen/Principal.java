package capitulo05.simulacroExamen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		CampoBatalla campo = new CampoBatalla();
		campo.muestraEstadoActual();
		
		do {
			//Disparar sobre el primer malvado. Necesito que haya un humano vivo.
			if(campo.getPrimerHumanoVivo() != null) {
				campo.getPrimerMalvadoVivo().recibirDisparo();
			}
			
			//Antes de disparar sobre un humano debo comprobar que existe al menos un malvado vivo.
			
			if(campo.getPrimerMalvadoVivo() != null) {
				campo.getPrimerHumanoVivo().recibirDisparo();
			}
			campo.muestraEstadoActual();
			sc.nextLine();
			
		}while(campo.getPrimerHumanoVivo() != null && campo.getPrimerMalvadoVivo() != null);
		
		if(campo.getPrimerHumanoVivo() != null) {
			System.out.println("Han ganado los humanos.");
		}
		else {
			if(campo.getPrimerMalvadoVivo() != null) {
				System.out.println("Han ganado los malvados.");
			}
			else {
				System.out.println("Hay empate.");
			}
		}
	}
}
