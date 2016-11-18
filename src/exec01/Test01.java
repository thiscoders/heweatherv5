package exec01;

import com.google.gson.Gson;
import domain.HeWeather5;
import org.junit.Test;
import weather.Weather01;

import java.io.*;
import java.util.Properties;

/**
 * Created by ye on 11/18/16.
 */
public class Test01 {
    private String urls;
    private String keys;

    @Test
    public void test1() throws IOException {
        //1.从配置文件获取参数
        InputStream inputStream = Test01.class.getClassLoader().getResourceAsStream("mkey.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        urls = properties.getProperty("urls");
        keys = properties.getProperty("keys");

        //2.创建天气对象
        Weather01 weather = new Weather01(urls, keys);
        weather.exex("beijing", "zh_en");
    }

    @Test
    public void test2() throws IOException {
        File file = new File("src/thisget/xian.json");
        FileReader reader = new FileReader(file);
        Gson gson = new Gson();
        HeWeather5 heWeather5 = gson.fromJson(reader, HeWeather5.class);
        for (HeWeather5.HeWeather5Bean bean : heWeather5.getHeWeather5()) {
            System.out.println(bean.getBasic().getCity());
        }
        reader.close();
    }

}
