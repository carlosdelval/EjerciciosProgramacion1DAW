package capitulo05.InvasionTierraV2_Herencia;

public class Humano extends Personaje {
	
	public Humano() {
		super();
		this.puntosVida += 50;
	}
	
	public String toString() {
		return "Humano=" + super.toString();
	}
}
