package hz.simplejee.guava.utilities;


import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Optional;

/**
 * 相对于接受null，对null的快速失败操作对开发者更加有帮助
 * @author mokala
 *
 */
public class NullUtils {

	@Test
	public void optionalTest() {
		Optional<Integer> v = Optional.<Integer>of(100);
		Assert.assertTrue(v.isPresent());
		Assert.assertEquals(Integer.valueOf(100), v.get());
	}
}
