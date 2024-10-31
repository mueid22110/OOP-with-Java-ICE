import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Assignment_02 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        c = sc.nextDouble();

        double x1, x2;
        x1 = (-b +(sqrt(pow(b,2) - (4 * a * c))))/(2 * a);
        System.out.println(x1);

        x2 = (-b - (sqrt(pow(b,2) - (4 * a * c))))/(2 * a);
        System.out.println(x2);
    }
}
