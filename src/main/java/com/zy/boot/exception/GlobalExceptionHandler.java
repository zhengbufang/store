package com.zy.boot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {


    /**
     * * 浏览器和其他客户端都返回了json 数组，不满足自适应
     */
    @ExceptionHandler(value = SysException.class)
    @ResponseBody
        public Map<String, Object> dealException(SysException e, HttpServletRequest request) {
        Map<String, Object> retInfo = new HashMap<>();
        retInfo.put("code", e.getErrcode());
        retInfo.put("msg", e.getErrLogMsg());
        return retInfo;
    }


}
