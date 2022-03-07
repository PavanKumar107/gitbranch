public class Line {
	Point p1;
	Point p2;
	float length;
	
	double getLength(){
		return Math.sqrt(Math.pow((p1.x),2) + Math.pow((p1.y -p2.y),2));
	}
}
