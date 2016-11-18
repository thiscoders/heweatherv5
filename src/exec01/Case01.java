package exec01;

import com.google.gson.Gson;
import domain.HeWeather5;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.InitData;
import utils.StreamUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

/**
 * 获取天气的相关信息
 * Created by ye on 11/18/16.
 */
public class Case01 {
    private String urls;
    private String keys;

    //从配置文件获取参数
    @Before
    public void before() throws IOException {
        urls = InitData.getUrls();
        keys = InitData.getKeys();
    }

    //获取天气信息的json
    @Test
    public void test01() throws IOException {
        //1.组拼天气的url
        urls += "?";
        urls += "city=beijing";
        urls += "&lang=zh_cn";
        urls += "&key=" + keys;
        //2.从网络获取数据
        URL url = new URL(urls);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET"); //请求方式 get
        connection.setConnectTimeout(5000); //连接超时时间5s
        connection.setReadTimeout(10000); //读取超时时间10s

        int res = connection.getResponseCode();
        String codes = null;
        if (res == 200) {
            InputStream in = connection.getInputStream();
            codes = StreamUtils.stream2String(in);
        }
        System.out.println(codes);
    }

    //解析json
    @Test
    public void test02() throws IOException {
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
