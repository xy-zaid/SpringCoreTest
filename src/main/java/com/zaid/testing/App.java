package com.zaid.testing;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       Institute i = context.getBean(Teacher.class);
//       System.out.println(i);
//       i.setName("1st");
//       System.out.println(i);
       Student j = context.getBean(Student.class);
       j.setName("2nd");
//       System.out.println(j);
       Student k = context.getBean(Student.class);
       k.setName("3rd");
       String[] beanName= context.getBeanDefinitionNames();
       Arrays.stream(beanName).forEach(System.out::println);
//       System.out.println();
       System.out.println(j);
       System.out.println(k);
       i.what();
    }
}
