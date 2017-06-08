package spring.mvc.tuto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "static/index.html";
    }
}
