package test.java;

import org.junit.Assert;
import com.hypnootis.pointinsidepolygon.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;


public abstract class AbstractPolygonTest {
	
	public Polygon createPolygon(ArrayList<Point> polygonPoints, String polygonName) {
		
		Polygon testPolygon = new Polygon();
		
		for (Point point : polygonPoints) {
			testPolygon.setPoint(point);
			
		try {
		Path tempFilePath = Files.createTempFile(polygonName, ".txt");
		testPolygon.setPath(tempFilePath);
		
		ArrayList<String> coords = new ArrayList<String>();
		
		for (Point p : testPolygon.getPoints()) {
			coords.add(Arrays.toString(p.getCoordinates()));
		}
		FileManager.writeToFile(coords, tempFilePath);
		
		} catch (Exception e){		
			System.out.println("Error creating temp file!");
			e.printStackTrace();
		}
		}
		
		return testPolygon;
	}
	
	

	public void canSetPoints(Polygon testPolygon, ArrayList<Point> testPoints) {
		 
		Assert.assertEquals(testPoints, testPolygon.getPoints());
	}
	
	public void isInsidePolygon(Polygon testPolygon, Point pointInside, String polygonName) {
		
		Assert.assertTrue(testPolygon.isInside(pointInside));
	}
	

}
	
