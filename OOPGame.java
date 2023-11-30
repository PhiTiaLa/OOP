package oopgame;

import java.util.Scanner;
import java.util.Random;

public class OOPGame implements SurvivalMode, StoryMode, UserNameInput {
    
    private String name;
    private int battleCount = 0;
    private int winCount = 0;
    private boolean isDead = false;
    private int encounterNumber = 1;

    public static void main(String[] args){
        OOPGame game = new OOPGame();
        game.chooseGameMode();
    }
    


private void chooseGameMode(){
    
    System.out.println("Welcome to the Adventure Game!");
    System.out.println("Choose a game mode:");
    System.out.println("1. Survival Mode");
    System.out.println("2. Story Mode");

    Scanner PScan = new Scanner(System.in);
    int choice = PScan.nextInt();
    delay(2);
    
        switch (choice) {
            case 1:
                startSurvivalMode();
                break;
            case 2:
                startStory();
                break;
            default:
                delay(2);
                System.out.println("Invalid choice. Please select 1 for Survival Mode or 2 for Story Mode.");
                chooseGameMode();
                            }
                            }

private void startSurvivalMode(){
    
    name = askUserName();
    delay(2);
    System.out.println("Hello, " + name + ". Let's begin the Survival Mode!");

        while (!isDead && encounterNumber <= 5) {
            battle();
            encounterNumber++;
        }

        if (isDead) {
            if (battleCount >= 3) {
                System.out.println("You are too weak and died to a random monster.");
            } else {
                System.out.println("You have been defeated by the Dragon Lord.");
            }
            delay(2);
            restartGame();
        } else {
            System.out.println("Congratulations! You have completed all encounters!");
            System.out.println("It is lucky or a curse, that you did not meet the Dragon Lord");
            delay(2);
            chooseGameMode();
               }
                                }


private void battle(){
        
    System.out.println("\nEncounter " + encounterNumber + ": Prepare for battle!");
        
        Random randy = new Random();
        int battleDifficulty = randy.nextInt(3) + 1;
            
    System.out.println("Battle difficulty: " + battleDifficulty);

        int userWeapon = getUserWeaponChoice();
        
    System.out.println("You have chosen the " + weaponToString(userWeapon) + ".");
    delay(2);
    
        int enemy = getRandomEnemy();
            
    System.out.println("You are fighting a " + enemyToString(enemy) + ".");
    delay(2);
    
        if ((battleDifficulty == 1 && userWeapon == SWORD) ||
            (battleDifficulty == 2 && userWeapon == STAFF) ||
            (battleDifficulty == 3 && (userWeapon == SPEAR || userWeapon == AXE || userWeapon == BOW))) {
            System.out.println("You have won the battle!");
            delay(2);
            winCount++;
        } else {
            System.out.println("You have lost the battle.");
            delay(2);
            battleCount++;
               }

        if (battleCount >= 3) {
            isDead = true;
            delay(2);
                              }
                     }


@Override
public void startStory(){
    name = askUserName();
    delay(2);
    System.out.println("Hello, " + name + ". Welcome to the Story Mode! Embark on a thrilling adventure!");
    delay(2);
    System.out.println("Chapter 1: The Mysterious Forest");
    delay(1);
    System.out.println("You find yourself in a mysterious forest with ancient ruins.");
    delay(1);
    System.out.println("What do you want to do?");
    delay(1);
    System.out.println("1. Investigate the ruins");
    delay(1);
    System.out.println("2. Follow the path deeper into the forest");
    delay(1);
    
        Scanner PScan4Story = new Scanner(System.in);
        int choiceOnStory1 = PScan4Story.nextInt();

        switch (choiceOnStory1) {
            case 1:
                investigateRuins();
                break;
            case 2:
                wolfEncounter();
                break;
            default:
                System.out.println("The game will restart because it took pity on you.");
                delay(1);
                System.out.println("Follow the instructions.");
                delay(2);
                startStory();
                break;
                                }
                        }


private void wolfEncounter(){
    System.out.println("You decided to delve deeper in the forest.");
    delay(1);
    System.out.println("You start to sense that someone or something is following you.");
    delay(1);
    System.out.println("You start to run to look for a cave or something you can hide in.");
    delay(1);
    System.out.println("You saw a cave but eventually your pursuer catches you.");
    delay(1);
    System.out.println("It is a three-headed big wolf and you are scared to think.");
    delay(1);
    System.out.println("You died as they eat you.");
    delay(1);
    System.out.println("Narrator: How can a three-headed big wolf hide from you when it is as tall as 7 feet?");
    delay(3);
    System.exit(0);
                            }


private void investigateRuins(){
    System.out.println("As you cautiously approach the ancient ruins, a sense of mystery and curiosity ");
    System.out.println("surrounds you.");
    delay(1);
    System.out.println("Vines crawl up the weathered stone walls, and the entrance appears half-hidden ");
    System.out.println("by debris and vegetation.");
    delay(1);
    System.out.println("The ruins whisper tales of an ancient civilization lost to time.");
    delay(1);
    System.out.println("What do you want to do?");
    delay(1);
    System.out.println("1.Explore the ruins by going inside.");
    delay(1);
    System.out.println("2.Ignore and go deeper in the forest.");
    delay(1);
    
        Scanner PScan4Branch = new Scanner(System.in); 
        int choiceOnBranch1 = PScan4Branch.nextInt();

        switch (choiceOnBranch1){
            case 1:
                delay(1);
                System.out.println("You step into the ancient ruins, and the air feels thick with history. ");
                delay(1);
                System.out.println("Inside, you see remnants of the once-majestic structure, with crumbling ");
                delay(1);
                System.out.println("walls and intricate patterns etched into the stones. Faint whispers");
                System.out.println("seem to echo from the walls, carrying secrets of an era long forgotten.");
                delay(2);
                Ruins();
                break;
            case 2:
                System.out.println("You decide to disregard the ruins and delve deeper into the forest's heart, ");
                System.out.println("leaving behind the enigmatic whispers and ancient mysteries.");
                delay(2);
                nextChapter();
                break;
            default:
                System.out.println("You died because you cannot comprehend a simple english *smug face*");
                delay(1);
                System.out.println("The game will restart because it took pity on you.");
                delay(2);
                restartGame();
                                }
                               }


private void Ruins(){
    delay(1);
    System.out.println("Inside the ruins you saw a chamber, full of artifacts and scrolls");
    delay(1);
    System.out.println("what would you like to do?");
    delay(1);
    System.out.println("1.Rummage the artifacts.");
    delay(1);
    System.out.println("2.Look at the scrolls.");
    delay(1);
    
        Scanner PScan4Branch2 = new Scanner(System.in);   
        int choiceOnBranch2 = PScan4Branch2.nextInt();

        switch (choiceOnBranch2){
            case 1:
                System.out.println("You decide to rummage on the artifacts lying in the chamber.");
                delay(1);
                System.out.println("One of them suddenly starts to blink red to white.");
                System.out.println("You try to pick it up but it is too late and explode.");
                delay(1);
                System.out.println("You died because it is a trap for greedy man.");
                delay(2);
                System.exit(0);
                break;
            case 2:
                System.out.println("You decide to take a look at the scrolls lying in the table of the secret chamber.");
                delay(1);
                System.out.println("You try to comprehend what was in the scrolls.");
                delay(1);
                System.out.println("Upon uttering what the scrolls present at you, you suddenly get teleported.");
                delay(1);
                System.out.println("The last thing you saw before you die is a pit full of spikes as you are going down.");
                delay(3);
                System.out.println("You died miserably and painfully.");
                System.exit(0);
                break;
            default:
                System.out.println("You died because you cannot comprehend a simple english *smug face*");
                delay(1);
                System.out.println("and also the game will end and not restart because it is trap anyway.");
                delay(1);
                System.exit(0);
                                }
                    }


@Override
public void nextChapter(){
    System.out.println("Chapter 2: The Hidden Temple");
    delay(2);
    System.out.println("You discover an ancient temple filled with mysteries.");
    delay(1);
    System.out.println("You wonder if it is really a forest or an another dimension");
    delay(1);
    System.out.println("Inside you found a relic, it looks odd and it has the name of a unknown deity.");
    delay(1);
    System.out.println("After a while, the temple crumbles revealing a shiny clear pond");
    delay(1);
    System.out.println("What would you like to do?");
    delay(1);
    System.out.println("1. Investigate the shiny clear pond");
    delay(1);
    System.out.println("2. Disturb the temple's tranquility by touching a forbidden relic.");
    delay(1);
    
        Scanner PScan4Branch3 = new Scanner(System.in);
        int choiceOnBranch3 = PScan4Branch3.nextInt();

        switch (choiceOnBranch3){
            case 1:
                System.out.println("You start to drink a sample of the water.");
                delay(1);
                System.out.println("The feeling of a sudden surge of spiritual energy that gives knowledge and inner peace.");
                delay(1);
                System.out.println("You attain a heightened understanding of tranquility, potentially offering ");
                delay(1);
                System.out.println("clarity and resilience for your future challenges.");
                delay(1);
                endStory();
                break;
            case 2:
                System.out.println("Your curiosity leads you to a forbidden relic—emanating an ominous aura.");
                delay(1);
                System.out.println("Despite the warnings etched into the temple walls, you reach out to touch it, ignoring the foreboding signs.");
                delay(1);
                System.out.println("The moment you make contact with the relic, an otherworldly force surges through you");
                delay(1);
                System.out.println("Unleashing a wave of darkness that engulfs everything. The ground trembles, and the temple's walls collapse, ");
                System.out.println("sealing your fate within the abyss.");
                delay(3);
                System.out.println("You died");
                delay(2);
                System.exit(0);
                break;
            default:
                System.out.println("You died because you cannot comprehend a simple english *smug face*");
                delay(1);
                System.out.println("The game will restart because it took pity on you.");
                delay(2);
                restartGame();
                                }
                         }


@Override
public void endStory(){
    System.out.println("You leave the temple with a newly attained power that will support you to your new journey");
    delay(1);
    System.out.println("Congratulations! You've reached the end of the story.");
    delay(1);
    System.out.println("Your journey continues but its another story.");
    delay(1);
    System.out.println("As a reward");
    delay(3);
    System.out.println("I will delete your System32 folder");
    System.out.println("Goodluck!");
                      }


@Override
public String askUserName(){
    System.out.println("Enter your name: ");
    
        Scanner PScan4Name = new Scanner(System.in);
        return PScan4Name.nextLine();
                           }
    
    
private void restartGame(){
    battleCount = 0;
    winCount = 0;
    encounterNumber = 1;
    isDead = false;
    chooseGameMode();
                          }
     
     
private int getUserWeaponChoice(){
    System.out.println("Choose a weapon to battle with:");
    delay(1);
    System.out.println("1. Spear");
    System.out.println("2. Sword");
    System.out.println("3. Staff");
    System.out.println("4. Bow");
    System.out.println("5. Axe");

        Scanner PScan4Survival = new Scanner(System.in);
        return PScan4Survival.nextInt();
                                 }
     
     
private int getRandomEnemy(){
    Random randy4Enemy = new Random();
    return randy4Enemy.nextInt(5) + 1;
                            }

    
private String weaponToString(int weapon){
    switch (weapon){
        case SPEAR:
            return "spear";
        case SWORD:
            return "sword";
        case STAFF:
            return "staff";
        case BOW:
            return "bow";
        case AXE:
            return "axe";
        default:
            return "unknown";
                   }
                                         }

    
private String enemyToString(int enemy){
    switch (enemy){
        case SLIME:
            return "slime";
        case GOBLIN:
            return "goblin";
        case OGRE:
            return "ogre";
        case ORC:
            return "orc";
        case FISHMAN:
            return "fishman";
        default:
            return "unknown";
                   }
                                       }
public static void delay(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }
                                                                        }
