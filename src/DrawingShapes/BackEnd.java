package DrawingShapes;

class BackEnd {
    BackEnd(int option) {
        Shape shape;
        switch (option) {
            case 1:
                shape = new Circle();
                shape.draw();
                break;
            case 2:
                shape = new Triangle();
                shape.draw();
                break;
            case 3:
                shape = new Square();
                shape.draw();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

}
