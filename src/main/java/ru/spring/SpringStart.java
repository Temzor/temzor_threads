package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        BeanStart beanStart = context.getBean("beanStart", BeanStart.class);
        System.out.println(beanStart.getName());

        context.close();
    }
}
