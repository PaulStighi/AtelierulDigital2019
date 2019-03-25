package Lab_2;

public class Lab2 {
    public static void main(String[] args) {
        Animal Cat = new Cat();
        Animal spider = new Spider();
        Animal fish = new Fish();
        Pet fishPet = new Fish();
        Pet catPet = new Cat("Cat1");
        Cat catCat = new Cat();

        catPet.play();
        catCat.play();
        fishPet.setName("Pablo");
        System.out.println(fishPet.getName());
    }
}
