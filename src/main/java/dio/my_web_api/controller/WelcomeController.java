package dio.my_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa classe agora é um restcontroler, e alguns serviços são recurso http
public class WelcomeController {
    @GetMapping // define que é um recurso http do tipo get
    public String welcome(){
        return "Welcome to My Spring Boot API";
    }
}
