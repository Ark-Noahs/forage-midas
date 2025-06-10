
//this is the base package for this project!!!!!!!
package com.jpmc.midascore;

//gets us the Spring Noot classes needed to function 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//this tells Spring noot that this is the main app class so 'START HERE'
public class MidasCoreApplication {


    //this is MAIN
    public static void main(String[] args) {
        SpringApplication.run(MidasCoreApplication.class, args);//application start here
    }

}
