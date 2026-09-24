import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        int p = input.nextInt();
        System.out.print("Enter Time Period: ");
        int t = input.nextInt();
        System.out.print("Enter Rate of Intrest: ");
        float r = input.nextFloat();

        double SI = (p*t*r)/100;
        System.out.print("Simple Intrest is "+ SI);
    }
}

