package com.edu19rotate;

public class AppCardano {
    public static void main(String[] args) {
        String openText = "My Friend is Mercedes";
        Cardano cardano = new Cardano();
        //
        String cryptoText = cardano.Encrypt(openText);
        System.out.println("cryptoText = " + cryptoText);
        //
        String resultText = cardano.Decrypt(cryptoText);
        System.out.println("resultText = " + resultText);
    }
}
