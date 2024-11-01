import java.util.Scanner;

public class Assignment_05 {

    static void myFunc(){
        String[] Day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x>0 && x<8) {
            System.out.println(Day[x - 1]);
        }else myFunc();


    }
    public static void main(String[] args) {
        myFunc();

    }
}
