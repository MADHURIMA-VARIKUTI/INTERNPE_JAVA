import java.util.Scanner;
import java.util.Random;
class madhu{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		String play="yes";

		while(play.equals("yes")){
			Random rand=new Random();
			int randNum= rand.nextInt(100);
			int guess=-1;
			int count=0;

			while(guess != randNum){
				System.out.println("Guess a number between 1 and 100: ");
				guess=reader.nextInt();
				count++;

				if(guess==randNum){
					System.out.println("You guessed the number!!");
					System.out.println("Guessed in "+count+ " chances");
					System.out.println("Play again? yes or no: ");
					
					play=reader.next().toLowerCase();
				}
				else if(guess>randNum){
					System.out.println("your guess is too high! Try again");
				}
				else{
					System.out.println("your guess is too low! Try again");
				}
			}
		}
		reader.close();
	}

}

