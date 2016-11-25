package hz.simplejee.springframework.mvc.hello.controller;

import hz.simplejee.springframework.mvc.hello.controller.support.Result;
import hz.simplejee.springframework.mvc.hello.controller.vo.DateVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping
    public String index() {
        return "data/index";
    }

    @RequestMapping("date")
    @ResponseBody
    public Result date() {
        Result r = new Result();
        r.setSuccess(true);
        r.setData(new DateVo(new Date()));
        return r;
    }
}
