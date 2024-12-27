package com.example;

import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien1 obj1 = context.getBean(Alien1.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean("desktop1",Desktop.class);
//        dt.compile();
//        Desktop dt1 = context.getBean("desktop1",Desktop.class);
//        dt.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien1 obj1 = (Alien1) context.getBean("maseera");
//        obj1.age = 21;
//        System.out.println(obj1.age);
//        //obj1.code();
//        Alien1 obj2 = (Alien1) context.getBean("maseera");
//        System.out.println(obj2.age);
//        obj2.code();
//        Alien1 obj1 = context.getBean("maseera", Alien1.class);
//        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
//        Computer comp = context.getBean(Computer.class);
//        Desktop des = context.getBean(Desktop.class);



    }
}
