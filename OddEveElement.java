import java.util.Scanner;

public class OddEveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , n , num , sumEven = 0 , sumOdd = 0;
        System.out.println("enter the numbe od elements");
        n = sc.nextInt();
        for(i = 0; i< n; i++){
            num = sc.nextInt();
            if(num % 2 ==0){
                sumEven += num;
            }
            else{
                sumOdd += num;

            }
        }
        System.out.println("even of number " + sumEven);
        System.out.println("odd of number " + sumOdd);

    }
}
