package com.dragon.myapplication.aop;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/9 23:27
 * @Version 1.0
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST,reason = "啥玩意")
public class TestException  extends RuntimeException{
}
