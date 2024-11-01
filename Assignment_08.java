import java.util.Scanner;
import java.lang.String;

public class Assignment_08 {
    static void myFunc(){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if(s.length()!=1){
            System.out.println("error");
            myFunc();
        }else {
            if(s.charAt(0)>= 'a' && s.charAt(0)<= 'z'){
                if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
                    System.out.println("Vowel");
                }else System.out.println("Consonant");
            }else if(s.charAt(0)>= 'A' && s.charAt(0)<= 'Z'){
                if (s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U'){
                    System.out.println("Vowel");
                }else System.out.println("Consonant");
            }else {
                System.out.println("error");
                myFunc();
            }
        }
    }
    public static void main(String[] args) {
        myFunc();
    }
}
