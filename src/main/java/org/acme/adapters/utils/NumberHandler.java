package org.acme.adapters.utils;

public final class NumberHandler {

    public static int randomiza(int n) {
        int ranNum = (int) (Math.random() * n);
        return ranNum;
    }

    public static int mod(int dividendo, int divisor) {
        return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
    }

    public static String removeCaracteresEspeciais(String doc) {
        if (doc.contains(".")) {
            doc = doc.replace(".", "");
        }
        if (doc.contains("-")) {
            doc = doc.replace("-", "");
        }
        if (doc.contains("/")) {
            doc = doc.replace("/", "");
        }
        return doc;
    }

    public static String imprimeCNPJ(String CNPJ) {
        // máscara do CNPJ: 99.999.999.9999-99
        return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." + CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" + CNPJ.substring(12, 14));
    }
}
