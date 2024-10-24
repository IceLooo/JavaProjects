package kz.zhanayev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class CarView {
    private List<Car> cars = new ArrayList<>();

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    private String color;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public CarView(Car car) {
//        this.car = car;
//    }

    public CarView() {}

//    public void setCar(Car car) {
//        this.car = car;
//    }

    public void getCarList() {
        for (Car car : cars){
            System.out.println("This model : " + car.getModel());
        }
    }
}
