package DrawingShapes;

public abstract class Shape {
    void draw() {
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Draw Square");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Draw Triangle");
    }
}