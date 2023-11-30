package capitulo05.poker;

public class Carta {
	int num, id;
	String palo;
	
	public Carta(int newNum, String newPalo, int identificador){
		palo = newPalo;
		num = newNum;
		id = identificador;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public String toString() {
		return num + " de " + palo;
	}
}
