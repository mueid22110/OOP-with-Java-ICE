import java.util.Scanner;

public class Assignment_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0 || year%400 == 0){
            System.out.println("Leap year");
        }else System.out.println("Not Leap year");
    }
}
