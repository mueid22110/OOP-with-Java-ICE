import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        int sum = 0, t = 5;
        Scanner sc = new Scanner(System.in);
        while(t > 0 ){
            int x = sc.nextInt();
            sum += x;
            t--;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/5);
    }
}
