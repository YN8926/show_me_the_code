package hz.simplejee.unittest.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
/**
 * Created by 辉辉大侠 on 8/1/16.
 * http://www.vogella.com/tutorials/Mockito/article.html
 */
public class SimpleTest {
    @Test
    public void listTest() {
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("abc");
        String result = list.get(0);
        verify(list).get(0);

        System.out.println(result);
    }

    @Test
    public void testMoreReturn() {
        Iterator<String> itr = mock(Iterator.class);
        when(itr.next()).thenReturn("a").thenReturn("b");
        assertEquals("ab", itr.next()+itr.next());
    }

    @Test(expected = IOException.class)
    public void testException() throws IOException {
        OutputStream os = mock(OutputStream.class);
        doThrow(new IOException()).when(os).close();
        os.close();

    }
}
