
public class Rectangle {
	
	public double surface(){
		return hauteur * largeur;
	}
	
	public double getHauteur(){
		return hauteur;
	}
	
	public double getLargeur(){
		return largeur;
	}
	
	public void setHauteur(double h){
		hauteur = h;
	}
	
	public void setLargeur(double l){
		largeur = l;
	}
	
	private double hauteur;
	private double largeur;

}
