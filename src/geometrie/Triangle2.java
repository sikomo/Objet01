package geometrie;

public class Triangle2 {
	/**
	 * <pre>
	 *           1..1     3..3
	 * Triangle2 ------------------------> Point2
	 *           triangle2        &gt;       point2
	 * </pre>
	 */
	private Point2[] tabOfPoint;

	public Triangle2 (Point2[] tabOfPoint) { // Association
		this.tabOfPoint = tabOfPoint;
	}
	public Triangle2(){ // Composition
		this.tabOfPoint = new Point2[3];		
	}
	//Fin constructeur	

	//accesseurs
	public Point2[] getPoint2() {
		if (this.tabOfPoint == null) {
			this.tabOfPoint = new Point2[3];
		}
		return this.tabOfPoint;
	}
	//Fin accesseurs	

	//Methodes
	private double distance(Point2 pt1, Point2 pt2){
		return Math.sqrt(Math.pow((pt2.getX() - pt1.getX()),2) 
				+ Math.pow((pt2.getY() - pt1.getY()),2));
	}

	public double calculerPerimetre() {
		return distance(tabOfPoint[0], tabOfPoint[1]) 
			 + distance(tabOfPoint[1], tabOfPoint[2]) 
			 + distance(tabOfPoint[2], tabOfPoint[0]);
	}

	public boolean estIsocele() {
		if(distance(tabOfPoint[0], tabOfPoint[1]) == distance(tabOfPoint[1], tabOfPoint[2])
		|| distance(tabOfPoint[0], tabOfPoint[1]) == distance(tabOfPoint[2], tabOfPoint[0])
		|| distance(tabOfPoint[1], tabOfPoint[2]) == distance(tabOfPoint[2], tabOfPoint[0]))
		return true;
		else return false;
	}

}