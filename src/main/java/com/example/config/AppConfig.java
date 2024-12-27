package com.example.config;

import com.example.Alien1;
import com.example.Computer;
import com.example.Desktop;
import com.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
//    @Bean

//    public Alien1 alien1(Computer com){ //@Qualifier("desktop1")
//        Alien1 obj = new Alien1();
//        obj.setAge(24);
//        obj.setComp(com);
//        return obj;
//    }
//    //@Bean(name = {"comp2","desktop1","Beast"})
//    @Bean
//    //@Scope("prototype")
//    public Desktop desktop1(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
