import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCercle {
	static DecimalFormat df = new DecimalFormat("#0.000");
	static Scanner keyb = new Scanner(System.in);

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle();
		Cercle cercle2 = new Cercle();
		Cercle cercle3 = new Cercle();
		double xm = 0.0, ym = 0.0;
		double xc = 0.0, yc = 0.0, rayonCercle = 0.0;
		String message = "";

		System.out.println("Configuration du cercle");
		System.out.println("------------------------");
		System.out.println("\tEntrer les coordonnées du cercle : ");
		System.out.print("\t\t- x = ");
		xc = keyb.nextDouble();
		System.out.print("\t\t- y = ");
		yc = keyb.nextDouble();		
		cercle1.setCentre(xc, yc);
		System.out.print("\tEntrer la valeur du rayon du cercle : ");
		rayonCercle = keyb.nextDouble();
		cercle1.setRayon(4);
		System.out.println("Surface : " + df.format(cercle1.surface()));
				
		System.out.println();
		System.out.println("=======================");
		System.out.println();

		System.out.println("Test de l'appartenance d'un point M au cercle");
		System.out.println("-----------------------------------------------");
		System.out.println("\tEntrer les coordonnées du point à tester : ");
		System.out.print("\t\t- x = ");
		xm = keyb.nextDouble();
		System.out.print("\t\t- y = ");
		ym = keyb.nextDouble();		

		if (cercle1.estInterieur(xm, ym)){
			message = " l'interiéur du cercle";
		}
		else{
			message = " l'extérieur du cercle";
		}

		System.out.println("Le point (" + xm + "," + ym + ") est a " + message);
	}
}

class Cercle {

	public void setCentre(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void setRayon(double r){
		rayon = r;
	}

	public double surface(){
		return Math.PI * Math.pow(rayon, 2);
	}

	public boolean estInterieur(double x, double y){

		//changement de repère
		double X = x - this.x;
		double Y = y - this.y;

		if ( (X >= -rayon && X <= rayon) && (Y >= -rayon && Y <= rayon) ){
			return true;
		}
		else{
			return false;
		}

	}

	private double rayon = 0.0;
	private double x = 0.0, y = 0.0;
}
