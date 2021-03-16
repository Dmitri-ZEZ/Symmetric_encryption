package com.company;

public class Main {

    public static void main(String[] args) {
        int key = SymmetricEncryption.createKey();

        String coded = SymmetricEncryption.Encryption("Жил был пес", key);
        System.out.println(coded);

        System.out.println(SymmetricEncryption.Decryption(coded, key));
    }
}
