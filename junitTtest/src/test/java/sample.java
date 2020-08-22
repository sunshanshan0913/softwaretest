import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import org.junit.Test;

public class sample {
    @Test
    public void MockTest() {
        /* 创建真实对象 */
        List list = new LinkedList();
        List spy = spy(list);

        spy.add("hello");

        when(spy.get(0)).thenReturn("hello world");

        System.out.println(spy.get(0));
    }
}
