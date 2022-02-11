package test.java;

import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithoutFile extends AbstractPolygonTest {
	
	@Test
	public void isInsideTriangle() {
		
		ArrayList<Point> polygonPoints = new ArrayList<Point>();
		polygonPoints.add(new Point(2.7, 13.5));
		polygonPoints.add(new Point(2.7, 12.2));
		polygonPoints.add(new Point(3.2, 12.9));
		
		Point testPoint = new Point(2.7, 13.5);
		TestPoints.addPoint(testPoint);
		
		
		Polygon testPolygon = super.createPolygon(polygonPoints, "triangle");
		TestPoints.addShape("triangle", testPolygon);
		
		super.isInsidePolygon(testPolygon, testPoint, "triangle");
	}
	
	@Test
	public void isInsideSquare() {
		ArrayList<Point> polygonPoints = new ArrayList<Point>();
		polygonPoints.add(new Point(0, 0));
		polygonPoints.add(new Point(0, 3));
		polygonPoints.add(new Point(3, 3));
		polygonPoints.add(new Point(3, 0));
		
		Point testPoint = new Point (1, 1);
		TestPoints.addPoint(testPoint);
		
		
		Polygon testPolygon = super.createPolygon(polygonPoints, "square");
		TestPoints.addShape("square", testPolygon);
		
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "square");
	}
	
	@Test
	public void isInsidePentagon() {
		ArrayList<Point> polygonPoints = new ArrayList<Point>();
		polygonPoints.add(new Point(0, 0));
		polygonPoints.add(new Point(0, 3));
		polygonPoints.add(new Point(5, 0));
		polygonPoints.add(new Point(7, 3));
		polygonPoints.add(new Point(5, 3));
		
		Point testPoint = new Point (1, 1);
		TestPoints.addPoint(testPoint);
		
		
		Polygon testPolygon = super.createPolygon(polygonPoints, "pentagon");
		TestPoints.addShape("pentagon", testPolygon);
		
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "pentagon");
	}
	
	@Test
	public void isOnBorder() {
		
		Point testPoint = new Point (2.7, 13);
		TestPoints.addPoint(testPoint);
		Polygon testPolygon = TestPoints.getShape("triangle");
		
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "triangle");
	}
}
	

