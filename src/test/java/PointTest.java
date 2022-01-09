package test.java;

import org.junit.Test;
import org.junit.Assert;

import com.tuomas.pointinsidepolygon.Point;

public class PointTest {

	@Test
	public void canReturnList() {
		Point testPoint = new Point();
		Assert.assertTrue(testPoint.getPoints() instanceof int[]);
	}
	
	@Test
	public void canReturnListOfNumbers() {
		Point testPoint = new Point();
		int[] testList = {0, 0};
		
		Assert.assertArrayEquals(testList, testPoint.getPoints());
	}
	
	@Test
	public void canSetNumbersList() {
		Point testPoint = new Point();
		int[] testList = {1, 2};
		
		testPoint.setPoints(testList);
		
		Assert.assertArrayEquals(testList, testPoint.getPoints());
	}
	
	
	@Test
	public void canSetIndividualNumbers() {
		Point testPoint = new Point();
		int testInt1 = 1;
		int testInt2 = 5;
		int[] expectedOutcome = {1, 5};
		
		testPoint.setPoints(testInt1, testInt2);
		
		Assert.assertArrayEquals(expectedOutcome, testPoint.getPoints());
	}
}