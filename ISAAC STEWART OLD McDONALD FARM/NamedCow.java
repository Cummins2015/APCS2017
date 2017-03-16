package Inheritance20.Labs.OldMacDonald;

public class NamedCow extends Cow
{
   private String myType;
   private String mySound;
   private String myName;
	
   NamedCow(String name)
   {
      myType = "Cow";
      mySound = "Moo";
      myName = name;
   }

   public String getSound() 
   {
      return mySound;
   }

   public String getType() 
   {
      return myType;
   }
   public String getName()
   {
      return myName;
   }
}
