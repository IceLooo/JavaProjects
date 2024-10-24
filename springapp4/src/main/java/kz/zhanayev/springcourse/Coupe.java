package kz.zhanayev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Coupe implements Car{
   private List<String> models = new ArrayList<>();

    {
        models.add("Ford Mustang");
        models.add("Chevrolet Camaro");
        models.add("Toyota Supra");
    }

    @Override
    public List<String> getModels() {
        return models;
    }
}
