package geometrie;


public class Triangle {

	/**
	 * <pre>
	 *           1..1     est composé de     3..3
	 * Triangle ------------------------> Point
	 *           triangle        &gt;       point
	 * </pre>
	 */
	private Point ptA;
	private Point ptB;
	private Point ptC;
	
	//constructeur	
	public Triangle (Point ptA, Point ptB, Point ptC) {
		this.ptA = ptA;
		this.ptB = ptB;
		this.ptC = ptC;

	}
	
	public Triangle(){
		this.ptA = new Point();
		this.ptB = new Point();
		this.ptC = new Point();
	}
	//Fin constructeur	
	
	//accesseurs
	public Point getPTA() {
		return this.ptA;
	}

	public Point getPTB() {
		return this.ptB;
	}

	public Point getPTC() {
		return this.ptC;
	}

	public void setPTA(Point ptA){
		this.ptA = ptA;
	}

	public void setPTB(Point ptB){
		this.ptB = ptB;
	}

	public void setPTC(Point ptC){
		this.ptC = ptC;
	}
	//Fin accesseurs	
	
	//Méthodes
	private double distance(Point pt1, Point pt2){
		return Math.sqrt(Math.pow((pt2.getX() - pt1.getX()),2) 
				+ Math.pow((pt2.getY() - pt1.getY()),2));
	}

	public double calculerPerimetre() {
		return distance(ptA, ptB) + distance(ptB, ptC) + distance(ptC, ptA);
	}

	public boolean estIsocele() {
		if(distance(ptA, ptB) == distance(ptB, ptC) || 
		   distance(ptA, ptB) == distance(ptC, ptA) || 
		   distance(ptB, ptC) == distance(ptC, ptA)) return true;
		else return false;
	}
}
