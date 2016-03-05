package tourDeMagie;


public class Assistant {

  //private Integer nombreAnnonce;
  //private Papier myPapier;

    

  /*private int[] lirePapier(Papier papier) {}*/

  private int calculMentalement(Papier papier) {
	int  nombreAnnonce = (2 * papier.getAge() + 5) * 50 + papier.getArgent() - 365;
  return nombreAnnonce;
  }

  public int annoncer(Papier papier) {
	  int nombreAnnonce = calculMentalement(papier);
	  System.out.println("[Assistant] (je lis le papier)");
	  //lirePapier(papier);
	  System.out.println("[Assistant] (je calcule mentalement)");	  
	  System.out.println("[Assistant] J'annonce : " + nombreAnnonce  + " !");
	  return nombreAnnonce;
  }  

}