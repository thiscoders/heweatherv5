package tes.lgiue.pack01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ye on 11/18/16.
 */
public class Exec {
    private static String urls;
    private static String keys;

    static {
        InputStream inputStream = Exec.class.getClassLoader().getResourceAsStream("mkey.properties");

        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        urls = properties.getProperty("urls");
        keys = properties.getProperty("keys");
    }

    public static void main(String[] args) {
        System.out.println(urls + "\r\n" + keys);
    }
}
