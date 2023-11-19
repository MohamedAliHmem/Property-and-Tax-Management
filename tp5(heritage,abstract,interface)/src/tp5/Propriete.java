package tp5;

public abstract class Propriete {
	int id ;
	Personne responsable ;
	String adresse ;
	double surface ;
	
	

	public Propriete(int id, Personne responsable, String adresse, double surface) {
		this.id = id;
		this.responsable = responsable;
		this.adresse = adresse;
		this.surface = surface;
	}


	@Override
	public String toString() {
		return "Propriete [id=" + id + ", responsable=" + responsable.toString() + ", adresse=" + adresse + ", surface=" + surface
				+ "]";
	}

	abstract double calculImpot();
	
	boolean equals(Propriete p) {
		if (this.id == p.id) {
			return true ;
		}
		else
			return false ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
