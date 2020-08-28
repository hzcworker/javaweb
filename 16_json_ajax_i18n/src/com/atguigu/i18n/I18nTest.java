package com.atguigu.i18n;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author 郝哲超
 * @create 2020-07-13 10:11
 */
public class I18nTest {
    @Test
    public void testLocale(){
       //获取你系统默认的语言、国家信息
        Locale locale=Locale.getDefault();
        System.out.println(locale);
//        for(Locale s : Locale.getAvailableLocales()){
//            System.out.println(s);
//        }

        System.out.println(Locale.CHINA); //zh_CN  中国 中文
        System.out.println(Locale.US);   //en_US   英文 美国
    }


    @Test
    public void testI18n(){
       //得到我们需要的Locale对象
        Locale  locale=Locale.CHINA;  //中文的常量的 Locale 对象 美国的常量的 Locale 对象 Locale.US
        //通过指定的basename和Locale对象读取相应的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);
        String username = bundle.getString("username");
        System.out.println("用户名:"+username);
    }
}
