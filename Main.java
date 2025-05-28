// CircleArea.java
class CircleArea {
    double radius;

    CircleArea(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}

// RectanglePerimeter.java
class RectanglePerimeter {
    double length;
    double breadth;

    RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("\nRectangle:");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Circle - visible from main branch
        CircleArea circle = new CircleArea(5.0); // Example radius
        circle.display();

        // Rectangle - visible from Rect-Perimeter branch
        RectanglePerimeter rectangle = new RectanglePerimeter(4.0, 3.0); // Example dimensions
        rectangle.display();
}
}