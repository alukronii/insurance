package com.javaacademy.insurance;

import java.math.BigDecimal;

public interface InsuranceCalcService {
    BigDecimal insurancePrice(BigDecimal amountOfCoverage, InsuranceType insuranceType);
}
