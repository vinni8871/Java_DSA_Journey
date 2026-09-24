import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = input.nextInt();
        System.out.print("Enter End: ");
        int end = input.nextInt();
        System.out.println("Amstrong Numbers between "+ start +"&"+end+" :");

        for(int num = start;num <= end;num++){
            int temp = num;
            int sum = 0;
            int count = String.valueOf(temp).length(); // count the number of digits

            //count the digits
//            while(temp!=0){
//                int digit = num/10;
//                digit++

            while(temp!=0){
                int digit = temp%10;
                sum = sum + (int) Math.pow(digit,count);
                temp = temp/10;
            }
            if(num == sum){
                System.out.print(sum + " ");
            }
        }
        input.close();
    }
}
