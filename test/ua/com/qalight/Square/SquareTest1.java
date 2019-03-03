package ua.com.qalight.Square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest1 {

	@Test
	void testGetAreaWithZero() {
		Square square = new Square(0);
		assertNotNull(square.getArea());
		assertEquals(Integer.valueOf(0),square.getArea());
	}
	
	@Test
	void testGetAreaWithOne() {
		Square square = new Square(1);
		assertNotNull(square.getArea());
		assertEquals(Integer.valueOf(1),square.getArea());
	}
	
	@Test
	void testGetAreaWithTen() {
		Square square = new Square(10);
		assertNotNull(square.getArea());
		assertEquals(Integer.valueOf(100),square.getArea());
	}

}
