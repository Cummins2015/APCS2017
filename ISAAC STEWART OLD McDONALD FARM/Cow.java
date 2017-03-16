package Inheritance20.Labs.OldMacDonald;

public class Cow implements Animal
{
   private String myType;
   private String mySound;
	
   Cow()
   {
      myType = "Cow";
      mySound = "Moo";
   }
   public String getSound()
   {
      return mySound;
   }
   public String getType()
   {
      return myType;
   }
}