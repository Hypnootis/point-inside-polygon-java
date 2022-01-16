package test.java;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.hypnootis.pointinsidepolygon.*;

public class FileManagerTest {

	@Test
	public void canOpenFile() {
		FileManager reader = new FileManager();
		reader.ReadFile("pisteet.txt");
	}
	
	@Test
	public void isFileEmpty() {
		FileManager reader = new FileManager();
		reader.ReadFile("pisteet.txt");
		ArrayList<double[]> testArray = reader.getData();
		
		Assert.assertEquals(false, testArray.isEmpty());
		
	}
	
	@Test
	public void canReturnDoubleArray() {
		FileManager reader = new FileManager();
		reader.ReadFile("pisteet.txt");
		ArrayList<double[]> testArray = reader.getData();
		ArrayList<double[]> expectedArray = new ArrayList<double[]>();
		
		Assert.assertSame(expectedArray, testArray);
	}
	
}
