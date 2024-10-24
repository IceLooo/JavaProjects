package kz.zhanayev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Car car = context.getBean("carBean", Car.class);

        CarView carView = new CarView(car);
        carView.getCar();

        context.close();
    }
}
