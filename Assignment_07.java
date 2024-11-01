import java.util.Scanner;

public class Assignment_07 {
    static void myFunc(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n<1 || n>12){
            myFunc();
        }else {
            if(n<8 && n%2==1){
                System.out.println(31);
            } else if (n == 2) {
                System.out.print("Enter the year: ");
                int year = sc.nextInt();
                if(year%4 == 0){
                    System.out.println(29);
                }else System.out.println(28);
            } else if (n<8 && n%2 == 0) {
                System.out.println(30);
            } else if (n%2 == 1) {
                System.out.println(30);
            }else System.out.println(31);
        }

    }
    public static void main(String[] args) {
        myFunc();
    }
}
