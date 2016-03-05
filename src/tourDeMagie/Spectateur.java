package tourDeMagie;

import java.util.Scanner;

public class Spectateur {

	private int age;
	private int argent;
	//private Papier papier;
	
	/*public Spectateur(Papier papier){
		System.out.println("[Spectateur] (j'entre en scène)");
		this.papier = papier;
	}*/
	
	public Spectateur(){
		System.out.println("[Spectateur] (j'entre en scène)");		
	}
	//Accesseurs
	public void setAge(int age) {
		this.age = age;
	}

	public boolean setArgent(int argent) {
		
		if (argent > 100){
			this.argent = 100;
			return false;
		}
		else{
			this.argent = argent;
			return true;
		}
	}

	public int getAge() {
		return this.age;
	}

	public int getArgent() {
		return this.argent;
	}	
	
	public void ecrireSurPapier(Papier papier) {
		System.out.println("[Spectateur] (j'écris le papier)");
		papier.setAge(age);
		papier.setArgent(argent);		
	}

	public void interrogerSpectateur() {
		Scanner clavier = new Scanner(System.in);

		System.out.print("Quel âge ai-je ? ");
		setAge(clavier.nextInt());
		//this.age = clavier.nextInt();
		
		do{
			System.out.print("Combien d'argent ai-je en poche (<100) ? ");			
		}while(!setArgent(clavier.nextInt()));
		System.out.println("[Spectateur] (j'ai un montant qui convient)");
		clavier.close();
	}

}
