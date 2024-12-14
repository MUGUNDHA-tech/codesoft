package p1;
import java.util.*;
class attributes{
	static boolean playAgain=true;
	static int attempts=5;
}
public class Guess extends attributes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.println("WELCOME PARTICIPANT!! TO THE NUMBER GUESSING GAME!!");
		int randomnumber=r.nextInt(100)+1;
		int count=0;
		int score=0;
		System.out.println("OBJECTIVE OF THE GAME:\nThe number has been choosen from the numbers 1 to 100 and you have "+attempts+" attempts left");
		System.out.println("ALL THE VERY BEST!! GOOD LUCK\n\n");
		while(playAgain) {
			int attemptsleft=attempts;
			while(attemptsleft>0) {
				System.out.print("Enter the guessed number: ");
				int num=sc.nextInt();
				count++;
				if(count==attempts) {
					System.out.println("Sorry, you've run out of attempts. The number was: " + randomnumber);
					break;
				}
				else {
					if(num==randomnumber) {
						System.out.println("Correct!! You had guessed the number "+randomnumber);	
						score+=attemptsleft;
						break;
					}
					else if(num<randomnumber) {
						System.out.println("Too Low!! try again.");
					}
					else if(num>randomnumber) {
						System.out.println("Too High!! try again.");
					}
					attemptsleft--;
					System.out.println("Attempts left: "+attemptsleft);
				}
				System.out.println("Your score is: "+score);
			}
			System.out.println();
			System.out.print("Would you like to play another round? (yes/no): ");
            String response = sc.next().toLowerCase();
            playAgain = response.equals("yes");
		}
        System.out.println("Thank you for playing! Your final score is: "+score);
        sc.close();
	}
}

