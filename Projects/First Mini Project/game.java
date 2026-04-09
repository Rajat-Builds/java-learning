import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // Rock Paper Scissors Game .

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (1=Rock, 2=Paper, 3=Scissors)");
        int userchoice = sc.nextInt();

        int computerChoice = (int) (Math.random() * 3) + 1;

        if (computerChoice == 1) {
            System.out.println("Computer Chose Rock");
        }

        else if (computerChoice == 2) {
            System.out.println("Computer Chose Paper");
        }

        else {
            System.out.println("Computer Chose Scissors");
        }

        if (userchoice == computerChoice) {
            System.out.println("Draw");
        }

        else if ((userchoice == 1 && computerChoice == 3) ||
                (userchoice == 2 && computerChoice == 1) ||
                (userchoice == 3 && computerChoice == 2)) {
            System.out.println("You Won !!");
        }

        else {
            System.out.println("Computer Won !!");
        }

        sc.close();
    }
}
