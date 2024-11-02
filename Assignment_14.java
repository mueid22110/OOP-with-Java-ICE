import java.util.Scanner;

public class Assignment_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res;
        for(int i =1; i<=10; i++){
            res = i * n;
            System.out.println(n+" * "+i+" = "+res);
        }
    }
}
