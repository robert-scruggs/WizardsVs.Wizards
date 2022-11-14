package MagicalWorld;

import java.util.Random;

public class Arena {
    public String typeOfArena;
    public int advantagePoints;
    public int disadvantagePoints;

    public Arena(){
        String[] arenaTypes = new String[4];
        arenaTypes[0] = "Wind";
        arenaTypes[1] = "Earth";
        arenaTypes[2] = "Fire";
        arenaTypes[3] = "Wind";
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        switch (randomNumber){
            case 0:
                this.typeOfArena = arenaTypes[randomNumber];
                break;
            case 1:
                this.typeOfArena = arenaTypes[randomNumber];
                break;
            case 2:
                this.typeOfArena = arenaTypes[randomNumber];
                break;
            case 3:
                this.typeOfArena = arenaTypes[randomNumber];
                break;
        }
        switch (typeOfArena){
            case "Fire":
                advantagePoints = 3;
                disadvantagePoints = 3;
                break;
            case "Earth":
                advantagePoints = 3;
                disadvantagePoints = 3;
                break;
            case "Water":
                advantagePoints = 3;
                disadvantagePoints = 3;
                break;
            case "Air":
                advantagePoints = 3;
                disadvantagePoints = 3;
                break;
        }
    }
}
