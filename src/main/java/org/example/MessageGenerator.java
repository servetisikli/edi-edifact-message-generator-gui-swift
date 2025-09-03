package org.example;

public class MessageGenerator {
    public static String generateOrder(String poNumber, String productCode, int quantity) {
        StringBuilder message = new StringBuilder();
        message.append("UNH+1+ORDERS:D:96A:UN'\n");
        message.append("BGM+220+" + poNumber + "+9'\n");
        message.append("DTM+137:20250903:102'\n");
        message.append("NAD+BY+123456789::16'\n");
        message.append("LIN+1++" + productCode + ":IN'\n");
        message.append("QTY+21:" + quantity + "'\n");
        return message.toString();
    }
}
