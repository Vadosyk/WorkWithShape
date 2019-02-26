package ua.com.qalight;

import java.util.logging.Level;
import java.util.logging.Logger;

import ua.com.qalight.Circle.Circle;
import ua.com.qalight.Square.Square;
import ua.com.qalight.Triangle.Triangle;

public class ApplicationRunner {
	
	private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

	public static void main(String[] args) {
		
		Square square = new Square(15);
		
		logger.info("Square with side " + square.getSide() + " has area " + square.getArea());
		
		Circle circle = new Circle(25);
		
		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
		
		Triangle triangle = new Triangle(6,18);
		
		logger.info("Triangle with bese " + triangle.getBese() + " and heigth " + triangle.getHeigth() + " has area " + triangle.getArea());
		

	}

}
