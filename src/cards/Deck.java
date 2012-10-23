/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chrissandison
 * @cdf c1sandis
 * @studentno 998827783
 * @last edited Sep 30, 2012
 */
public class Deck {
    private Card[] cards;
    int i;
    private static String[] suits = {"HEARTS","DIAMONDS","SPADES","CLUBS"};
    private static String[] numbers = {"ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
    private static String[] rulesTEST = {"Take one",
                                     "Rule card",
                                     "Roman Numerals",
                                     "Girls",
                                     "Guys",
                                     "Rule card",
                                     "Viking",
                                     "Question",
                                     "Zip zap zop",
                                     "Rhyme time",
                                     "Categories",
                                     "Snake Eyes",
                                     "Date"
                                    };
    private static List<String> rules = new ArrayList<String>();
    
    
    
    public Deck(){
        i = 51;
        cards = new Card[52];
        int x = 0;
        for(int a = 0; a <= 3; a++){
            for(int b = 0; b <= 12; b++){
                cards[x] = new Card(Deck.suits[a],Deck.numbers[b],Deck.rules.get(b));
                x++;
            }
        }
    }
    
    public static void getRulesFromPlayer(){
        Scanner ruleIn = new Scanner(System.in);
        System.out.println("Now creating rules...");
        for(int a = 0; a <= 12; a++){
            System.out.print("Rule for " + Deck.numbers[a] + "?...");
            Deck.rules.add(ruleIn.next()); //read in next rule
            System.out.println("");
        }
    }
    
    public void changeRule(String newRule, String cardName){
        //TODO
    }
    
    public Card drawFromDeck(){
        Random generator = new Random();
        int index = 0;
        
        do{
            index = generator.nextInt(52);
        } while(cards[index] == null);
        
        i--;
        Card temp = cards[index];
        cards[index] = null;
        return temp;
    }
    
    public void reshuffle(){
        i = 51; //reset card count
    }
    
    public int getTotalCards(){
        return i;
    }
    
}
