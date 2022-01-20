package test.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithFile extends AbstractPolygonTest {

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

