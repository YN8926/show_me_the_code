package hz.simplejee.shiro.authentication.ini;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanghui on 08/12/2016.
 */
public class Main {
    @Test
    public void testIni() {
        /**
         * 获取SecurityManager工厂，并使用配置文件初始化
         */
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory(this.getClass().getResource("shiro.ini").getPath());
        /**
         * 获取securityManager实例
         */
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        /**
         * 得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
         */
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("zhangsan", "123");

        try {
            /**
             * 登录，进行身份验证,会委托给SecurityManage的login方法
             */
            subject.login(token);
        } catch (AuthenticationException e) {
            /**
             * 身份验证失败
             */
            e.printStackTrace();
        }
        Assert.assertTrue(subject.isAuthenticated());

        subject.logout();

        Assert.assertFalse(subject.isAuthenticated());
    }
}
