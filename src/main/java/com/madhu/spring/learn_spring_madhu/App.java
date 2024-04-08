package com.madhu.spring.learn_spring_madhu;

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
       ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml") ;
       GreetingImp greetingimp = context.getBean("greet",GreetingImp.class);
       greetingimp.Greet();
    }
}
