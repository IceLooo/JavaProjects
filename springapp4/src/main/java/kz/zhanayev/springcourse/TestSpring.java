package kz.zhanayev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Car car = context.getBean(Car.class);
//        CarView carView = new CarView(car);
//        carView.getCar();
///////////////////////////////////////////////////////////////////////////////////////
//        CarView carView = context.getBean("carView", CarView.class);
//        carView.getCar();

        CarView carView = context.getBean("carView", CarView.class);
        carView.showCar(CarModel.COUPE);
        carView.showCar(CarModel.CROSSOVER);
        carView.showCar(CarModel.SEDAN);

        context.close();

    }
}
