import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tab;
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++){
            tab = i * n;
            System.out.println(n + " * "+ i + " = " + tab );
        }
    }
}
