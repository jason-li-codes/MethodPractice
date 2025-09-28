import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int num = input.nextInt();

        System.out.printf("Is this number even: %b\n", isEven(num));
        System.out.printf("Is this number positive: %b\n", isPositive(num));

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

}
