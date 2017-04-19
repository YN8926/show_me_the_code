package hz.simplejee.unittest.assertj;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


import java.util.List;

/**
 * @Author 辉辉大侠
 * @Date 2017-04-18 2:27 PM
 * @Motto 一生伏首拜阳明
 */
public class ExtractingTest {
    @Test
    public void test1() {
        List<T> list = Lists.newArrayList();
        list.add(new T("Langdo", 1L));
        list.add(new T("Mokala", 1L));
        list.add(new T("wanghui", 1L));

        assertThat(list)
                .extracting("name")
                .contains("Langdo");
    }

    static class T {

        private String name;
        private Long age;

        public T(String name, Long age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getAge() {
            return age;
        }

        public void setAge(Long age) {
            this.age = age;
        }
    }
}
