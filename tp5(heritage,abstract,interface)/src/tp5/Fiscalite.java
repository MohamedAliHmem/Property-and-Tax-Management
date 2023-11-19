package tp5;

public class Fiscalite {
	
	
	public static void main(String [] args) {
		Personne p1 = new Personne(14455888,"hmem","mohamed") ;
		Personne p2 = new Personne(14455899,"mm","ali");
		Personne p3 = new Personne(14455811,"dali","dali");
		Lotissement l = new Lotissement(10);
		System.out.println(l.ajouter(new ProprietePrivee(1,p1,"Corniche",350,4)));
		System.out.println(l.ajouter(new Villa(2,p2,"Dar Chaabane", 400,6,true)));
		System.out.println(l.ajouter(new Appartement(3,p2,"Hammamet",1200,8, 3)));
		System.out.println(l.ajouter(new ProprieteProfessionnelle(4,p3,"Korba", 1000, 50,true)));
		System.out.println(l.ajouter(new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false)));
		l.afficheProprietes();
	}
}
