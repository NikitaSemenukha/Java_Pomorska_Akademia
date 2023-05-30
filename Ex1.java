class Figure {
    protected String name;

    public Figure() {
        this.name = "geometric figure";
    }

    public Figure(String name) {
        this.name = name;
    }

    public void Display() {
        System.out.println("Geometric Figure");
    }
}

class Circle extends Figure {
    protected double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void Display() {
        System.out.println("Geometric Figure - " + name + ", area: " + Area());
    }
}

class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double Volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double Area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void Display() {
        System.out.println("Geometric Figure - " + name + ", area: " + Area() + ", volume: " + Volume());
    }
}

class Cone extends Circle {
    private double height;

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double Volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double Area() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public void Display() {
        System.out.println("Geometric Figure - " + name + ", area: " + Area() + ", volume: " + Volume());
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double Volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double Area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void Display() {
        System.out.println("Geometric Figure - " + name + ", area: " + Area() + ", volume: " + Volume());
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.Display();

        Sphere sphere = new Sphere(3);
        sphere.Display();

        Cone cone = new Cone(3, 7);
        cone.Display();

        Cylinder cylinder = new Cylinder(4, 10);
        cylinder.Display();
    }
}
