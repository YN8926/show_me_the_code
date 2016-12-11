package hz.simplejee.shiro.authorization;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * Created by wanghui on 08/12/2016.
 */
public class Hello {
    /**
     * 编程式
     */
    public void test() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.hasRole("admin")) {
            //有权限
        } else {
            //无权限
        }
    }
}
