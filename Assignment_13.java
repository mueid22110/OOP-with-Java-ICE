import java.util.Scanner;

import static java.lang.Math.pow;

public class Assignment_13 {
    static void myFun(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(pow(x,3));
        myFun();
    }
    public static void main(String[] args) {
        myFun();
    }
}
