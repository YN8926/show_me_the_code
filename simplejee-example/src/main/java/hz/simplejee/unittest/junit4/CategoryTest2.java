package hz.simplejee.unittest.junit4;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by wanghui on 26/11/2016.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses(CategoryTest.class)
@Categories.IncludeCategory(MyCategory.class)
public class CategoryTest2 {
}
