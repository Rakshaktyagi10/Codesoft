import java.util.Scanner;

class Game{
    int RandomNumber;
    int UserInput;
    int NoOfGuesses = 0;

    public int getNoOfGuesses() {
        return NoOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        NoOfGuesses = noOfGuesses;
    }
    Game(){
        RandomNumber = (int)(Math.random()*100);
    }
    void TakeUserInput(){
        System.out.println("Guess the Number:");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
    }
    boolean IsCorrectNumber(){
        NoOfGuesses++;
        if(RandomNumber==UserInput){
            System.out.format("Yes You Guess the Right Number %d \n You Guessed it in %d Attempts\n",UserInput,NoOfGuesses);
            return true;
        } else if (RandomNumber<UserInput) {
            System.out.println("Too High");
        }
        else{
            System.out.println("Too Low");
        }
        return false;
    }
}

public class Guess_The_Number{
    public static void main(String[] args) {
        Game G = new Game();
        boolean B = false;
        while(!B){
            G.TakeUserInput();
            B = G.IsCorrectNumber();
        }

    }
}