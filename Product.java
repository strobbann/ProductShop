public class Product
{
  private String className;
  private int productNumber;
  private String productName;
  private String productDescription;
  private double price;
  private String size;
  private String colour;

  public Product(String paramString) {
    className = getClass().getName();
    String[] trimmedLines = StringHandler.trim(paramString.split(","));
    productNumber = Integer.parseInt(trimmedLines[0]);
    productName = trimmedLines[2];
    productDescription = trimmedLines[3];
    price = Double.parseDouble(trimmedLines[4]);
    if (!trimmedLines[5].equals("N/A")) {
      size = trimmedLines[5];
    }
    if (!trimmedLines[6].equals("N/A"))
      colour = trimmedLines[6];
  }

  public String getClassName() {
    return className;
  }

  public int getProductNumber() {
    return productNumber;
  }

  public String getProductName() {
    return productName;
  }

  public String getProductDescription() { return productDescription; }

  public String getSize()
  {
    return size;
  }

  public String getColour() {
    return colour;
  }

  public double getPrice() {
    return price;
  }

  public String toString()
  {
    return String.format("Product class       : %s\n" +
                            "Product Number      : %d\n" +
                            "Product Name        : %s\n" +
                            "Product Description : %s\n" +
                            "Size                : %s\n" +
                            "Colour              : %s\n" +
                            "Price               : %f\n",
                              getClassName(),
                              getProductNumber(),
                              getProductName(),
                              getProductDescription(),
                              getSize(),
                              getColour(),
                              getPrice());
  }
}
