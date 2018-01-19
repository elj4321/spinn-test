package hello;

/**
 * Created by stblack on 7/20/17.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings Spinn-Test 0.0.1";
    }
}
