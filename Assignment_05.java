import java.util.Scanner;

public class Assignment_05 {

    static void myFunc(){
        String[] Day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println(Day[x-1]);
                break;
            case 2:
                System.out.println(Day[x-1]);
                break;
            case 3:
                System.out.println(Day[x-1]);
                break;
            case 4:
                System.out.println(Day[x-1]);
                break;
            case 5:
                System.out.println(Day[x-1]);
                break;
            case 6:
                System.out.println(Day[x-1]);
                break;
            case 7:
                System.out.println(Day[x-1]);
                break;
            default:
                myFunc();

        }
    }
    public static void main(String[] args) {
        myFunc();

    }
}
