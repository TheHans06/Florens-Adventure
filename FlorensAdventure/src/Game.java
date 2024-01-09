import java.util.Scanner;

public class Game {

    String name;
    int hp;
    int stamina;
    String playerArmor;
    String playerWeapon;
    String playerClass;
    String[] armor = new String[10];
    String[] weapon = new String[10];
    String[] Class = new String[3];
    Scanner input = new Scanner(System.in);
    int choice;
    boolean hasR1ChestKey = false;

    public void gameSetup() {
        playerSetup();
    }

    public void playerSetup() {

        setArmor();
        setClass();
        setWeapon();

        System.out.println();
        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println();

        System.out.println("Choose your Class : ");
        System.out.println("1. " + Class[0]);
        System.out.println("2. " + Class[1]);
        System.out.println("3. " + Class[2]);

        System.out.print("Choose : ");
        choice = input.nextInt();
        System.out.println("--------------------------------------------------");

        System.out.println();

        switch (choice) {
            case 1:
                hp = 100;
                stamina = 75;

                playerClass = Class[0];
                playerArmor = armor[0];
                playerWeapon = weapon[0];

                System.out.println("You are : " + name);
                System.out.println("You are a " + playerClass);
                System.out.println("Hp : " + hp);
                System.out.println("Stamina : " + stamina);
                System.out.println("Armor : " + playerArmor);
                System.out.println("Weapon : " + playerWeapon);
                break;
            case 2:
                hp = 70;
                stamina = 75;

                playerClass = Class[1];
                playerArmor = armor[1];
                playerWeapon = weapon[1];

                System.out.println("You are : " + name);
                System.out.println("You are a " + playerClass);
                System.out.println("Hp : " + hp);
                System.out.println("Stamina : " + stamina);
                System.out.println("Armor : " + playerArmor);
                System.out.println("Weapon : " + playerWeapon);
                break;
            case 3:
                hp = 80;
                stamina = 100;

                playerClass = Class[2];
                playerArmor = armor[2];
                playerWeapon = weapon[2];

                System.out.println("You are : " + name);
                System.out.println("You are a " + playerClass);
                System.out.println("Hp : " + hp);
                System.out.println("Stamina : " + stamina);
                System.out.println("Armor : " + playerArmor);
                System.out.println("Weapon : " + playerWeapon);
                break;
        }

        System.out.println();
        System.out.println("Let's Start The Adventure!");
        System.out.println();
        System.out.println("1. Continue");
        System.out.println("2 or any number ====> QUIT");
        System.out.println("Choose : ");
        choice = input.nextInt();

        if(choice == 1) {
            story0();
        } else {
            System.out.println("--Game Quit--");
        }

        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public void story0() {

        System.out.println("--------------------------------------------------");
        System.out.println("You are awake in-front of a huge castle.");
        System.out.println("You are drawn inside, hypnotized because of its lure or yet its magic.");
        System.out.println("Without knowing it you opened the castle great door and went inside...");
        System.out.println();
        System.out.println("1. Continue");
        System.out.println("2. Leave");
        System.out.println();
        System.out.println("Choose : ");
        choice = input.nextInt();

        if (choice == 1) {
            baseWindow();
        } else {
            story0();
        }
    }

    public void baseWindow() {
        System.out.println("\n--------------------------------------------------");
        System.out.println(name);
        System.out.println(playerClass);
        System.out.println("Hp : " + hp);
        System.out.println("Stamina : " + stamina);
        System.out.println("Armor : " + playerArmor);
        System.out.println("Weapon : " + playerArmor);
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("You are inside the Castle, the room surrounding you is falling apart.");
        System.out.println("Broken walls, cobwebs, destroyed furniture is all around you.");
        System.out.println("To the left, right, and in-front of you there are three doors that you can check");
        System.out.println();
        System.out.println("1. Left Door");
        System.out.println("2. Front Door");
        System.out.println("3. Right Door");
        System.out.println("Choose : ");
        choice = input.nextInt();

        if (choice == 1) {
            room1();
        } else if (choice == 2) {
            room2();
        } else if (choice == 3) {
            mysteriousTrader();
        } else {
            baseWindow();
        }
    }

    public void room1() {
        boolean chestOpened = false;

        System.out.println("\n--------------------------------------------------");
        System.out.println("The room to the left has nothing but a chest on the left dark corner.");
        System.out.println("You check the room and found there is a door that haven't been opened.");
        System.out.println();
        System.out.println("1. Check the chest");
        System.out.println("2. Check the door");
        System.out.println("3. Go back");
        System.out.println();
        System.out.println("Choose : ");
        choice = input.nextInt();

        if (choice == 1) {
            if(hasR1ChestKey == false && chestOpened == false) {
                System.out.println("Damn it's locked...");
                room1();
            } else if (hasR1ChestKey == true && chestOpened == false) {
                System.out.println("The key fits!");
                System.out.println("It's an Armor!");
                playerArmor = armor[3];
                System.out.println("You wear it right away...");
                chestOpened = true;
                room1();
            } else if (hasR1ChestKey == true && chestOpened == true) {
                System.out.println("You already opened the chest.");
                room1();
            }
        } else if (choice == 2) {

        } else if (choice == 3) {
            baseWindow();
        } else {
            room1();
        }
    }

    public void room2() {

    }

    public void mysteriousTrader() {

    }

    public void setArmor() {
        armor[0] = "Plate Armor";
        armor[1] = "Mage Robe";
        armor[2] = "Leather Armor";
        armor[3] = "Black Steel Armor";
    }

    public void setWeapon() {
        weapon[0] = "Straight Sword";
        weapon[1] = "Mage Staff";
        weapon[2] = "Thief Dagger";
    }

    public void setClass() {
        Class[0] = "Knight";
        Class[1] = "Mage";
        Class[2] = "Rogue";
    }
}
