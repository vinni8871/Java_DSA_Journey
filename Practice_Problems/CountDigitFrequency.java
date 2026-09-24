import java.util.Scanner;

public class CountDigitFrequency {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = in.nextLong();
        System.out.print("Number: ");
        int m = in.nextInt();
        int count = 0;
        while(n!=0){
            long digit = n%10;
            if(digit == m){
                count ++;
            }
            n = n/10;
        }
        System.out.println(m + " appears " + count + " times");
    }
}
