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
	
	


	
	public void isInsidePolygon(Polygon testPolygon, Point pointInside, String polygonName) {
		
		TestPoints.emptyPointsArray();
		Assert.assertTrue(testPolygon.isInside(pointInside));
	}
	
	public void isInsidePolygon(Polygon testPolygon, ArrayList<Point> points, String polygonName) {
		
		TestPoints.emptyPointsArray();
		Assert.assertTrue(testPolygon.areInside(points));
	}
	

}
	
