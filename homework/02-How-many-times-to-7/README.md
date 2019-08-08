# How Many Times to 7?

## Requirements
The purpose of this lab is to learn something about the results of rolling virtual dice.  Here are the requirements:

1.	The program will "roll" a pair of virtual dice (use the random number generator) 100 times and keep track of the following:
    -	How many rolls it took to roll the first 7
    -	The total number of 7s rolled out of the 100 rolls
1.	This information must be displayed to the user after it has been calculated.

## Bonus

1.	Prompt the user for the number of times to roll the dice.
1.	Keep track of and display this information for all numbers that can be rolled (2–12).

---
© 2019 Trilogy Education Services

================================================================

  public class Main {
     
        public static void main(String[] args) {
            
           dice1 = (int)(Math.random()*6) + 1;
           dice2 = (int)(Math.random()*6) + 1;

           
          
           int rollCount;            // Number of times the dice have been rolled.
     
           dice = new PairOfDice();  // Create the PairOfDice object.
           rollCount = 0;
           
           /* Roll the dice until they come up snake eyes. */
           
           do {
              // dice.roll();
               die1 = (int)(Math.random()*6) + 1;
               die2 = (int)(Math.random()*6) + 1;

               System.out.println("The dice come up " + dice.getDie1() 
                                                + " and " + dice.getDie2());
               rollCount++;
           } while (dice.getTotal() != 2);
           
           /* Report the number of rolls. */
           
           System.out.println("\n It took " + rollCount + " rolls to get a 2.");

        
        
          die1 = (int)(Math.random()*6) + 1;
          die2 = (int)(Math.random()*6) + 1;

        
  
           return die1;
         
           return die2;
         
              // Return the total showing on the two dice.
           return die1 + die2;
      
    
           
        }
        
     }  // end class RollFor2
