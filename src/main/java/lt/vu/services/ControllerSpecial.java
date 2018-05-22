package lt.vu.services;

import lt.vu.rest.TestController;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Specializes;

@Specializes
public class ControllerSpecial extends TestController {

    @PostConstruct
    public void init(){
        System.out.println("post construct test controller");
    }
}
