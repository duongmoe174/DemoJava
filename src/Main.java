import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your width");
        double width = scanner.nextDouble();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();

        System.out.println(rectangle.area(width, height));
    }
}
