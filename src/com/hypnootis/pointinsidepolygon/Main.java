package com.hypnootis.pointinsidepolygon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Example of creating a new polygon,
		 * adding points to it from a file, creating a point,
		 * testing if the point is inside or outside the polygon
		 * then writing the results to a text file 
		 */
		Polygon testPolygon = new Polygon();
		ArrayList<Point> testPoints = Point.coordinatesFromFile("pisteet.txt");
		
		testPolygon.pointsFromFile("polygoni.txt");
		testPolygon.isInside(new Point(1.2, 1.6));
		
		for (Point point : testPoints) {
			testPolygon.isInside(point);
		}
		
		
		testPolygon.writeResults("selvitys.txt");
	}

}
