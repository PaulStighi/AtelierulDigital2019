package Lab_5.Shoes;

public abstract class Shoe {
    private String color;
    private int size;

    public Shoe(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
