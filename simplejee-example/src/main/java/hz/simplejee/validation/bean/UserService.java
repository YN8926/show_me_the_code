package hz.simplejee.validation.bean;

import hz.simplejee.springframework.mvc.hello.controller.support.Result;

/**
 * Created by wanghui on 23/12/2016.
 */
public interface UserService {
    Result save(User user);
    boolean hasExistUserName(String name);
}
