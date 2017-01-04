package hz.simplejee.swagger.hello.controller;

import hz.simplejee.springframework.mvc.hello.controller.support.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wanghui on 28/11/2016.
 */
@Controller
@RequestMapping("/")
@Api(value = "hello-api", description = "测试API")
public class HelloController {

    @RequestMapping(value = "plus", method = RequestMethod.GET)
    @ApiOperation("测试a+b服务")
    @ResponseBody
    public Result add(@ApiParam(required = true, value = "加数") @RequestParam("a") int a,
                      @ApiParam(required = true, value = "被加数") @RequestParam("b") int b) {
        Result r = new Result();
        r.setData(a + b);
        return r;
    }
}
