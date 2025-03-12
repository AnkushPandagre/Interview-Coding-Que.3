public class Swap {
    public static void main(String[] args) {
        int a =10, b= 20, t;
        //  a = a+b;
        //  b = a-b;
        //  a = a-b;
         t =a;
         b = t;
         a= t +b;

         System.out.println(a);
         System.out.println(b);
    }
}
