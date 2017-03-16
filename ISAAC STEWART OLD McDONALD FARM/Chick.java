package Inheritance20.Labs.OldMacDonald;

import java.util.Random;

public class Chick implements Animal 
{
   private String myType;
   private String mySound;
	
   Chick()
   {
      myType = "Chick";
      mySound = "Cheep";
   }
   public String getSound() 
   {	    
      Random random = new Random();
   			
      if(random.nextBoolean())
      {
         mySound = "Cluck";
         return mySound;
      }
      else
      {
         return mySound;
      }
   }
   public String getType() 
   {
      return myType;
   }
}