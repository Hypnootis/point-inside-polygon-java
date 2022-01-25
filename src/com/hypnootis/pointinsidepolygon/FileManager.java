package com.hypnootis.pointinsidepolygon;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
		private static List<String> fileContents;
	
		public void ReadFile(String fileName, Path path) {
		
			try {
			
				// java.nio.file.File returns file contents in List<String> format
				fileContents = Files.readAllLines(path);
			
				if (fileContents.isEmpty()) {
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
		
		
		public static void writeToFile(ArrayList<String> writing, String fileName, Path path) {
			
			createFile(fileName, path);
			
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

}
