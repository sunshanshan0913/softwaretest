import org.junit.Test;

public class ProductTest {
    @Test
    public void testSum(){
        Compute compute = new Compute();
        int product = compute.computeProduct(3,4);
        int expected =12;
        System.out.println("testProduct "+(expected==product));
    }
}
