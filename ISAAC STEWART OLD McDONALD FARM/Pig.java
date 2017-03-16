package Inheritance20.Labs.OldMacDonald;

public class Pig implements Animal 
{
   private String myType;
   private String mySound;
	
   Pig()
   {
      myType = "Pig";
      mySound = "Oink";
   }
   @Override
   public String getSound() 
   {
      return mySound;
   }

   @Override
   public String getType() 
   {
      return myType;
   }
}
