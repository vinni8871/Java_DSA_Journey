import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        switch (name) {
            case "Apple" -> System.out.println(" I am an Apple");
            case "Banana" -> System.out.println("I am a Banana ");
            case "Mango" -> System.out.println("I am a Mango");
            default -> System.out.println("I am from default");
        }
    }
}
