package tourDeMagie;

public class Magicien {

	public Magicien(){
		System.out.println("[Magicien] un petit tour de magie...");
	}


	public void deviner(int nombreAnnonce) {		
		System.out.println("[Magicien]   - hum... je vois que vous êtes agé de " + (nombreAnnonce + 115) /100 
				+ " ans \n\tet que vous avez " 
				+ (nombreAnnonce + 115) % 100 + " francs suisses en poche !");
	}	

	//public void envoiMesageAecran(String message) {}

}