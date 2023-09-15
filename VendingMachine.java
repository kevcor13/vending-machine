import java.util.ArrayList;

/**
   A vending machine.
   Needs to store products
   Need to have a coinbox
   Needs to keep track of current coins
*/
public class VendingMachine
{ 
   private ArrayList<Product> products;
   private CoinBox Box;
   private ArrayList<Integer> quantity;

//constructor for vending machine 
   public VendingMachine()
   {
      this.products = new ArrayList<Product>();
      this.Box = new CoinBox();
      this.quantity = new ArrayList<Integer>();
   }
   public ArrayList<Product> getProductTypes()
   {
      return this.products;
   }

   //first method adds the product to the array list of both the product and the quantity

   public void addProduct(Product product, int quantity)
   {
    products.add(product);  
    this.quantity.add(quantity);
   }
   public String buyProduct(Product product)
   {
       //introduced a variable will be used later
     
       int num = 0; 

   // this loop goes through the products array list to capture the position of the picked product. 
      
   for(int i = 0; i < products.size(); i++)
      {
         Product name = products.get(i);
         if(name == product)
         {
            num += i;
         }
      }
      
      double amount =  Box.getValue();
      if (amount < product.getPrice())
      {
         return "Insuficient funds";
      }
//decreses the quantity of the object 
      else if(amount <= quantity.get(num))
      {
         //sets the new quantity subrtacting the product taken by the buyer 
         quantity.set(num, (int) (quantity.get(num)-amount));
         return "OK";
      }

      else if( quantity.get(num) == 0)
      {
         products.remove(product);
         quantity.remove(num);
         return "OUT OF STOCK";
      }
   return " ";
   }
// method to add coins into the coinbox 

   public double addCoin(Coin c) 
   {
     Box.addCoin(c);
     return Box.getValue();
   }
// method calls the function to remove the coins from the coinbox 
   public double removeMoney()
   {
      double number = Box.getValue();
      Box.removeAllCoins();
      return number;
   }
}
