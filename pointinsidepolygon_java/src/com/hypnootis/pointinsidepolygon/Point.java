package com.hypnootis.pointinsidepolygon;

import java.util.ArrayList;
import java.util.List;

public class Point {

	private double[] points = new double[2];
	
	public Point(double x, double y) {
		points[0] = x;
		points[1] = y;
	}
	
	public Point(double[] pointsArray) {
		points = pointsArray;
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
	
	public static ArrayList<Point> coordinatesFromFile(String fileName) {
		
		ArrayList<Point> pointsArray = new ArrayList<Point>();
		FileManager reader = new FileManager();
		reader.ReadFile(fileName);
		List<String> lines = reader.getData();
		
		for (String line : lines) {
			String[] strCoordinates = line.split(",");
			double[] dblCoordinates = new double[2]; // ex. line: [1.5, 1.2]
			
			try {
			dblCoordinates[0] = Double.parseDouble(strCoordinates[0]);
			dblCoordinates[1] = Double.parseDouble(strCoordinates[1]);
			
			pointsArray.add(new Point(dblCoordinates));
			
			
			} catch (Exception e) {
				System.out.println("Failed to convert line to double!");
			}
		}
		
		return pointsArray;
		
		
	}

}

