/*
Create an IdGenerator class. It has a static generate method which gets a Product as a parameter
and returns with a generated String which will be the unique identifier for the product.
If the product is a Movie, the id should start with MOV. If the product is a Game, the id should start with GAM.
If the product is a Book, the id should start with BOO.
 */

public class IdGenerator {

    static String generatedId = "";
    public static String generate(Product product) {return generatedId;}
}
