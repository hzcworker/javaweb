package com.atguigu.threadlocal;

import com.atguigu.pojo.Order;

/**
 * @author 郝哲超
 * @create 2020-07-08 10:04
 */
public class OrderService {
    public void createOrder(){
        String name = Thread.currentThread().getName();
       // System.out.println("OrderService当前线程["+name+"]中保存的数据是:"+ThreadLocalTest.data.get(name));
        System.out.println("OrderService当前线程["+name+"]中保存的数据是:"+ThreadLocalTest.threadLocal.get());
         new OrderDao().saveOrder();
    }
}
