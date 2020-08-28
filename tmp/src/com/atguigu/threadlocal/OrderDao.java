package com.atguigu.threadlocal;

/**
 * @author 郝哲超
 * @create 2020-07-08 10:09
 */
public class OrderDao {
    public void saveOrder(){
        String name = Thread.currentThread().getName();

        System.out.println("OrderDao当前线程["+name+"]中保存的数据是:"+ThreadLocalTest.threadLocal.get());


    }
}
