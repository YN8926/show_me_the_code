package hz.simplejee.guava.utilities;

import org.junit.Test;

import com.google.common.base.MoreObjects;

/**
 * Created by wanghui on 6/16/16.
 */
public class MoreObjectsTest {

    @Test
    public void testToString(){
        System.out.println(new T(1,null));
        System.out.println(new T(1,"abc"));
    }
    static class T{

        public T(int iInt, String sString) {
            this.iInt = iInt;
            this.sString = sString;
        }

        private int iInt;
        private String sString;

        public int getiInt() {
            return iInt;
        }

        public void setiInt(int iInt) {
            this.iInt = iInt;
        }

        public String getsString() {
            return sString;
        }

        public void setsString(String sString) {
            this.sString = sString;
        }

        @Override
        public String toString() {
            return MoreObjects
                    .toStringHelper(this)
                    .add("iInt", iInt)
                    .add("sString", sString)
//                    .omitNullValues()
                    .toString();
        }
    }
}
