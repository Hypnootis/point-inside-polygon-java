package test.java;

import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithFile extends TestPolygonWithoutFile {
	
	
	
	@Test
	public void canSetPoints() {

		Path polygonPath = TestPoints.getShape("testPolygon").getPath();
		ArrayList<Point> polygonPoints = FileManager.coordinatesFromFile(polygonPath);
		Polygon testPolygon = super.createPolygon(polygonPoints, "testPolygon");
		System.out.println(TestPoints.getPoints());
		super.canSetPoints(testPolygon, TestPoints.getPoints());
	}
	
	@Test
	public void isInsideTriangle() {
		
		Path polygonPath = TestPoints.getShape("triangle").getPath();
		Polygon testPolygon = super.createPolygon(FileManager.coordinatesFromFile(polygonPath), "triangle");
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "triangle");
	}

	
}

