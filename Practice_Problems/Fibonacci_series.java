import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("End of fabinocci at: ");
        int end = in.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 +" "+ n2);
        while (n3<end){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n3<end){
            System.out.print(" " +n3);}
        }

    }
}
