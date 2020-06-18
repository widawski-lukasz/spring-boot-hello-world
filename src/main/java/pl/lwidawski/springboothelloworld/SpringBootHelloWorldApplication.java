package pl.lwidawski.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("pl.lwidawski")
public class SpringBootHelloWorldApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }


}
