package com.base.core.exception;

import com.base.core.msg.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * @author acer
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    public ModelAndView defaultErrorHander(HttpServletRequest req,
                                           Exception e) throws Exception{
        log.error("----------捕捉到全局异常", e);

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    public R jsonErrorHandler(HttpServletRequest req, BaseException e) throws Exception{
        return R.fail(e.getMessage(), "some data");
    }
}
