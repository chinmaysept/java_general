package desgin.pattern.decorator;

//Abstract decorator class - note that it extends Coffee abstract class
public abstract class CoffeeDecorator extends Coffee {
 protected final Coffee decoratedCoffee;

 public CoffeeDecorator(Coffee c) {
     this.decoratedCoffee = c;
 }

 public double getCost() { // Implementing methods of the abstract class
     return decoratedCoffee.getCost();
 }

 public String getIngredients() {
     return decoratedCoffee.getIngredients();
 }
}
