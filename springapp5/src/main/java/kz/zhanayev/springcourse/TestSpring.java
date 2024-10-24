package kz.zhanayev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);



        CarView carView = context.getBean(CarView.class);
        System.out.println(carView.shjowModel());
    }
}
