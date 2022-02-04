package test.java;

import org.junit.Assert;
import com.hypnootis.pointinsidepolygon.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;


public abstract class AbstractPolygonTest {
	
	private Polygon createPolygon(ArrayList<Point> polygonPoints, String polygonName) {
		
		FileManager.setTestMode(true);
		
		Polygon testPolygon = new Polygon();
		
		for (Point point : polygonPoints) {
			testPolygon.setPoint(point);
			
		try {
		Path tempFilePath = Files.createTempFile(polygonName, ".txt");
		
		ArrayList<String> coords = new ArrayList<String>();
		
		for (Point p : testPolygon.getPoints()) {
			coords.add(Arrays.toString(p.getCoordinates()));
		}
		FileManager.writeToFile(coords, polygonName, FileManager.getDefaultPath());
		
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
	
