import java.util.Scanner;

class MarsAdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = input.nextLine();  // Get user input
        System.out.println("Nice, to meet you" + name + ", My name is Dana!");


        System.out.println("What color will your spacesuit be?");

        String color = input.nextLine();  // Get user input
        System.out.println("This color " + color + ", would look nice on you!");


        System.out.println("Are you taking any pets if so , What is your pet’s name?");

        String pet = input.nextLine();  // Get user input
        System.out.println("Unfortunately, we have a policy where you cannot take " + pet + " with you in space!");


        System.out.println("Who are you leaving your pet with ?");

        String people = input.nextLine();  // Get user input
        System.out.println("That is awesome your leaving him/her/they  with " + people + " !");
    }
}


