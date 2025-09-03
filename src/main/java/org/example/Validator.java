package org.example;

public class Validator {
    public static boolean validateInput(String poNumber, String productCode, int quantity) {
        return poNumber != null && !poNumber.isEmpty()
                && productCode != null && !productCode.isEmpty()
                && quantity > 0;
    }
}
