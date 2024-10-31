import java.util.Scanner;

public class Assignment_01 {

    static void inp(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Please try again!");
            inp();
        } else if (num>0) {
            System.out.println("Positive");
        }else System.out.println("Negative");
    }

    public static void main(String[] args) {
        inp();
    }

}
