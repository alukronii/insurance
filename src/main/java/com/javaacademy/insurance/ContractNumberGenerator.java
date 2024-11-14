package com.javaacademy.insurance;

import java.util.UUID;

public class ContractNumberGenerator {
    public String generateNumber() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
