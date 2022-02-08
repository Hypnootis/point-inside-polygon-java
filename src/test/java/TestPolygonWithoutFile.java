package test.java;

import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithoutFile extends AbstractPolygonTest {
	
	ArrayList<Point> testPointsArray = new ArrayList<Point>();
	Point testPoint = new Point(2.7, 12.2);
	Polygon testPolygon = new Polygon();
	
	@Test
	public void canSetPoints() {
		testPointsArray.add(new Point(2.5, 1.2));
		testPointsArray.add(new Point(3.5, 12.6));
		testPointsArray.add(new Point(2.1, 75.1));
		testPolygon = super.createPolygon(testPointsArray, "testPolygon");
		super.canSetPoints(testPolygon, testPointsArray);
	}
	
	@Test
	public void isInsideTriangle() {
		
		ArrayList<Point> polygonPoints = new ArrayList<Point>();
		polygonPoints.add(new Point(2.7, 13.5));
		polygonPoints.add(new Point(2.7, 12.2));
		polygonPoints.add(new Point(3.2, 12.9));
		
		
		testPolygon = super.createPolygon(polygonPoints, "triangle");
		
		super.isInsidePolygon(testPolygon, testPoint, "triangle");
	}
	
}
