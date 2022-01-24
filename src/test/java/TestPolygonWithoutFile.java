package test.java;

import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithoutFile extends AbstractPolygonTest {
	
	@Test
	public void canSetPoints() {
		ArrayList<Point> testPoints = new ArrayList<Point>();
		testPoints.add(new Point(2.5, 1.2));
		testPoints.add(new Point(3.5, 12.6));
		testPoints.add(new Point(2.1, 75.1));
		
		super.canSetPoints(testPoints, "testPolygon");
	}
	
}
