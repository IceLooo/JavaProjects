package kz.zhanayev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Crossover implements Car{
    private List<String> models = new ArrayList<>();

    {
        models.add("Toyota Rav4");
        models.add("Toyota Highlander");
        models.add("Lexus Rx350");
    }

    @Override
    public List<String> getModels() {
        return models;
    }
}
