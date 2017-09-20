package danielp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping ("/calculation")

public class CalculationController {

    @RequestMapping("/add/{a}/{b}")
    public Long add (@PathVariable("a") Long a, @PathVariable("b") Long b){
        return a+b;

    }
    @RequestMapping ("/factorial/{n}")
    private BigDecimal fact(@PathVariable(value ="n") Integer n){
        return factorial(n);
    }

    private BigDecimal factorial(Integer n) {
        BigDecimal factorial = BigDecimal.valueOf(1);

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
    }

}
