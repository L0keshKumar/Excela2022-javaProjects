package com.training;

import com.training.creditcard.CreditCard;
import com.training.creditcard.CreditCardService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CreditCard cardOne=new CreditCard(456425678,
        		"Lokesh Kumar", 200);
        CreditCardService service=new CreditCardService();
        if(!(service.addCard(cardOne)))
        {
        	System.out.println("Array is full");
        	
        }
        CreditCard[] cards =service.getCards();
      double total=0;
      for(CreditCard eachCard:cards) {
    	  System.out.println(eachCard);
    	  total=total+eachCard.getAmountDue();
      }
      System.out.println(total);
        
    }
}
