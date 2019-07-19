package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class JSONObjectDemoController {
    
    @RequestMapping("/jsonMethod")
    public Order index() {
        return new Order("123",new Date(),123.56f);
    }
    
}
