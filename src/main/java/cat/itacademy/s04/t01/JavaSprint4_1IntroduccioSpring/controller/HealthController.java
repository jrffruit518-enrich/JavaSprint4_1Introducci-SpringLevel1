package cat.itacademy.s04.t01.JavaSprint4_1IntroduccioSpring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }


}
