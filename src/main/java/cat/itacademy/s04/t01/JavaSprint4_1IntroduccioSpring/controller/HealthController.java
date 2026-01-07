package cat.itacademy.s04.t01.JavaSprint4_1IntroduccioSpring.controller;


import cat.itacademy.s04.t01.JavaSprint4_1IntroduccioSpring.response.HealthStatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public HealthStatusResponse healthCheck() {

        return new HealthStatusResponse("OK");
    }


}
