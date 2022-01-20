package test.java;

import org.junit.Test;
import org.junit.Assert;
import com.hypnootis.pointinsidepolygon.*;
import java.util.ArrayList;


public abstract class AbstractPolygonTest {
	
	private String tempFolder = System.getProperty("java.io.tmpdir");
	
	private Polygon createPolygon(ArrayList<Point> polygonPoints) {
		Polygon testPolygon = new Polygon();
		
		for (Point point : polygonPoints) {
			testPolygon.setPoint(point);
		}
		
		return testPolygon;
	}
	
	@Test
	public void canSetPoints(ArrayList<Point> testPoints) {
		 
		Polygon testPolygon = createPolygon(testPoints);
		
		Assert.assertEquals(testPoints, testPolygon.getPoints());
	}
	
	@Test
	public void isInsidePolygon(ArrayList<Point> testPoints, Point pointInside) {
		
		Polygon testPolygon = createPolygon(testPoints);
		
		
		Assert.assertTrue(testPolygon.isInside(pointInside));
	}
	

}
	
