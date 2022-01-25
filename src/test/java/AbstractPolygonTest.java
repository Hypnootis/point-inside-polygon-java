package test.java;

import org.junit.Assert;
import com.hypnootis.pointinsidepolygon.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public abstract class AbstractPolygonTest {
	

	private Polygon createPolygon(ArrayList<Point> polygonPoints, String polygonName) {
		Polygon testPolygon = new Polygon();
		
		for (Point point : polygonPoints) {
			testPolygon.setPoint(point);
			
		try {
		Path tempFilePath = Files.createTempFile(polygonName, ".txt");
		testPolygon.writeResults(polygonName + ".txt", tempFilePath);
		
		} catch (Exception e){		
			System.out.println("Error creating temp file!");
			e.printStackTrace();
		}
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
	
