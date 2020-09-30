/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessGame;

import java.util.Scanner;

public class GuessingGame {

    public static int persistInput(String inputText, Scanner scan) {
        int numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scan.nextInt();
            if(numberInput>100 || numberInput<1) {
                return persistInput(inputText, scan);
            }else{
               return numberInput; 
            }
        }catch(Exception e) {
            scan.next();
            System.out.println("[!] Invalid input detected. Please enter valid integers only.");
            return persistInput(inputText, scan);
        }
     }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessMachine gm = new GuessMachine();
        int currentNumber;
        do{
            currentNumber = persistInput("[?] Please guess a number between (1 - 100): ", scan);
            String hint = gm.getResult(currentNumber);
            System.out.println("[*] " + hint);
        }while(!gm.guessNumber(currentNumber));
    }
}
