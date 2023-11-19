package tp5;

public interface GestionPropriete {
	final int MAX_PROPRIETES=20 ;
	
	void afficheProprietes();
	boolean ajouter(Propriete p);
	boolean supprimer(Propriete p);
}
