package com.javaacademy.insurance;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InsuranceContract {
    private String contractNumber;
    private BigDecimal insurancePrice;
    private BigDecimal amountOfCoverage;
    private Currency currency;
    private String fullName;
    private Country country;
    private InsuranceType insuranceType;
    private boolean contractStatus;
}
