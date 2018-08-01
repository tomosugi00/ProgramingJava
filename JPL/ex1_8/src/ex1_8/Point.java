package ex1_8;

public class Point {
	
	public double x, y;
	
	public void clear() {
		this.x = 0.0;
		this.y = 0.0;
	}
	public double distance(Point that) {
		double xdiff = this.x - that.x;
		double ydiff = this.y - that.y;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/* ex1_8 */
	public void move(Point dst) {
		this.x = dst.x;
		this.y = dst.y;
	}
}
