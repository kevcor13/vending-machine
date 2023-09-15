//HIDE
/**
   A product in a vending machine.
*/
public class Product
{  
   private String description;
   private double price;

   /**
      Constructs a Product object
      @param aDescription the description of the product
      @param aPrice the price of the product
   */
   public Product(String name, double aPrice)
   {  
      description = name;
      price = aPrice;
   }
   
   /**
      Gets the description.
    * @return 
    * @return 
      @return the description
   */
   public String getProductTypes()
   { 
      return this.description;
   }
   
   /**
      Gets the price.
      @return the price
   */
   public double getPrice()
   {  
      return this.price;
   }

   /**
      Determines of this product is the same as the other product.
      @param other the other product
      @return true if the products are equal, false otherwise
   */
   public boolean equals(Object other)
   {

      return false; 
      
   }
   
   /**
      Formats the product's description and price for output as String
   */
   public String toString()
   { 
      return description + " @ " + String.format("%.2f", price);
   }
}
