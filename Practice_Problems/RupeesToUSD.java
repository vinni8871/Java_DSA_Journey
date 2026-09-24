import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Rupees: ");
        int i = in.nextInt();
        double d = i * 0.0104538 ;
        System.out.println("USD: "+ d);

    }
}
