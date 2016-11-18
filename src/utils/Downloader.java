package utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by ye on 11/18/16.
 */
public class Downloader {

    /**
     * 下载并且处理源码
     * @param urls
     * @throws IOException
     */
    public static void download(String urls) throws IOException {
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

}
