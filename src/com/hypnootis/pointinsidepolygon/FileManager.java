package com.hypnootis.pointinsidepolygon;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
		private static List<String> fileContents;
		public static Path defaultPath = Paths.get("src").toAbsolutePath();
		
		public static void readFile(Path path) {
		
			try {
			
				// java.nio.file.File returns file contents in List<String> format
				fileContents = Files.readAllLines(path);
			
				if (fileContents.isEmpty()) {
				throw new RuntimeException("File is empty");
				}
			
				}
		
		
			catch (IOException e) {
				System.out.println("File not found!");
				e.printStackTrace();
			}
		
		
			}
	
		public List<String> getData(){
		
		return fileContents;
	}
	

		
		public static void createFile(String fileName, Path path) {
		
		try {

			
			if (Files.exists(path)) {
				System.out.println("File already exists, deleting...");
				Files.delete(path);
				Files.createFile(path);
			}
			else {
				Files.createFile(path);
				System.out.println("File created");
			}
			
		} catch (Exception e) {
			System.out.println("Error creating file!");
			e.printStackTrace();
		}
		}
		
		
		public static void writeToFile(ArrayList<String> writing, Path path) {
			
			
			try {
				
			for (String line : writing) {
				line += "\n";
				Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
			}
			
		} catch (Exception e) {
			System.out.println("Error writing to file!");
			e.printStackTrace();
		}
		}

		public static ArrayList<Point> coordinatesFromFile(Path path) {
			
			readFile(path);
			ArrayList<Point> pointsArray = new ArrayList<Point>();
			List<String> lines = fileContents;
			
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
		
		
		

