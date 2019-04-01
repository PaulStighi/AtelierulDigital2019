package Lab_3.Decorator;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;

    public CondimentDecorator(String description, float cost, Beverage beverage) {
        super(description, cost);
        this.beverage = beverage;
    }

    public String getDescription() {
        return description + ", " + beverage.getDescription();
    }

    public float getCost() {
        return cost + beverage.getCost();
    }
}
