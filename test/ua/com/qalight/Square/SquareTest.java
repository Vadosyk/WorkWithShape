package ua.com.qalight.Square;

import junit.framework.TestCase;

class SquareTest extends TestCase {
	
	public void testGetAreaWithZero() {
		Square square = new Square(0);
		assertNotNull(square.getArea());
		assertEquals(0,square.getArea());
	}
	
	public void testGetAreaWithOne() {
		Square square = new Square(1);
		assertNotNull(square.getArea());
		assertEquals(1,square.getArea());
	}
	
	public void testGetAreaWithTen() {
		Square square = new Square(10);
		assertNotNull(square.getArea());
		assertEquals(100,square.getArea());
	}

}
