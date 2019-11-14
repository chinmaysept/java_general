package com.ranjit.builder;

import java.util.ArrayList;
import java.util.List;

interface Item {
	public String name();

	public float price();

	public Packing pack();
}

interface Packing {
	public String Pack();
}

class Wrapper implements Packing {

	@Override
	public String Pack() {
		return "Wrapper";

	}

}

class Bottle implements Packing {

	@Override
	public String Pack() {
		return "Bottle";

	}

}

abstract class Burger implements Item{
	
	public Packing pack(){
		return new Wrapper();
	}
	
	public abstract float price();
}

class VegBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "VegBurger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50;
	}
	
}

class NonVegBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "NonVegBurger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 100;
	}
	
}
abstract class ColdDrink implements Item{
	
	public Packing pack(){
		return new Bottle();
	}
	
	public abstract float price();
}

class Pepsi extends ColdDrink{

	@Override
	public String name() {
		
		return "Pepsi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
class Coke extends ColdDrink{

	@Override
	public String name() {
		
		return "Coke";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 15;
	}
	
}

class Meal {
	List<Item> items = new ArrayList();

	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for(Item item : items ){
			cost += item.price();
		}
		
		return cost;
	}
	
	public void showItem() {
		
		for(Item item : items){
			System.out.print("Item : "+item.name());
			System.out.print(", Packing : "+item.pack().Pack());
			System.out.println(", Price : "+item.price());
		}
	}
}

class MealBuilder{
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
}
public class BuilderPatternDemo {
	public static void main(String[] args) {
	MealBuilder mealBuilder = new MealBuilder();
	
	Meal meal = mealBuilder.prepareVegMeal();
	System.out.println("Veg Meal");
	meal.showItem();
	}

}
