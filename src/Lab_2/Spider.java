package Lab_2;

public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Eat like a spider");
    }
}
