package com.tuomas.pointinsidepolygon;

public class Point {

	private int[] points = {0, 0};
	
	
	public int[] getPoints() {
		
		
		return points;
	}


	public void setPoints(int[] pointsList) {
		try {
		points = pointsList;
	} catch (Exception e) {
		System.out.println("Input must be an integer or a list of integers!");
	}
	}
		
	public void setPoints(int x, int y) {
		try {
			points[0] = x;
			points[1] = y;
		} catch (Exception e) {
			System.out.println("Input must be an integer or a list of integers!");
		}
	}

}

