package com.dragon.service.order.impl;

import com.dragon.service.order.IOrderInter;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/2 22:48
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements IOrderInter {
    @Value("${my.uuid}")
    private String name;
    public String createPPOrder() {
        return "接口方法:createPPOrder;"+name;
    }

    public String createHYOrder() {
        return "接口方法:createHYOrder";
    }

    public String createDDOrder(){
        return "OrderServiceImpl自己的方法";
    }
}
