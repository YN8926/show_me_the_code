package hz.simplejee.validation.bean;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class WebExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object handler,
                                         Exception ex) {
        ModelAndView mv = new ModelAndView();
        /**
         * 1.如果是异步请求,则返回系统异常;
         * 2.如果是系统内部错误,则跳转到错误页面;
         */
        if (request.getHeader("x-requested-with") != null) {
            String message = "系统内部未知错误，请联系云修客服人员。";
            if (ex instanceof BizException) {
                message = ex.getMessage();
            }
            mv.addObject("message", message);
            mv.addObject("errorMsg", message);
            mv.addObject("success", false);
            mv.setView(new FastJsonJsonView());
        } else {
            try {
                response.sendRedirect(request.getContextPath() + "/html/error-web/web_error.html");
            } catch (IOException e) {
            }
        }
        return mv;
    }
}
