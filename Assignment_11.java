import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        int N = 1, sum = N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of Natural number: ");
        int limit = sc.nextInt();
        while(N<limit){
            System.out.print(N + ", ");
            N++;
            sum+=N;
        }
        System.out.println(N);
        System.out.println("Sum: " + sum);
    }
}
