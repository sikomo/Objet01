package geometrie;
import java.util.Scanner;

public class testDrive {
	static private Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		test1();

	}
	
	static Point[] creerTabOfPoint(){
		Point[] tabOfPoint = new Point[3];
		for (int pt = 0; pt < 3; pt++){
			System.out.println("Construction d'un nouveau point");
			tabOfPoint[pt] = new Point();
			System.out.print("Veuillez entrer x : ");
			tabOfPoint[pt].setX(clavier.nextDouble());
			System.out.print("Veuillez entrer y : ");
			tabOfPoint[pt].setY(clavier.nextDouble());
		}
		return tabOfPoint;
	}

	static void test1(){
		Point [] tabOfPoint = creerTabOfPoint();
		Triangle tri = new Triangle(tabOfPoint[0], tabOfPoint[1], tabOfPoint[2]);		
		System.out.println("Périmètre : " + tri.calculerPerimetre());
		if (tri.estIsocele())
			System.out.println("Le triangle est isocèle");
		else 
			System.out.println("Le triangle n'est pas isocèle");
	}

	static void test2(){		
		Triangle tri = new Triangle();
		System.out.println("Périmètre : " + tri.calculerPerimetre());
		if (tri.estIsocele())
			System.out.println("Le triangle est isocèle");
		else 
			System.out.println("Le triangle n'est pas isocèle");

	}
}
