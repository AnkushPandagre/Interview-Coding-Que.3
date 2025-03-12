import java.util.Scanner;

public class SumEvenOdd {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int i , n , sum = 0;
        System.out.println("Enter number");
        n = sc.nextInt();
        if (n%2 ==0) {
            for(i = 0; i<=n; i=i+2){
             sum = sum+i;
            }
            System.out.println("it is even  number" +sum);
        }
        else{
            for(i = 1; i<= n ; i=i+2){
                sum = sum +i;
            }
            System.out.println("it is odd number " +sum);
        }

    }
 }