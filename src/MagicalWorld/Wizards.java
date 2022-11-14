package MagicalWorld;

import java.util.Random;

public class Wizards {
    //variables
    public String name;
    public int health;
    public int mana;
    public int damage = 0;
    public String classOfWizard;
    // constructor
    public Wizards(String name){
        String[] classTypes = new String[4];
        classTypes[0] = "Fire";
        classTypes[1] = "Water";
        classTypes[2] = "Earth";
        classTypes[3] = "Wind";
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        switch (randomNumber){
            case 0:
                this.classOfWizard = classTypes[randomNumber];
                break;
            case 1:
                this.classOfWizard = classTypes[randomNumber];
                break;
            case 2:
                this.classOfWizard = classTypes[randomNumber];
                break;
            case 3:
                this.classOfWizard = classTypes[randomNumber];
                break;
        }
        this.name = name;
        this.health = 40;
        this.mana = 20;
    }
    //methods
    public void spellOne(Wizards wizard){
        System.out.println(this.name + " uses their subprimal spell on " + wizard.name + "!");
        wizard.health -= 3;
    }
    public void spellTwo(Wizards wizard){
        System.out.println(this.name + " uses their primal spell on " + wizard.name + "!");
        wizard.health -= 5;
    }
    public void spellThree(Wizards wizard){
        System.out.println(this.name + " uses their ultimate spell on " + wizard.name + "!");
        wizard.health -= 10;
    }

}
