/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.Scanner;

/**
 *
 * @author chrissandison
 * @cdf c1sandis
 * @studentno 998827783
 * @last edited Sep 30, 2012
 */
public class Play {
    
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //set up deck
        System.out.println("Welcome to King's Cup Cards. First we will need to set out the rules...");
        //create rules
        Deck.getRulesFromPlayer();
        System.out.print("Thank you, creating deck...");
        Deck deck = new Deck();
        System.out.println("\tDone.");
        
        Play game = new Play();
        String keepPlaying = "yes";
        boolean shuffle = false;
        while(keepPlaying.equals("yes")){
            game.kingsCup(deck);
            if(deck.getTotalCards() == 0){
                System.out.print("Deck has run out. Reshuffle and keep playing? (Type \"yes\" or \"no\")...");
                shuffle = true;
            } else {
                System.out.print("You have stopped drawing. Type \"yes\" or type anything else to quit.");
            }
            keepPlaying = input.next();
            System.out.println("");
            if(shuffle){
                deck.reshuffle();
            }
        }
    }
    
    public void kingsCup(Deck deck){
        Card C;
        System.out.println("Type \"draw\" to draw card.");
        while(input.next().equals("draw") && deck.getTotalCards() != 0){
            C = deck.drawFromDeck();
            System.out.println(C.toString());
        }
    }
}
