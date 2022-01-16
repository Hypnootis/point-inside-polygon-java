package com.hypnootis.pointinsidepolygon;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
		private static List<String> fileContents;
		private static String fileName = new String();
		private static Path path = Paths.get("src/" + fileName);
	
		public void ReadFile(String fileName) {
		
			try {
			
				List<String> lines; // java.nio.file.File returns file contents in List<String> format
				lines = Files.readAllLines(path);
			
					
			
			
				if (lines.isEmpty()) {
				throw new RuntimeException(fileName + " is an empty file");
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
		
		
		public static void writeToFile(String[] writing, String fileName) {
			this.fileName = fileName;
			
			try {
			
			for (String line : writing) {
				Files.write(this.path, line.getBytes());
			}
		} catch (Exception e) {
			System.out.println("Error writing to file!");
			e.printStackTrace();
		}
		}

}
