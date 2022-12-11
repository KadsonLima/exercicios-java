import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of shapes:");
        int numberShapes = sc.nextInt();

        List<Shape> list = new ArrayList<>();


        for (int i = 0; i < numberShapes; i++) {
            System.out.println("Shape #"+ (i + 1) + " data:");
            System.out.printf("Rectangle or Circle (r/c)?");
            char shapeType = sc.next().charAt(0);
            System.out.printf("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());

            if(shapeType == 'r'){
                System.out.printf("Width :");
                double width = sc.nextDouble();
                System.out.printf("Height :");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);
                list.add(shape);
                
            }else if(shapeType == 'c'){

                System.out.printf("Radius :");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);
                list.add(shape);
            }

        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(shape.area());
        }


    }
}
