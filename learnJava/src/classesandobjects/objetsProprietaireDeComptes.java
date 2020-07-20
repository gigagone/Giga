package classesandobjects;

public class objetsProprietaireDeComptes {

	public static void main(String[] args) {

		proprietaireComptesBancaires thomas = new proprietaireComptesBancaires();
		proprietaireComptesBancaires pierre = new proprietaireComptesBancaires();
		
		thomas.nom = "Martin";
		thomas.prenom = "Thomas";
		thomas.age = 13;
		thomas.soldeCompte = 50000;
		
		thomas.calculEligibiliteCC();
		
		System.out.println("Thomas peut il avoir une CC?" + thomas.eligibiliteCarteDeCredit);
		
		pierre.nom = "Dupont";
		pierre.prenom = "Pierre";
		pierre.age = 29;
		pierre.soldeCompte = 40000;
		
		pierre.calculEligibiliteCC();
		
		System.out.println("Pierre peut il avoir une CC?" + pierre.eligibiliteCarteDeCredit);
		
	}

}
