import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the numbers: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int greatest = 0;
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
            if(greatest < a[i]){
                greatest = a[i];
            }
        }
        System.out.println(greatest + " is the greatest number");
    }
}
