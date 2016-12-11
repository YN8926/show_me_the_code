package hz.simplejee.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by wanghui on 08/12/2016.
 */
public class MyRealm1 implements Realm {
    /**
     * 返回唯一的Realm名称
     * @return
     */
    @Override
    public String getName() {
        return "My Realm";
    }

    /**
     * 判断此Realm是否支持此类Token
     * @param authenticationToken
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    /**
     * 根据Token获取认证信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String password = new String(token.getPassword());
        if ("zhangsan".equals(token.getUsername()) && "1234".equals(password)) {
            return new SimpleAuthenticationInfo(token.getUsername(), password, getName());
        }
        return null;
    }
}
