import java.util.Scanner;

public class Assignment_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        if (Math.abs(f1 - f2) < 0.001) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
        sc.close();
    }
}
