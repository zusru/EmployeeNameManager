import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int count = input.nextInt();

        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the first name of employee No. " + (i + 1) + ": ");
            numbers.add(input.next());
        }

        System.out.println("The first names of your employees are: " + numbers);
    }
}