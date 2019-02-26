package ua.com.qalight;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ua.com.qalight.Circle.Circle;
import ua.com.qalight.Square.Square;
import ua.com.qalight.Triangle.Triangle;
import ua.com.qalight.abstraction.Shape;

public class ApplicationRunner {
	
	private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

	public static void main(String[] args) {
		
		Square square = new Square(15);
		
		logger.info("Square with side " + square.getSide() + " has area " + square.getArea());
		
		Circle circle = new Circle(25);
		
		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
		
		Triangle triangle = new Triangle(6,18);
		
		logger.info("Triangle with bese " + triangle.getBese() + " and heigth " + triangle.getHeigth() + " has area " + triangle.getArea());
		

		List<Shape> shapes = new ArrayList();
		
		Shape square1 = new Square(10);
		Shape square2 = new Square(100);
		Shape square3 = new Square(1000);
		Shape square4 = new Square(10000);
		
		Shape circle1 = new Circle(10);
		Shape circle2 = new Circle(100);
		Shape circle3 = new Circle(1000);
		Shape circle4 = new Circle(10000);
		
		shapes.add(square1);
		shapes.add(square2);
		shapes.add(square3);
		shapes.add(square4);
		
		for(int i = 0; i < shapes.size(); i++){
			logger.info("Shape" + shapes.get(i).get.Class().getSimpleName() + "has area" + shapes.get(i).getArea());
		}
		
	}

}


