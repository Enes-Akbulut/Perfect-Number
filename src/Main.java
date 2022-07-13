import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        number = input.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " is Perfect Number.");
        } else {
            System.out.println(number + " is not Perfect Number.");
        }
    }
}