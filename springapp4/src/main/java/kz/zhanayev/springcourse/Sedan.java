package kz.zhanayev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Sedan implements Car{
    private List<String> models = new ArrayList<>();

    {
        models.add("Lexus Es250");
        models.add("Toyota Camry XV50");
        models.add("Lexus Ls350");
    }

    @Override
    public List<String> getModels() {
        return models;
    }
}
