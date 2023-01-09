import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dice_Size diceSize = new Dice_Size();
        Random_Number randomNumber = new Random_Number();
        Scanner scanner = new Scanner(System.in);

        diceSize.UserQuery();

        while(true){
            if (diceSize.getDiceSize() == 2){
                System.out.print("Would you like to flip the coin? [y/n]:\t");
            }else {
                System.out.print("Would you like to roll the dice? [y/n]:\t");
            }

            if (!scanner.hasNext()) {
                System.out.println("Please type y or n.");
                scanner.next();
            }else {
                String r = scanner.next().toLowerCase();
                if (r.equals("y")) {
                    System.out.println(randomNumber.getRandNumber(diceSize.getDiceSize()));
                    continue;
                }
                if (r.equals("n")) {
                    break;
                }
                else {
                    System.out.println("Please type y or n.");
                }
            }
        }
    }
}