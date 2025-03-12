import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
          int n,i,temp = 0;
          n = sc.nextInt();
          for(i = 2; i<=Math.sqrt(n); i++){
            if(n % i ==0 ){
                 temp++;
            }
          }
            if(temp>0 ){
                System.out.println("i not prime");
            }else{
                System.out.println("it is prime number");
            }

    }
}