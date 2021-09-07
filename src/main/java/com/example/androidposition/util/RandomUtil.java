package com.example.androidposition.util;

import java.util.Random;

public class RandomUtil {
    public static String makeNum(){
        Random random = new Random();
        String num = random.nextInt(999999) + "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 6-num.length() ; i++) {
            sb.append("0");
        }
        num = sb.toString() + num;
        return num;
    }
}
