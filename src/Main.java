import java.util.*;
public class Main {
    public static void main(String[] args){

        String playagain = "y";

        while(playagain.equals("y")){
            System.out.println("Hello what is your name?");

            Scanner scanthing = new Scanner(System.in);
            String name = scanthing.nextLine();

            //the randomly generated number
            int rand = (int)(Math.random()*20)+1;
            System.out.println("Well," + name + ",I am thinking of a number between 1 and 20.\n");

            //u get 7 tries if u get it in here
            //you win otherwise you lose and asked to try again
            for(int tries =1; tries < 7; tries++){
                System.out.println("Take a guess");

                Scanner scanthing2 = new Scanner(System.in);
                int userguess = scanthing2.nextInt();



                //guessing rand correctly in tries tries
                if(userguess == rand){
                    System.out.println("Good job," + name + "! You guessed my number in " + tries + " guesses!");
                    tries = 7;

                } else{
                    if(userguess > rand){
                        System.out.println("your guess is too high.");
                    } else{
                        System.out.println("Your guess is too low.");
                    }

                }
            }


            System.out.println("Would you like to play again (y or n)?");
            Scanner scanthing3 = new Scanner(System.in);
            String theanswer = scanthing3.nextLine();

            if(theanswer.equals("n") || theanswer.equals("y")){
                if(theanswer.equals("n")){
                    playagain = "n";
                } else{
                    playagain = "y";
                }
            } else{
                System.out.println("wrong input");
            }



        };



    }
}
