package com.company;

public class SymmetricEncryption {

    public static int createKey(){
        int key = (int)Math.ceil(Math.random() * 31);

        return key;
    }
    public static String Encryption(String data, int key){
        String coded = "";

        for (int i = 0; i < data.length(); i++){
            coded += (char)(data.charAt(i) ^ key);
        }

        return coded;
    }

    public static String Decryption(String data, int key){
        String ans = "";

        for (int i = 0; i < data.length(); i++){
            ans += (char)(data.charAt(i)^key);
        }

        return ans;
    }
}
