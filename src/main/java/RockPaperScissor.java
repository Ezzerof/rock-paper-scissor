import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    private String[] items = new String[]{"rock", "paper", "scissor"};

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        boolean isOn = true;
        System.out.println("If you want to stop game, just write stop.");

        while (isOn) {

            System.out.print("Please choose rock/paper/scissor: ");
            String userInput = scanner.next().toLowerCase();
            Random r = new Random();
            String compChoice = items[r.nextInt(0,2)];

            if (userInput.equals("stop")) {
                isOn = false;
            }

            validation(userInput, compChoice);

        }
    }

    private void validation(String userInput, String computerInput) {
        if (userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissor")) {
            if (userInput.equals(computerInput) || computerInput.equals(userInput)) {
                System.out.println("Draw");
            } else if (userInput.equals("rock") || computerInput.equals("rock")) {
                if (computerInput.equals("paper") || userInput.equals("scissor")) {
                    System.out.println("You lose.");
                } else {
                    System.out.println("You won");
                }
            }
        } else {
            System.out.println("Wrong input.");
        }
    }
}
