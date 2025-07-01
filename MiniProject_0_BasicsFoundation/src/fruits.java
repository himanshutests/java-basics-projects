import java.util.ArrayList;
import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();String fruit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fruit names (type 'exit' to stop):");
        while(true) {
            fruit = sc.nextLine();
            String duplicate=fruit.toLowerCase();
            if(fruit.equalsIgnoreCase("exit"))
            {
                break;
            } else if (fruits.contains(fruit)) {
                System.out.println("Fruit already added!");
            } else if (fruits.contains(duplicate)) {
                System.out.println("Fruit already added!");
                fruits.remove(duplicate);
            } else {
                fruits.add(fruit);
            }
        }
        System.out.println("\nFruits you entered:");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
