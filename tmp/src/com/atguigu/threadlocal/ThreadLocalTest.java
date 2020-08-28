package com.atguigu.threadlocal;
import org.omg.Messaging.SyncScopeHelper;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

/**
 * @author 郝哲超
 * @create 2020-07-08 9:28
 */
public class ThreadLocalTest {
//   这是线程安全的的变量
   // public final static Map<String,Object> data=new Hashtable<String,Object>();
    public static ThreadLocal<Object> threadLocal=new ThreadLocal<Object>();
      private static Random random=new Random();
    public  static class Task implements  Runnable{

        @Override
        public void run() {
   //在Run方法中随机生成一个变量(线程要关联的数据),然后以当前线程名为key保存到map中
            Integer i = random.nextInt(1000);
            //获取当前线程名
            String name = Thread.currentThread().getName();
            System.out.println("线程{"+name+"}生成的随机数是:"+i);
           //data.put(name,i);  //name是线程名也是key值   i是value值是关联的数据
            threadLocal.set(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          new OrderService().createOrder();
            //Object o = data.get(name);
            Object o = threadLocal.get();
            System.out.println("在线程【"+name+"】快结束时取出关联的数据:"+o);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            new Thread(new Task()).start();
        }
    }


}

