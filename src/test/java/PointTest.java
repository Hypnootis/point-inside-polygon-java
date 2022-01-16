package test.java;

import org.junit.Test;

import com.hypnootis.pointinsidepolygon.Point;

import org.junit.Assert;

public class PointTest {

	
	@Test
	public void canReturnListOfNumbers() {
		Point testPoint = new Point();
		double[] testArray = {0, 0};
		
		Assert.assertEquals(testArray, testPoint.getCoordinates());
	}
	
	@Test
	public void canSetNumbersAsArray() {
		Point testPoint = new Point();
		double[] testArray = {1, 2};
		
		testPoint.setCoordinates(testArray);
		
		Assert.assertEquals(testArray, testPoint.getCoordinates());
	}
	
	
	@Test
	public void canSetIndividualNumbers() {
		Point testPoint = new Point();
		double testInt1 = 1;
		double testInt2 = 5;
		double[] expectedOutcome = {1, 5};
		
		testPoint.setCoordinates(testInt1, testInt2);
		
		Assert.assertEquals(expectedOutcome, testPoint.getCoordinates());
	}
	
	
}