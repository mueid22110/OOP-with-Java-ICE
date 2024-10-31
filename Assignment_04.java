import java.util.Scanner;

public class Assignment_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        if(f == 0){
            System.out.println("zero");
        } else if (f < 0) {
            System.out.println("negative");
        } else if (f>0 && f<1) {
            System.out.println("small positive");
        } else if (f>0 && f<1000000) {
            System.out.println("large Positive");
        } else System.out.println("Positive");

    }
}
