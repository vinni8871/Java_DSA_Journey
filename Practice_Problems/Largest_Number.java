import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if (n1>n2){
            System.out.print(n1 + " is  greater");
        }else{
            System.out.print(n2 + " is greater");
        }
    }
}