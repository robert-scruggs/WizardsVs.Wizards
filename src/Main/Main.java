package Main;
import MagicalWorld.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the name of your first wizard? ");
        String firstWizardName = input.next();
        System.out.print("What's the name of your second wizard? ");
        String secondWizardName = input.next();
        Wizards wizard1 = new Wizards(firstWizardName);
        Wizards wizard2 = new Wizards(secondWizardName);
        System.out.println("Entering a Magical World!");
        Thread.sleep(2500);
        System.out.println(wizard1.name + " is a " + wizard1.classOfWizard + " wizard! Congratulations!");
        Thread.sleep(2500);
        System.out.println(wizard1.name + " has " + wizard1.health + " health points! Be careful out there!");
        Thread.sleep(2500);
        System.out.println(wizard1.name + " has " + wizard1.mana + " mana points! Use them wisely!");
        Thread.sleep(2500);
        System.out.println("A new wizard by the name of " + wizard2.name +  " has arrived!");
        System.out.println("He is a " + wizard2.classOfWizard + " type wizard! Be careful!");
        Thread.sleep(2500);
        System.out.print("Would you like to combat them to see who is the better wizard? (YES/NO) ");
        String response = input.next().toLowerCase();

        for (int i = 0; i < 3; i++){
            System.out.println("...");
            Thread.sleep(2500);
        }

        if (response.equals("yes")){
            System.out.println("Let the games begin!");
            System.out.println(wizard1.name + " Vs. " + wizard2.name);
        }else{
            System.out.println("We are not proceeding!");
        }
        //battle arena
        Arena arena = new Arena();
        if (arena.typeOfArena.equals(wizard1.classOfWizard) || arena.typeOfArena.equals(wizard2.classOfWizard)){
            wizard1.damage += arena.advantagePoints;
            wizard2.damage += arena.advantagePoints;
        }else{
            wizard1.damage -= arena.disadvantagePoints;
            wizard2.damage -= arena.disadvantagePoints;
        }
        //actual battle
        int counter = 0; // keeps track of which players turn it is
        while (wizard1.health > 0 && wizard2.health > 0){
            if (counter == 0){
                System.out.println("Spell List: ");
                System.out.println("Spell One: Subprimal Spell");
                System.out.println("Spell Two: Primal Spell");
                System.out.println("Spell Three: Ultimate Spell");
                System.out.print("What spell would you like to use " + wizard1.name + "? ");
                int player1Response = input.nextInt();
                switch (player1Response){
                    case 1:
                        wizard1.spellOne(wizard2);
                        break;
                    case 2:
                        wizard1.spellTwo(wizard2);
                        break;
                    case 3:
                        wizard1.spellThree(wizard2);
                        break;
                }
                counter = 1;
            }else if (counter == 1){
                System.out.println("Spell List: ");
                System.out.println("Spell One: Subprimal Spell");
                System.out.println("Spell Two: Primal Spell");
                System.out.println("Spell Three: Ultimate Spell");
                System.out.print("What spell would you like to use " + wizard2.name + "?");
                int player2Response = input.nextInt();
                switch (player2Response){
                    case 1:
                        wizard2.spellOne(wizard1);
                        break;
                    case 2:
                        wizard2.spellOne(wizard1);
                        break;
                    case 3:
                        wizard2.spellOne(wizard1);
                        break;
                }

                counter = 0;
            }
            System.out.println(" ");
            System.out.println(wizard1.name + ": " + wizard1.health);
            System.out.println(wizard2.name + ": " + wizard2.health);
            System.out.println(" ");
        }

        if (wizard1.health <= 0){
            System.out.println(wizard1.name + " has been defeated! " + wizard2.name + " has won! Congratulations!");
        }
        else{
            System.out.println(wizard2.name + " has been defeated! " + wizard1.name + " has won! Congratulations!");
        }
    }
}
