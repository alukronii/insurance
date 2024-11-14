package com.javaacademy.insurance;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class InsuranceCalcBrazilService implements InsuranceCalcService {
    @Override
    public BigDecimal insurancePrice(BigDecimal amountOfCoverage, InsuranceType insuranceType) {
        return null;
    }
}
