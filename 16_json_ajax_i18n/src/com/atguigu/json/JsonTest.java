package com.atguigu.json;

import com.atguigu.pojo.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 郝哲超
 * @create 2020-07-09 19:48
 */
public class JsonTest {
//1.javaBean和json的互转
@Test
    public void test1(){
 Person person=new Person("郝哲超",1);
 //创建Gson对象实例
 Gson gson=new Gson();
    String personJsonString = gson.toJson(person);//toJson方法将java类型转换为Json字符串
    System.out.println(personJsonString);

    //fromJson把json字符串转换回java对象
    //第一个参数是json字符串
    //第二个参数是转换回去的java对象类型
    Person person1 = gson.fromJson(personJsonString, Person.class);
    System.out.println(person1);
}

@Test
    public void  test2(){
//List和json 的互转
    List<Person> personList=new ArrayList<>();
    personList.add(new Person("吴燕珠",10));
    personList.add(new Person("朱迪",11));
    Gson gson=new Gson();//创建Gson对象实例
   //把List集合转换为Json字符串  [{"name":"吴燕珠","id":10},{"name":"朱迪","id":11}]
    String personListJsonString = gson.toJson(personList);
    System.out.println(personListJsonString);
    //Json字符串转换为List集合
    List<Person> list = gson.fromJson(personListJsonString, new PersonListType().getType());
    System.out.println(list);
    Person perosn=list.get(0);
    System.out.println(perosn);
}

@Test
    public void test3(){
   // map 和 json 的互转
    Map<Integer,Person> personMap=new HashMap<>();
    personMap.put(1,new Person("张之洞",99));
    personMap.put(2,new Person("周志芳",100));

    Gson gson=new Gson();
    //把Map转换为Json字符串
    String personMapJsonString = gson.toJson(personMap);
    System.out.println(personMapJsonString);
    //Json字符串转换为Map
    // Map<Integer,Person> personMap2= gson.fromJson(personMapJsonString, new PersonMapType().getType());

    //使用匿名内部类的方式去把Json字符串转换为Map，这样就不用创建类继承TypeToken啦随写随用
    Map<Integer,Person> personMap2 = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer, Person>>(){}.getType());
    System.out.println(personMap2);
    Person p = personMap2.get(1);
    System.out.println(p);


}
}

