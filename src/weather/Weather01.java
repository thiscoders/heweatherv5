package weather;

import utils.StreamUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by ye on 11/18/16.
 */
public class Weather01 {
    private String urls;
    private String keys;

    public Weather01(String urls, String keys) {
        this.urls = urls;
        this.keys = keys;
    }

    public void exex(String city, String lang) throws IOException {
        //1.组拼天气的url
        urls += "?";
        urls += "city=" + city;
        urls += "&lang=" + lang;
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
            InputStream inputStream = connection.getInputStream();
            codes = StreamUtils.stream2String(inputStream);
        }
        System.out.println(codes);
    }
}
