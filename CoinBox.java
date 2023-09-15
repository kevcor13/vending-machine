
import java.util.ArrayList;

/**
   A box of coins.
*/
public class CoinBox
{  
   private ArrayList<Coin> box;
   /**
      Constructs a CoinBox object.
   */
   public CoinBox()
   {
      box = new ArrayList<Coin>();
   }

   /**
      Adds a coin.
      @param c the coin to add
   */
   public void addCoin(Coin c)
   {  
      box.add(c);
   }

   /**
      Adds coins from one coinbox to another.
      @param other the box of coins
   */
   public void addCoins(CoinBox other)
   {  
      for(Coin newbox:other.box)
      {
         this.addCoin(newbox);
      }
   }

   /**
      Gets the value of all the coins.
      @return total the total value of all the coins
   */
   public double getValue()
   {  
      double sum = 0.0;
      for(Coin i : box)
      {
         sum += i.getValue();
      }
      return sum;
   }
   
   /**
      Removes all the coins. Use ArrayList function.
      Do NOT use a new constructor to a new memory location.
   */
   public void removeAllCoins()
   { 
      box.removeAll(box);
   }
}