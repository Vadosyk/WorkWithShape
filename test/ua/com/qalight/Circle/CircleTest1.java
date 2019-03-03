package ua.com.qalight.Circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest1 {

	@Test
	void testGetAreaWithZero() {
		Circle circle = new Circle(0);
		assertNotNull(circle.getArea());
		assertEquals(Integer.valueOf(0),circle.getArea());
	}

	@Test
	void testGetAreaWithOne() {
		Circle circle = new Circle(1);
		assertNotNull(circle.getArea());
		assertEquals(Integer.valueOf(3),circle.getArea());
	}
	
	@Test
	void testGetAreaWithTen() {
		Circle circle = new Circle(10);
		assertNotNull(circle.getArea());
		assertEquals(Integer.valueOf(314),circle.getArea());
		
	}
}
