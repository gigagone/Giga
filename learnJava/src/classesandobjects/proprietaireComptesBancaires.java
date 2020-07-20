package classesandobjects;

public class proprietaireComptesBancaires {
	
	String nom;
	String prenom;
	int age;
	float soldeCompte;
	boolean eligibiliteCarteDeCredit;
	
	public void calculEligibiliteCC(){
		if (age>18 && soldeCompte>=1000) {
			eligibiliteCarteDeCredit = true;
		}
	}
}
