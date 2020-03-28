package com.dragon.myapplication.mylistener.event;

import com.dragon.myapplication.pojo.Order;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/26 23:05
 * @Version 1.0
 */
@Data
public class MyApplicationEvent extends ApplicationEvent {
    private Order order;
    public MyApplicationEvent(Object source,Order order) {
        super(source);
        this.order = order;
    }
}
