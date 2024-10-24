package kz.zhanayev.springcourse;

public class CarView {
    private Car car;

    public CarView(Car car) {
        this.car = car;
    }

    public void getCar() {
        System.out.println("This model :" + car.getModel());
    }
}
