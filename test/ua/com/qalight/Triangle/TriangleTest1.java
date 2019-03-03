package ua.com.qalight.Triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest1 {

	@Test
	void testGetAreaWithZero() {
		Triangle triangle = new Triangle(0,0);
		assertNotNull(triangle.getArea());
		assertEquals(Integer.valueOf(0),triangle.getArea());
	}
	
	@Test
	void testGetAreaWithTwo() {
		Triangle triangle = new Triangle(2,2);
		assertNotNull(triangle.getArea());
		assertEquals(Integer.valueOf(2),triangle.getArea());
	}
	
	@Test
	void testGetAreaWithTen() {
		Triangle triangle = new Triangle(10,10);
		assertNotNull(triangle.getArea());
		assertEquals(Integer.valueOf(50),triangle.getArea());
	}

}
