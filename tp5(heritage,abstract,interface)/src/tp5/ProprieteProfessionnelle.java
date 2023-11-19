package tp5;

public class ProprieteProfessionnelle extends Propriete{
	int nbEmployes ;
	boolean estEtatique ;
	
	public ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes,
			boolean estEtatique) {
		super(id, responsable, adresse, surface);
		this.nbEmployes = nbEmployes;
		this.estEtatique = estEtatique;
	}
	

@Override
	public String toString() {
		return "ProprieteProfessionnelle [nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique + "]";
	}


double calculImpot() {
		if (this.estEtatique) {
			return 100/this.surface+30/this.nbEmployes ;
		}else
			return 0 ;
	}
	
}
