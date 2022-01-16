package com.hypnootis.pointinsidepolygon;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	private static ArrayList<double[]> fileContents = new ArrayList<double[]>();
	
		public void ReadFile(String fileName) {
		
			try {
			
				Path path = Paths.get("src/" + fileName);
				List<String> lines; // java.nio.file.File returns file contents in List<String> format
				lines = Files.readAllLines(path);
				
				for (String line : lines) {
					String[] strCoordinates = line.split(",");
					double[] dblCoordinates = new double[2]; // ex. line: [1.5, 1.2]
					
					try {
					dblCoordinates[0] = Double.parseDouble(strCoordinates[0]);
					dblCoordinates[1] = Double.parseDouble(strCoordinates[1]);
					
					fileContents.add(dblCoordinates);
					} catch (Exception e) {
						System.out.println("Failed to convert line to double!");
					}
				}
			
			
				if (lines.isEmpty()) {
				throw new RuntimeException(fileName + " is an empty file");
				}
			
				}
		
		
			catch (IOException e) {
				System.out.println("File not found!");
				e.printStackTrace();
			}
		
		
			}
	
		public ArrayList<double[]> getData(){
		
		return fileContents;
	}
	
		
		private static Path path = Paths.get("src/selvitys.txt");

		
		public static void createFile() {
		
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
		
		
		public static void writeToFile(String writing) {
			try {
			Files.write(path, writing.getBytes());
		} catch (Exception e) {
			System.out.println("Error writing to file!");
			e.printStackTrace();
		}
		}

}
