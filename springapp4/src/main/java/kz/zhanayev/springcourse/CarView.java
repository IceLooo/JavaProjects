package kz.zhanayev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CarView {
    private final Crossover crossover;
    private final Sedan sedan;
    private final Coupe coupe;
    private Car car1;
    private Car car2;
    private Car car3;

    @Autowired
    public CarView(@Qualifier("sedan") Car car1,
                   @Qualifier("crossover") Car car2,
                   @Qualifier("sedan") Car car3, Crossover crossover, Sedan sedan, Coupe coupe) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.crossover = crossover;
        this.sedan = sedan;
        this.coupe = coupe;
    }

    public void showCar(CarModel carModel){
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if(carModel == CarModel.CROSSOVER){
            System.out.println(crossover.getModels().get(randomNumber));
        } else if (carModel == CarModel.SEDAN) {
            System.out.println(sedan.getModels().get(randomNumber));
        }else {
            System.out.println(coupe.getModels().get(randomNumber));
        }
    }

}
