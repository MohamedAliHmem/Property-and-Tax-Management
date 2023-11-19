package tp5;

public class ProprietePrivee extends Propriete{
	int nbPieces ;

	public ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces) {
		super(id, responsable, adresse, surface);
		this.nbPieces = nbPieces;
	}
	
	@Override
	public String toString() {
		return "ProprietePrivee [nbPieces=" + nbPieces + "]";
	}

	double calculImpot() {
		return 50/this.surface+ 10 / this.nbPieces ;
	}
	
}
