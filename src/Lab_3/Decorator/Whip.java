package Lab_3.Decorator;

public class Whip extends CondimentDecorator {
    public Whip(String description, float cost, Beverage beverage) {
        super(description, cost, beverage);
    }
}
