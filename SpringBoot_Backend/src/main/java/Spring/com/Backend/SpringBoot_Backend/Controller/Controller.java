package Spring.com.Backend.SpringBoot_Backend.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class Controller {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/health")
    public String getHealthCheck(){
        return "YAA I hit my endpoint";
    }
}
