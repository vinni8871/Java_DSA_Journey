import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String name = input.next();
        System.out.println("Namastey "+name+", welcome to DSA course");

    }
}
