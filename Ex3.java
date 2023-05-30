class Figure {
    protected String color;
    protected int edgeThickness;
    protected boolean fill;

    public Figure(String color, int edgeThickness, boolean fill) {
        this.color = color;
        this.edgeThickness = edgeThickness;
        this.fill = fill;
    }

    public void draw() {
        System.out.println("Figure:");
        System.out.println("Color: " + color);
        System.out.println("Edge thickness: " + edgeThickness);
        System.out.println("Fill: " + (fill ? "filled" : "empty"));
    }
}

class Circle extends Figure {
    private double x, y;
    private double radius;

    public Circle(String color, int edgeThickness, boolean fill, double x, double y, double radius) {
        super(color, edgeThickness, fill);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle:");
        System.out.println("Center: (" + x + ", " + y + ")");
        System.out.println("Radius: " + radius);
    }
}

class Rectangle extends Figure {
    private double x, y;
    private double lengthA, lengthB;

    public Rectangle(String color, int edgeThickness, boolean fill, double x, double y, double lengthA, double lengthB) {
        super(color, edgeThickness, fill);
        this.x = x;
        this.y = y;
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Rectangle:");
        System.out.println("Upper left corner: (" + x + ", " + y + ")");
        System.out.println("Length of side A: " + lengthA);
        System.out.println("Length of side B: " + lengthB);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[2];
        figures[0] = new Circle("red", 2, true, 0, 0, 5);
        figures[1] = new Rectangle("blue", 1, false, 0, 0, 10, 5);

        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}