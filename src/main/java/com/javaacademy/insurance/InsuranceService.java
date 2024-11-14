package com.javaacademy.insurance;

import java.math.BigDecimal;

public interface InsuranceService {
    InsuranceContract offerInsuranceContract(BigDecimal amountOfCoverage, String fullName, InsuranceType insuranceType);
    InsuranceContract payContract(String contractNumber);
}
