/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author chrissandison
 * @cdf c1sandis
 * @studentno 998827783
 * @last edited Sep 29, 2012
 */
public class Card {
    private String number, suit, rule;
    
    Card(String suit, String number, String rule){
        this.suit = suit;
        this.number = number;
        this.rule = rule;
    }   
    
    public String getsuit(){
        return suit;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String toString(){
        return number + " of " + suit + " ... " + rule; 
    }
         
}
