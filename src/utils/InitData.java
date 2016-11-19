package utils;

import exec01.Case01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ye on 11/18/16.
 */
public class InitData {
    private static Properties properties;

    static {
        try {
            InputStream inputStream = Case01.class.getClassLoader().getResourceAsStream("mkey.properties");
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrlsV5() throws IOException {
        return properties.getProperty("urlsv5");
    }

    public static String getUrls() throws IOException {
        return properties.getProperty("urls");
    }

    public static String getKeys() throws IOException {
        return properties.getProperty("keys");
    }
}
