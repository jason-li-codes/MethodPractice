import java.util.Scanner;

public class Format {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.next();
        System.out.println("Enter last name: ");
        String lastName = input.next();

        String formattedName = formatName(firstName,lastName);
        System.out.println(formattedName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }


}
