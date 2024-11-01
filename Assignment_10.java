import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        int N = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of Natural number: ");
        int limit = sc.nextInt();
        while(N<limit){
            System.out.print(N + ", ");
            N++;
        }
        System.out.print(N);
    }
}
