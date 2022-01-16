package com.hypnootis.pointinsidepolygon;

import java.util.ArrayList;

public class Polygon {

	private ArrayList<Point> coordinates = new ArrayList<Point>();
	
	public void setPoint(Point newCoordinate) {
		
		this.coordinates.add(newCoordinate);	
	}
	
	public ArrayList<Point> getPoints() {
		
		return this.coordinates;
	}

	public boolean isInside(Point testPoint) {
		
		int polygonPointAmount = this.coordinates.size();
		int intersections = 0;
		double pointX = testPoint.getCoordinates()[0];
		double pointY = testPoint.getCoordinates()[1];
		
		for (int i = 0; i < polygonPointAmount - 1; i++) {
			double[] linePointA = this.coordinates.get(i).getCoordinates(); // x and y coordinates of a point in polygon
			double[] linePointB = this.coordinates.get(i + 1).getCoordinates(); // x and y coordinates of the next point in polygon
			
			double x1 = linePointA[0];
			double x2 = linePointB[0];
			double y1 = linePointA[1];
			double y2 = linePointB[1]; 
			
			// LinePointA and B are a line of the polygon
			// If a line was drawn from the testPoint to the right, intersections with the line are counted
			// Intersections divisible by 2 = point is outside
			
			if (pointY < y1 != pointY < y2 &&
				pointX < (x2 - x1) * (pointY - y1) / (y2 - y1) + x1) {
				intersections++;
			}
		}
		
		
	return (intersections % 2 != 0 ? true : false);
		
	} 

}