package com.ranjit.builder;

interface Shape {
	   void draw();
	}
class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
	}
class Square implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
	}
class Circle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
	}
interface Color {
	   void fill();
	}
class Red implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Red::fill() method.");
	   }
	}
class Green implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
	}
class Blue implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Blue::fill() method.");
	   }
	}
abstract class  AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
	
}
class ShapeFactory extends AbstractFactory{

	@Override
	   public Shape getShape(String shapeType){
	   
	      if(shapeType == null){
	         return null;
	      }		
	      
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }
	   

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class ColorFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	   Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      
	      return null;
	   }
	
}
class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")) {
			return new  ColorFactory();
			
		}
		return null;
	}
	
}
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//FactoryProducer fp = new FactoryProducer();
		AbstractFactory shape =FactoryProducer.getFactory("SHAPE");
		//Shape shape= shape.getShape("SHAPE");
		  Shape shape1 = shape.getShape("CIRCLE");
		  shape1.draw();
		// TODO Auto-generated method stub

	}

}
