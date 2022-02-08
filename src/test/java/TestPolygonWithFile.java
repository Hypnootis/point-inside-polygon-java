package test.java;

import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithFile extends TestPolygonWithoutFile {
	
	@Test
	public void canSetPoints() {

		System.out.println(super.testPolygon.getPath());
		ArrayList<Point> polygonPoints = FileManager.coordinatesFromFile(testPolygon.getPath());
		testPolygon = super.createPolygon(polygonPoints, "testPolygon");
		super.canSetPoints(testPolygon, super.testPointsArray);
	}
	
	@Test
	public void isInsideTriangle() {
		
		testPolygon = super.createPolygon(FileManager.coordinatesFromFile(super.testPolygon.getPath()), "triangle");
		super.isInsidePolygon(testPolygon, super.testPoint, "triangle");
	}

	
}

