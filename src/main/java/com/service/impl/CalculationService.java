package com.service.impl;

import org.springframework.stereotype.Service;

import java.math.BigInteger;


@Service
public interface CalculationService {

    BigInteger factorial(Long n);

}