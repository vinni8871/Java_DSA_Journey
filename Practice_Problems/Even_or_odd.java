import java.util.Scanner;
public class Even_or_odd {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println(num + " is a Even Number");
        }
        else{
            System.out.println(num + " is a Odd number");
        }
    }
}
