
package guessGame;

public class GuessMachine {
    private int number;
    private int numGuesses;
    
    public GuessMachine () {
        this.numGuesses = 0;
        this.number = (int) (Math.random() * 100 + 1);
    }
    
    public int getGuesses() { // "getNumGuesses"
        return numGuesses;
    }
    
    public boolean guessNumber(int number) { // "setGuess"
        boolean isNumber = (number == this.number);
        this.numGuesses = this.numGuesses + 1;
        return isNumber;
    }
    
    public String getResult(int number) { // "giveHint"
        boolean isNumber = (number == this.number);
        if(isNumber) 
            return "You've guessed the number!\nYou guessed " + this.number + " after " + numGuesses + " guesses!";
        else if(number>this.number) 
            return "You're too high."; 
        else
            return "You're too low.";
    }
}
