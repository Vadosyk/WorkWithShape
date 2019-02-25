package ua.com.qalight.Triangle;

import ua.com.qalight.abstraction.Shape;

public class Triangle implements Shape {
	
	private int bese;
	private int heigth;
	
	public int getBese() {
		return bese;
	}


	public void setBese(int bese) {
		this.bese = bese;
	}


	public int getHeigth() {
		return heigth;
	}


	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}


	public int getArea() {
		
		return bese*heigth/2;
	}


	public Triangle(int bese, int heigth) {
		this.bese = bese;
		this.heigth = heigth;
	}

	public Triangle() {
		
	}
}
