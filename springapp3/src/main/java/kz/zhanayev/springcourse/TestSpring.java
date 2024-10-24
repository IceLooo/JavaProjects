package kz.zhanayev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        CarView carView = context.getBean("carView", CarView.class);
        carView.getCarList();

        System.out.println(carView.getColor());
        System.out.println(carView.getSpeed());


        context.close();
    }
}
