package tp5;

public class Appartement extends ProprietePrivee{
	int numEtage ;

	public Appartement(int id, Personne responsable, String adresse, double surface, int nbPieces, int numEtage) {
		super(id, responsable, adresse, surface, nbPieces);
		this.numEtage = numEtage;
	}

	@Override
	public String toString() {
		return "Appartement [numEtage=" + numEtage + "]";
	}



	
}
