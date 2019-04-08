package Lab_3.Observer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student s1 = new Student("Ana");
        Student s2 = new Student("Paul");
        Student s3 = new Student("Panturu");

        s1.listenTo(teacher);
        s2.listenTo(teacher);
        s3.listenTo(teacher);

        teacher.notifyObserver("OOP");

        teacher.unregister(s1);

        teacher.notifyObserver("Design patterns");
    }
}