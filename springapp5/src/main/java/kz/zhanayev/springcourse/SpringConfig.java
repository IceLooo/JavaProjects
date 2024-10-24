package kz.zhanayev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Sedan sedan(){
        return new Sedan();
    }

    @Bean
    public Crossover crossover(){
        return new Crossover();
    }

    @Bean
    public Coupe coupe(){
        return new Coupe();
    }

    @Bean
    public CarView carView(){
        return new CarView(coupe(), crossover(), sedan());
    }
}
