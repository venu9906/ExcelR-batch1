
import java.util.Scanner;

public class demo018{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();

        int years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
         
        System.out.println(minutes + "minutes is approximately " + years + "years");
        System.out.println("remainingMinutes" + remainingMinutes);

    }
}