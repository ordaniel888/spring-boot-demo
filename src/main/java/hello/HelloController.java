package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @GetMapping("/abcd")
    public String indexxx() {
        return "Greetings from Spring Boot!";
    }
}
