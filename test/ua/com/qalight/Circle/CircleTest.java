package ua.com.qalight.Circle;

import junit.framework.TestCase;

public class CircleTest extends TestCase {
	
	public void testGetAreaWithZero() {
		Circle circle = new Circle(0);
		assertNotNull(circle.getArea());
		assertEquals(0,circle.getArea());
	}
	
	public void testGetAreaWithOne() {
		Circle circle = new Circle(1);
		assertNotNull(circle.getArea());
		assertEquals(3,circle.getArea());
	}
	
	public void testGetAreaWithTen() {
		Circle circle = new Circle(10);
		assertNotNull(circle.getArea());
		assertEquals(314,circle.getArea());
	}

}
