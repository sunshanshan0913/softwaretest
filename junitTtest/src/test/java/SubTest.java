import org.junit.Test;

public class SubTest {
    @Test
    public void testSub(){
        Compute compute = new Compute();
        int sub = compute.computeSub(3,4);
        int expected =-1;
        System.out.println("testSub "+(expected==sub));
    }
}
