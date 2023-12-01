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
		if (num > 1 && num < 11) return num + " de " + palo;
		if (num == 1) return "As de " + palo;
		if (num == 11) return "J de " + palo;
		if (num == 12) return "Q de " + palo;
		if (num == 13) return "K de " + palo;
		else return null;
	}
}
