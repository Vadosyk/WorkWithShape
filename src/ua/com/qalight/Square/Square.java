package ua.com.qalight.Square;

import ua.com.qalight.abstraction.AbstractShape;

public class Square extends AbstractShape{
	
	int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getArea() {
		return side*side;
	}

	public Square(int side) {
		super();
		this.side = side;
	}
	
	public Square(){
	}

	
}

