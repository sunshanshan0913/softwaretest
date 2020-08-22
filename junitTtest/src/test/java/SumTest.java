import org.junit.Test;

public class SumTest {
    @Test
    public void testSum(){
        Compute compute = new Compute();
        int sum = compute.computeSum(3,4);
        int expected =7;
        System.out.println("testSum "+(expected==sum));
    }
}
