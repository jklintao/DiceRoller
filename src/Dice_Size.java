import java.util.Scanner;

public class Dice_Size {
    final int dMIN = 2;
    final int dMAX = 20;


    private int diceSize;

    public void setDiceSize(int ds){
        this.diceSize = ds;
    }

    public int getDiceSize(){
        return this.diceSize;
    }

    public void UserQuery(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter the number of sides the dice has: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Enter a number between " + dMIN + " and " + dMAX);
                scanner.next();
            }else {
                int d = scanner.nextInt();
                if (d == 2){
                    System.out.println("This is a coin!");
                    this.setDiceSize(d);
                    break;
                }
                if (d >= dMIN && d <= dMAX) {
                    this.setDiceSize(d);
                    break;
                }
                System.out.println("Enter a number between " + dMIN + " and " + dMAX);
            }
        }
    }
}
