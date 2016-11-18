package exec01;

import org.junit.Test;
import utils.Downloader;
import utils.InitData;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 获取一般来说长期保存的消息
 * Created by ye on 11/18/16.
 */
public class Case02 {

    //获取天气状况代码和图标对照表
    @Test
    public void test01() throws IOException {
        String urls = "http://files.heweather.com/condition-code.txt";
        Downloader.download(urls);
    }

    @Test
    public void test02() throws IOException {
        String urls = "http://files.heweather.com/china-city-list.json";
        Downloader.download(urls);
    }
}
