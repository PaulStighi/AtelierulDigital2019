package Lab_3.Decorator;

public class Milk extends CondimentDecorator {
    public Milk(String description, float cost, Beverage beverage) {
        super(description, cost, beverage);
    }
}
