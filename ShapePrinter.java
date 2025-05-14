import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Shape Menu ======");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the side of the square: ");
                    double side = scanner.nextDouble();
                    double squareArea = side * side;
                    System.out.println("Shape: Square");
                    System.out.println("Side: " + side);
                    System.out.println("Area: " + squareArea);
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("Shape: Rectangle");
                    System.out.println("Length: " + length + ", Width: " + width);
                    System.out.println("Area: " + rectangleArea);
                    break;

                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Shape: Triangle");
                    System.out.println("Base: " + base + ", Height: " + height);
                    System.out.println("Area: " + triangleArea);
                    break;

                case 4:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Shape: Circle");
                    System.out.println("Radius: " + radius);
                    System.out.printf("Area: %.2f\n", circleArea);
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

