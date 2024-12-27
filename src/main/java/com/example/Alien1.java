package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien1 {
    @Value("21")
    private int age;

    //@Qualifier("lap1") //if you do not want to use Qualifier use Primary
//    @Autowired
//    @Qualifier("desk")
    private Computer comp;
    public Alien1(){
        System.out.println("Alien1 Object Created");
    }
//    @ConstructorProperties({"age", "lap"})
//    public Alien1(int age, Computer comp) {
//        this.age = age;
//        this.lap = lap;
//    }



//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public int getAge() {return age;}
    public void setAge(int age) {
        //System.out.println("Setter Called");
        this.age = age;
    }


    public Computer getComp() {return comp;}

    @Autowired
    @Qualifier("laps")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
}
