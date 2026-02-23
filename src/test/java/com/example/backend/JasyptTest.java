package com.example.backend;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class JasyptTest {

    @Test
    public void jasyptTest() {
        String value = "1234";
        String result = jasyptEncoding(value);
        System.out.println(result);
    }

    public String jasyptEncoding(String value) {
        String key = "0740eccd9250f9ad37ed3c01e816e0ecd7ce4b50102228edaa532ebdd16e5afb";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWITHMD5ANDDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }
}
