package hz.simplejee.mockito;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import static org.mockito.Mockito.*;

/**
 * Created by wanghui on 29/11/2016.
 */
public class ExceptionTest {

    @Test(expected = IOException.class)
    public void test_1() throws IOException {
        OutputStream os = mock(OutputStream.class);
        doThrow(IOException.class).when(os).close();
        os.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_2() {
        Iterator<String> ltr = mock(Iterator.class);
        when(ltr.next()).thenThrow(IllegalArgumentException.class);
        ltr.next();
    }

    @Test(expected = RuntimeException.class)
    public void test_3() {
        Iterator<String> ltr = mock(Iterator.class);
        /**
         * 只在第2次remove时抛出异常
         */
        doNothing().doThrow(RuntimeException.class).when(ltr).remove();
        ltr.remove();
        ltr.remove();
    }
}
