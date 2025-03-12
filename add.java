import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        // int a = 101;
        // int b= 010;
        // int c = a+b;
        // System.out.println(c);
        // System.err.println(!false);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
  int voting  = sc.nextInt();

        int age = 18;
        String vote = voting >= age ? "able to vote" : "not able to vote";
System.out.println(vote);
    }
}
