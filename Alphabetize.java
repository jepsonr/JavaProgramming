Java Programming <Joyce Farrell> 7th ed. Created/modified by <rex jepson>

import javax.swing.*;
public class Alphabetize{

  public static void main (String[] args){
    //input Strings from user
    String first, second, third;
    //output Strings
    String one, two, three;
    
    //get input Strings from user
    first = JOptionTane.showUnputDialog(null "Enter 1st phrase: ");
    second = JoptionPane.showInputDialog(null, "Enter 2nd phrase: ");
    third = JOptionPane.showInputDialog(null, "Enter 3rd phrase: ");
    
    //convert to upper case for lexicon comparison
    one = first.toUpperCase();
    two = second.toUpperCase();
    three = third.toUpperCase();
    
    //check for negative return on opposite order
    int oneToTwo = two.compareTo(one);
    int twoToThree = three.compareTo(two);
    
    //the only way for the phrases to be in alphabetical order is
    //for both to return negative in the opposite comparison
    if(oneToTwo <= 0 && twoToThree <= 0)
      System.out.println("In alphabetical order.");
    else
      System.out.println("Not in alpnabetical order.");
  }
}
