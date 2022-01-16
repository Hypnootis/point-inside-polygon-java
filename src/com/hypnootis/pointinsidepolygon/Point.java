package com.hypnootis.pointinsidepolygon;

public class Point {

	private double[] points = new double[2];
	
	public Point(double x, double y) {
		points[0] = x;
		points[1] = y;
	}
	
	public Point() {
		// Constructor for no arguments
	}
	
	
	public double[] getCoordinates() {	
		
		return points;
	}


	public void setCoordinates(double[] pointsList) {
		try {
		points = pointsList;
	} catch (Exception e) {
		System.out.println("Input must be two integers or a list of two integers!");
	}
	}
		
	public void setCoordinates(double x, double y) {
		try {
			points[0] = x;
			points[1] = y;
		} catch (Exception e) {
			System.out.println("Input must be two integers or a list of two integers!");
		}
	}

}

