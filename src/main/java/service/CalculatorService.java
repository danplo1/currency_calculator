package service;


import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public interface CalculatorService {
    BigInteger factorial(Long n);

}
