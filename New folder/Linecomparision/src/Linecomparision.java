
public class Linecomparision {

	public static void main(String[] args) {
		
		System.out.println("welcome to linecomparision problem");
		
		Point p1 = new Point();
		p1.x = 12;
		p1.y = 32;
		
		Point p2 = new Point();
		p2.x = 12;
		p2.y = 32;
		
		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;
		
		Point p3 = new Point();
		p3.x = 17;
		p3.y = 32;
		
		Point p4 = new Point();
		p4.x = 17;
		p4.y = 32;
		
		Line l2 = new Line();
		l1.p1 = p3;
		l1.p2 = p4;
		
		l1.length = (float) l1.getLength();
		l2.length = (float) l2.getLength();
		
		
		System.out.println("Line 1" + l1.getLength());
		System.out.println("Line 2" + l2.getLength());
	}

}
