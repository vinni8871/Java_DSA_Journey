import java.util.Scanner;

public class Palindrome_of_a_string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = input.next();
        String temp = name;
        String rev = "";

        while(!name.equals("")){
            char last = name.charAt(name.length()-1);
            rev = rev + last ;
            name = name.substring(0,name.length()-1);
        }
        if(temp.equals(rev)){
            System.out.println("Its an Palindrome String ");
        }else {
            System.out.println("Not an Palindrome String ");
        }
    }
}
