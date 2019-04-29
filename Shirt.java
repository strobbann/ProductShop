public class Shirt extends Clothes {
  public Shirt(String paramString) {
    super(paramString);
  }
  
  public String toString()
  {
    return String.format("Product class       : %s\nPrice               : %,.2f\nProduct Description : %s\n", new Object[] {
    

      getClassName(), 
      Double.valueOf(getPrice()), 
      getProductDescription() });
  }
}
