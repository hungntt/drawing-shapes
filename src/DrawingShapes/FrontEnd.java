package DrawingShapes;

import java.util.Scanner;

public class FrontEnd {
    private FrontEnd() {
        System.out.println("Option:");
        System.out.println("Circle: 1");
        System.out.println("Triangle: 2");
        System.out.println("Square: 3");
        System.out.println("Exit: other");
    }

    public static void main(String args[]) {
        new FrontEnd();
        int opt;
        while(true){
            Scanner scanner = new Scanner(System.in);
            opt = scanner.nextInt();
            new BackEnd(opt);
        }
    }
}