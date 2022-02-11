package test.java;

import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithFile extends TestPolygonWithoutFile {
	
	
	/*
	@Test
	public void canSetPoints() {

		Path polygonPath = TestPoints.getShape("testPolygon").getPath();
		ArrayList<Point> polygonPoints = FileManager.coordinatesFromFile(polygonPath);
		Polygon testPolygon = super.createPolygon(polygonPoints, "testPolygon");
		System.out.println(TestPoints.getPoints());
		
		super.canSetPoints(testPolygon, TestPoints.getPoints());
	}
	*/
	
	@Test
	public void isInsideTriangle() {
		
		Path polygonPath = TestPoints.getShape("triangle").getPath();
		Polygon testPolygon = super.createPolygon(FileManager.coordinatesFromFile(polygonPath), "triangle");
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "triangle");
	}
	
	@Test
	public void isInsideSquare() {
		
		Path polygonPath = TestPoints.getShape("square").getPath();
		Polygon testPolygon = super.createPolygon(FileManager.coordinatesFromFile(polygonPath), "square");
		
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "square");
	}
	
	@Test
	public void isInsidePentagon() {
		
		Path polygonPath = TestPoints.getShape("pentagon").getPath();
		Polygon testPolygon = super.createPolygon(FileManager.coordinatesFromFile(polygonPath), "pentagon");
		
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "pentagon");
	}
	
	@Test
	public void isOnBorder() {
		
		Path polygonPath = TestPoints.getShape("triangle").getPath();
		Polygon testPolygon = super.createPolygon(FileManager.coordinatesFromFile(polygonPath), "triangle");
		
		super.isInsidePolygon(testPolygon, TestPoints.getPoints(), "triangle");
	}

	
}

