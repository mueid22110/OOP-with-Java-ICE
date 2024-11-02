import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        int odd = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i = 0; i<num; i++ ){
            sum+=odd;
            odd+=2;

        }

        System.out.println(sum);
    }
}
