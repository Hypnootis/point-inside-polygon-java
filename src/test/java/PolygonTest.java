package test.java;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class PolygonTest {

	
	@Test
	public void canSetPoints() {
		 
		Polygon testPolygon = new Polygon();
		Point testPoint1 = new Point();
		Point testPoint2 = new Point();
		Point testPoint3 = new Point();
		
		testPoint1.setCoordinates(1, 10);
		testPoint2.setCoordinates(50, 27);
		testPoint3.setCoordinates(14, 56);
		
		ArrayList<Point> testPoints = new ArrayList<Point>();
		testPoints.add(testPoint1);
		testPoints.add(testPoint2);
		testPoints.add(testPoint3);
		
		
		testPolygon.setPoint(testPoint1);
		testPolygon.setPoint(testPoint2);
		testPolygon.setPoint(testPoint3);
		
		Assert.assertEquals(testPoints, testPolygon.getPoints());
	}

	@Test
	public void isPointInsideTriangle() {
		
		Polygon testPolygon = new Polygon();
		testPolygon.setPoint(new Point(1, 10));
		testPolygon.setPoint(new Point(50, 27));
		testPolygon.setPoint(new Point(14, 56));
		
		Point testPoint = new Point();
		testPoint.setCoordinates(10, 15);
		
		Assert.assertTrue(testPolygon.isInside(testPoint));
	}
	
	@Test
	public void isPointInsideRectangle() {
		
		Polygon testPolygon = new Polygon();
		testPolygon.setPoint(new Point(0.7, 0));
		testPolygon.setPoint(new Point(0.7, 50.1));
		testPolygon.setPoint(new Point(50.1, 50.9));
		testPolygon.setPoint(new Point(50.9, 0.7));
		
		Point testPoint = new Point(10.52, 20.15);
		
		Assert.assertTrue(testPolygon.isInside(testPoint));
	}
	
	
	@Test
	public void pointFromFileInTriangle() {
		
		Polygon testPolygon = new Polygon();
		FileManager reader = new FileManager();
		ArrayList<Point> points = Point.coordinatesFromFile("pisteet.txt");
		
		testPolygon.pointsFromFile("polygoni.txt");
		
		for (Point testPoint : points) {
			testPolygon.isInside(testPoint);
		}
		testPolygon.writeResults("testSelvitys.txt");
		reader.ReadFile("testSelvitys.txt");
		List<String> results = reader.getData();
		
		Assert.assertFalse(results.isEmpty());

		
	}
	
	
	
	
	
}
