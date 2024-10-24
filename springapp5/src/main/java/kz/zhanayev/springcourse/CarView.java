package kz.zhanayev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;

public class CarView {

    private Car car1;
    private Car car2;
    private Car car3;

    public CarView(@Qualifier("crossover") Car car1,
                   @Qualifier("sedan") Car car2,
                   @Qualifier("coupe") Car car3) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
    }

    public String shjowModel(){
        return "You see: " + car1.getModel() + ", " + car2.getModel() + ", " + car3.getModel();
    }
}
