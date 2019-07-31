package com.qf.springboot_mybatis.handler;

import com.qf.springboot_mybatis.error.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Oulingcheng
 * @Date 2019/7/30
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> exceptionHandler(Exception e){
        e.printStackTrace();
        return new ResultBean("404","你的操作有误");
    }
}
