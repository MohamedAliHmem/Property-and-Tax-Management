package tp5;

public class Lotissement implements GestionPropriete {
	protected Propriete[] tabProp;
	protected int nombre ;
	
	Lotissement(int capacite){
		if(capacite < MAX_PROPRIETES) 
			tabProp = new Propriete[capacite];
		else 
			System.out.println("erreur");
	}
	
	Propriete getProprieteByIndice(int i){
		return this.tabProp[i];
	}
	
	int getNbPieces() {
		int i=0;
		for(int j=0;j<this.tabProp.length;j++) {
			if(this.tabProp[j] instanceof ProprietePrivee) {
				i += ((ProprietePrivee)tabProp[j]).nbPieces ;
			}
		}
		return i ;
	}
	
	public void afficheProprietes() {
		for (int i=0;i<this.tabProp.length;i++) {
			System.out.println(tabProp[i].toString());
		}
	}
	
	public boolean ajouter(Propriete p) {
		int s = this.tabProp.length;
		if (s < MAX_PROPRIETES) {
			this.tabProp[s-1] = p ;
			return true ;
		}else
			return false ;
			
	}
	
	public boolean supprimer(Propriete p) {
		for(int i=0;i<this.tabProp.length;i++) {
			if (this.tabProp[i].equals(p)) {
				this.tabProp[i]= null ;
				for (int j =i;j<this.tabProp.length-1;j++) {
					this.tabProp[j]=this.tabProp[j+1];
				}
				return true ;
			}
		}
		return false ;
	}
	
	
	
	
	
	
	
}
