package MicroService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {

    @PostMapping("/calculator")
    public Double calculate(@RequestBody Map<String, Object> data) {
        double number1 = (double) data.get("num1");
        double number2 = (double) data.get("num2");
        String action = (String) data.get("action");

        if (action.equals("+")) {
            return number1 + number2;
        }
        if (action.equals("-")) {
            return number1 - number2;
        }
        if (action.equals("*")) {
            return number1 * number2;
        }
        if (action.equals("/")) {
            if (number2 == 0) {
                return null;
            } else {
                return number1 / number2;
            }
        } else {
            return null;
        }
    }

}
