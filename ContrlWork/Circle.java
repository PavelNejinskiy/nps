package ContrlWork;

/**
 * Created by java3 on 27.07.17.
 */
public class Circle implements Shape {
    int i;
    Color color;

    public Circle(int i, Color color) {
        super();
        this.color = color;
        this.i = i;
    }

    public double size() {
        double area = Math.PI * (i * i);
        return area;
    }

    public Color color() {

        return color;
    }
}
