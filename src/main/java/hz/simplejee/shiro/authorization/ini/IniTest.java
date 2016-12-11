package hz.simplejee.shiro.authorization.ini;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by wanghui on 08/12/2016.
 */
public class IniTest {

    @Test
    public void test_1() {
        String p = this.getClass().getResource("shiro-role.ini").getPath();
        IniSecurityManagerFactory sf = new IniSecurityManagerFactory(p);
        SecurityManager sm = sf.getInstance();
        SecurityUtils.setSecurityManager(sm);

        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken("zhang", "123"));

        Assert.assertTrue(subject.isAuthenticated());
        Assert.assertTrue(subject.hasRole("role1"));
        Assert.assertTrue(subject.hasAllRoles(Arrays.asList("role1", "role2")));

        boolean[] hasRoles = subject.hasRoles(Arrays.asList("role1", "role2", "role3"));
        Assert.assertTrue(hasRoles[0]);
        Assert.assertTrue(hasRoles[1]);
        Assert.assertFalse(hasRoles[2]);
    }
}
