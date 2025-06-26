import java.util.Scanner;
public class UserInputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your test score (0-100): ");
        int score = input.nextInt();

        System.out.println("\nHello " + name + "!");
        System.out.println("Your score is: " + score);

        input.close();
    }
}