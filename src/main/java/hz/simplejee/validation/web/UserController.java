package hz.simplejee.validation.web;

import hz.simplejee.springframework.mvc.hello.controller.support.Result;
import hz.simplejee.validation.bean.ApiTemplate;
import hz.simplejee.validation.bean.BizException;
import hz.simplejee.validation.bean.User;
import hz.simplejee.validation.bean.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public Result save(final @Valid User user) {
        return new ApiTemplate() {
            @Override
            protected void checkParams() throws IllegalArgumentException {
                Assert.state(!userService.hasExistUserName(user.getName())
                        , "用户名已存在.");
            }

            @Override
            protected Object process() throws BizException {
                return userService.save(user);
            }
        }.execute();
    }
}
