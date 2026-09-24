import java.util.Scanner;

public class Arthmetic_Operation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two values: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.print("Enter the operator: ");
        char op = input.next().charAt(0);
        int result;

        if(op == '+'){
            result = n1 + n2 ;
            System.out.println("Addition: " + result );
        } else if (op == '-') {
            result = n1 - n2 ;
            System.out.println("Subtraction: " + result );
        }else if (op == '*'){
            result = n1 * n2 ;
            System.out.println("Multiplication: " + result );
        }else if (op == '/' & n2 == 0) {
            System.out.println("n2 cant be zero!");
        }else{
            result = n1 / n2 ;
            System.out.println("Division: " + result );
        }
    }
}
