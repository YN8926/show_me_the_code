package hz.simplejee;

/**
 * Created by 辉辉大侠 on 8/3/16.
 */
public class T {

    public static final String CESH = "cesh";
    private static String x;

    public static void main(String[] args) {
        String s = "def.abc.txt.";
        System.out.println(s.length());
        System.out.println(s.lastIndexOf("."));
        System.out.println(s.substring(s.lastIndexOf(". ") + 1));
        ddd(s);
    }

    private static void ddd(String ceshi1) {
        String ceshi = CESH;
        x = ceshi1;
        System.out.println(x);
    }
}