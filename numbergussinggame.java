import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        // number gussing game

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int guess;
        int attempts=0;
        int min,max;


        System.out.println("number gussing game");
        System.out.print("enter first number:");
        min=scanner.nextInt();
        System.out.print("enter second number:");
        max=scanner.nextInt();
        int randomnumber = random.nextInt(max - min) + min;

        System.out.println("guess a number between :"+min+"-"+max);

        do{
            System.out.print("enter a guess ");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomnumber){
                System.out.println("too low! guess higher");
            }
            else{
                System.out.println("too high guesss lower");
            }
        } while(guess != randomnumber);
        System.out.println("you won");
        System.out.println("number of attempts:"+attempts);

        scanner.close();





    }
}


