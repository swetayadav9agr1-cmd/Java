import java.util.Scanner;
public class madLibsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1, adjective2, adjective3, noun1, verb1;

        System.out.print("Enter an adjective : ");
        adjective1 = sc.nextLine();

        System.out.print("Enter a noun : ");
        noun1 = sc.nextLine();

        System.out.print("Enter an adjective : ");
        adjective2 = sc.nextLine();

        System.out.print("Enter a verb : ");
        verb1 = sc.nextLine();

        System.out.print("Enter an adjective : ");
        adjective3 = sc.nextLine();

        System.out.println("\n");
        System.out.println("============================================\n");

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        sc.close();
    }
}