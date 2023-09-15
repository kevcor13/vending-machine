

//HIDE
/**
   A coin with a monetary value.
*/
public class Coin
{
   private double value;
   private String name;
   
   public static final Coin NICKEL = new Coin(.05, "nickel");
   public static final Coin DIME = new Coin(.10,"Dime");
   public static final Coin QUARTER = new Coin(.25, "Quarter");
   public static final Coin DOLLAR = new Coin(1.00, "Dollar");
   // provide additional coints to be used
   
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double d, String name) 
   { 
       value = d;
       this.name = name;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
      
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name; 
      
   }

   /**
      Formats the coin's name and value for output as String
   */
   public String toString()
   {
      return name + " @ " + String.format("%.2f", value);
   }
}
