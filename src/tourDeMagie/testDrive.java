package tourDeMagie;

public class testDrive {

	public static void main(String[] args) {
		Papier papier = new Papier();
		
		Spectateur spectateur = new Spectateur();		
		spectateur.interrogerSpectateur();
		
		Magicien magicien = new Magicien();	
		
		spectateur.ecrireSurPapier(papier);		
		
		Assistant assistant = new Assistant();				
		
		magicien.deviner(assistant.annoncer(papier));
	}
}
