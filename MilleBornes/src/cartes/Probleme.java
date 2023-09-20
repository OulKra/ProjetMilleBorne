package cartes;

public abstract class Probleme extends Carte {

	public enum Type {
		FEU, ESSENCE, CREVAISON, ACCIDENT;
	}
	
	Type type;
	public Probleme(int n, Type t) {
		// TODO Auto-generated constructor stub
	}

}
