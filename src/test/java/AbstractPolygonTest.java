package test.java;

import org.junit.Test;
import org.junit.Assert;
import com.hypnootis.pointinsidepolygon.*;

import java.nio.file.Paths;
import java.util.ArrayList;


public abstract class AbstractPolygonTest {
	
	private String tempFolder = System.getProperty("java.io.tmpdir");
	

	private Polygon createPolygon(ArrayList<Point> polygonPoints, String polygonName) {
		Polygon testPolygon = new Polygon();
		
		for (Point point : polygonPoints) {
			testPolygon.setPoint(point);
			
		FileManager.createFile(polygonName + ".txt", Paths.get(tempFolder));
		testPolygon.writeResults(polygonName + ".txt");
		}
		
		return testPolygon;
	}
	
	

	public void canSetPoints(ArrayList<Point> testPoints, String polygonName) {
		 
		Polygon testPolygon = createPolygon(testPoints, polygonName);
		
		Assert.assertEquals(testPoints, testPolygon.getPoints());
	}
	
	public void isInsidePolygon(ArrayList<Point> testPoints, Point pointInside, String polygonName) {
		
		Polygon testPolygon = createPolygon(testPoints, polygonName);
		
		
		Assert.assertTrue(testPolygon.isInside(pointInside));
	}
	

}
	
