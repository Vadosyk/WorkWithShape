package ua.com.qalight.Triangle;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {
	
	public void testGetAreaWithZero() {
		Triangle triangle = new Triangle(0,0);
		assertNotNull(triangle.getArea());
		assertEquals(0,triangle.getArea());
	}
	
	public void testGetAreaWithOne() {
		Triangle triangle = new Triangle(1,1);
		assertNotNull(triangle.getArea());
		assertEquals(1,triangle.getArea());
	}
	
	public void testGetAreaWithTen() {
		Triangle triangle = new Triangle(10,10);
		assertNotNull(triangle.getArea());
		assertEquals(100,triangle.getArea());
	}

}
