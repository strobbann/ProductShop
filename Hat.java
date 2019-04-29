/*
 * Decompiled with CFR 0.139.
 */
public class Hat extends Accessories implements Returnable {
    public Hat(String inLine) {
        super(inLine);
    }

    @Override
    public String toReturn() {
        return "To return you need to have not worn it";
    }

    @Override
    public String toString() {
        return String.format("Product Class       : %s\n" +
                             "Product Name        : %s\n" +
                             "Product Number      : %d\n" +
                             "Product Description : %s\n" +
                             "Price               : %f\n" +
                             "To Return           : %s\n",
                              getClassName(),
                              getProductName(),
                              getProductNumber(),
                              getProductDescription(),
                              getPrice(),
                              toReturn());
    }
}
