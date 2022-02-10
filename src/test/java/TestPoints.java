package test.java;

import java.util.ArrayList;
import java.util.HashMap;

import com.hypnootis.pointinsidepolygon.*;

public class TestPoints {
	
	private static HashMap<String, Polygon> shapes = new HashMap<String, Polygon>();
	private static ArrayList<Point> testPoints = new ArrayList<Point>();
	
	public static void addShape(String name, Polygon shape) {
		shapes.put(name, shape);
	}
	
	public static HashMap<String, Polygon> getShapes(){
		
		return shapes;
	}
	
	public static Polygon getShape(String name) {
	
		return shapes.get(name);
	}
	
	public static void addPoint(Point point) {
		testPoints.add(point);
	}
	
	public static ArrayList<Point> getPoints(){
		return testPoints;
	}
	
}
