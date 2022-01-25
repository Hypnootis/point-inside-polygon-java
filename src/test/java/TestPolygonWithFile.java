package test.java;

import java.util.ArrayList;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class TestPolygonWithFile extends AbstractPolygonTest {
	
	@Test
	public void canSetPoints() {
		ArrayList<Point> testPoints = new ArrayList<Point>();
		
		super.canSetPoints(testPoints, "myPoints");
	}

	
}

