package selfLearning;
import java.util.*;
public class TipCalculator {
      public static void main(String[] args) {
       //WRITE YOUR CODE HERE
       int numberOfPeople;
       String split;
       double checkAmount;
       String serviceQuality;
       
       double totalToPay = 0;
       double totalTip = 0;
       double totalPerPerson = 0;
       double tipPerPerson = 0;
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Do you want to split the bill? Enter yes or no");
          split = scan.next().toLowerCase();
          if (!split.equals("yes") && (!split.equals("no"))) {
                  System.out.println("Not a valid response: please restart and enter yes or no.");
                  return;
                  }
          
       System.out.println("Enter number of people:");								//Inna
          numberOfPeople = scan.nextInt();
            if(numberOfPeople > 10) {
              numberOfPeople = 10;
              System.out.println("Bill will be split among a maximum of 10 people.");
            }else if ( numberOfPeople < 0) {
            	  System.out.println("cannot enter a negative amount of people. Please restart.");
            	  return;
            }
            
            System.out.println();
          
       System.out.println("Rate the Service Quality: Poor, Fair, Good, Great, or Excellent");				//Nurs
         serviceQuality = scan.next().toLowerCase(); 
          if (!serviceQuality.equals("poor") && !serviceQuality.equals("fair") &&!serviceQuality.equals("good") 
                  &&  !serviceQuality.equals("great") && !serviceQuality.equals("excellent")) {
                System.out.println("Invalid rating. Please restart and enter a valid Service Quality.");
               return;
                }
          
          
          System.out.println("Please enter the bill amount:");							//Salih
          checkAmount = scan.nextDouble();
          if(checkAmount < 0) {
        	  System.out.println("Invalid bill amount, please restart.");
        	  return;
          } 
       
        
        
        switch(serviceQuality){												//Salih
          case "poor":
              totalTip = checkAmount * .05;
              totalToPay = checkAmount + totalTip;
              totalPerPerson = totalToPay / numberOfPeople;
              tipPerPerson = totalTip / numberOfPeople;
             
            break;
          case "fair":
              totalTip = checkAmount * .10;
              totalToPay = checkAmount + totalTip;
              totalPerPerson = totalToPay / numberOfPeople;
              tipPerPerson = totalTip / numberOfPeople;
            break;
          case "good":
              totalTip = checkAmount * .15;
              totalToPay = checkAmount + totalTip;
              totalPerPerson = totalToPay / numberOfPeople;
              tipPerPerson = totalTip / numberOfPeople;
            break;
          case "great":
              
              totalTip = checkAmount * .20;
              totalToPay = checkAmount + totalTip;
              totalPerPerson = totalToPay / numberOfPeople;
              tipPerPerson = totalTip / numberOfPeople;
            break;
          case "excellent":
              totalTip = checkAmount * .25;
              totalToPay = checkAmount + totalTip;
              totalPerPerson = totalToPay / numberOfPeople;
              tipPerPerson = totalTip / numberOfPeople;
            break;
          
        }
        
        
        
        
        System.out.println();
        
        switch(split) {
        case "yes":
            System.out.println("split");
            break;																			//Megan
        case "no":
            System.out.println("not split");
            break;
        
        }
        
        
        switch (numberOfPeople) {
          case 0: 
              if(numberOfPeople == 0){														//Megan
                numberOfPeople = 1;
                System.out.println("Number of people entered: &");    
                break;
                }   
          case 1:
              System.out.println("Number of people entered: &");
              break;
          case 2:
              System.out.println("Number of people entered: &&");
              break;
          case 3:
              System.out.println("Number of people entered: &&&");
              break;
          case 4:
              System.out.println("Number of people entered: &&&&");
              break;
          case 5:
              System.out.println("Number of people entered: &&&&&");
              break;
          case 6:
              System.out.println("Number of people entered: &&&&&&");
              break;
          case 7:
              System.out.println("Number of people entered: &&&&&&&");
              break;
          case 8:
              System.out.println("Number of people entered: &&&&&&&&");
              break;
          case 9:
              System.out.println("Number of people entered: &&&&&&&&&");
              break;
          case 10:
              System.out.println("Number of people entered: &&&&&&&&&&");
              break;
          }
        	
        
        
        System.out.println("Total to pay: " + totalToPay);							//Muhabbat
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson); 
        System.out.println("Tip per person: " + tipPerPerson);
        
        
    
}
}
