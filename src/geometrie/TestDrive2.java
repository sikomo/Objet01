package geometrie;

import java.util.Scanner;

public class TestDrive2 {
	static private Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		test1();

	}
	
	static Point2[] creerTabOfPoint(){
		Point2[] tabOfPoint = new Point2[3];
		for (int pt = 0; pt < 3; pt++){
			System.out.println("Construction d'un nouveau point");
			tabOfPoint[pt] = new Point2();
			System.out.print("Veuillez entrer x : ");
			tabOfPoint[pt].setX(clavier.nextDouble());
			System.out.print("Veuillez entrer y : ");
			tabOfPoint[pt].setY(clavier.nextDouble());
		}
		return tabOfPoint;
	}
	
	static void test1(){
		Point2[] tabOfPoint = creerTabOfPoint();
		Triangle2 tri = new Triangle2(tabOfPoint);		
		System.out.println("Perimetre : " + tri.calculerPerimetre());
		if (tri.estIsocele())
			System.out.println("Le triangle est isocele");
		else 
			System.out.println("Le triangle n'est pas isocele");
	}

	static void test2(){		
		Triangle2 tri = new Triangle2();
		System.out.println("Perimetre : " + tri.calculerPerimetre());
		if (tri.estIsocele())
			System.out.println("Le triangle est isocele");
		else 
			System.out.println("Le triangle n'est pas isocele");

	}
}

