import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        System.out.println("Enter your Party Affiliation [D R I]: ");
        userChoice = scanner.nextLine();

        if (userChoice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (userChoice.equals("R")) {
                System.out.println("You get a Republican Elephant.");
            }
        else if (userChoice.equals("I")){
            System.out.println("You get a Independent Person.");
        }

        else System.out.println("You are Other.");
    }
}