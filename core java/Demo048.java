import java.util.Scanner;

public class Demo048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int sum = 0;
        int num = Math.abs(number); 

        while (num != 0) {
            sum += num % 10;
            num /= 10; 
        }

        System.out.println("The sum of the digits of " + number + " is: " + sum);

        scanner.close();
    }
}