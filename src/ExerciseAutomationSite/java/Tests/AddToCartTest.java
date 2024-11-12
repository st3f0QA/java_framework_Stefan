package Tests;
import helpers.Test_Methods;
import org.testng.annotations.Test;

public class AddToCartTest {
    Test_Methods test = new Test_Methods();

    @Test
    public void addToCart(){//not finished
        test.AddProductToCart("Polo","Rs. 1500");
        test.AssertTheCart("Premium Polo T-Shirts");
    }
}
