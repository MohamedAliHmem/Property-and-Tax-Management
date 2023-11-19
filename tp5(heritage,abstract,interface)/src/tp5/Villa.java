package tp5;

public class Villa extends ProprietePrivee{
	boolean avecPiscine ;

	public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
		super(id, responsable, adresse, surface, nbPieces);
		this.avecPiscine = avecPiscine;
	}

	@Override
	public String toString() {
		return "Villa [avecPiscine=" + avecPiscine + "]";
	}
	
double calculImpot() {
	if (this.avecPiscine)
		return super.calculImpot()+200 ;
	else
		return super.calculImpot();
	}

	
	
	
}
