package co.develhope.Deploy_EnvironmentsVariables_02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {
    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String getMessage() {
        return welcomeMsg;
    }
}


