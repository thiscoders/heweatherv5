package exec02;

import org.junit.Before;
import org.junit.Test;
import utils.Downloader;
import utils.InitData;

import java.io.IOException;

/**
 * Created by ye on 11/19/16.
 */
public class Case01 {
    private String urls;
    private String keys;

    //获取urlv5的地址和key
    @Before
    public void before() throws IOException {
        urls = InitData.getUrlsV5();
        keys = InitData.getKeys();
    }

    //1.下载7-10天预报  /forecast    city key lang
    @Test
    public void test01() throws IOException {
        urls += "forecast?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        urls += "&lang=zh_cn";
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/forecast_huxian.json");
    }


    //2.下载实况天气 /now     city key lang
    @Test
    public void test03() throws IOException {
        urls += "now?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        urls += "&lang=zh_cn";
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/new_huxian.json");
    }

    //3.下载每小时预报 /hourly     city key lang
    @Test
    public void test04() throws IOException {
        urls += "hourly?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        urls += "&lang=zh_cn";
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/hourly_huxian.json");
    }

    //4.下载生活指数 /suggestion      city key
    @Test
    public void test05() throws IOException {
        urls += "suggestion?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/suggestion_huxian.json");
    }

    //5.下载灾害预警 /alarm      city key
    @Test
    public void test06() throws IOException {
        urls += "alarm?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/alarm_huxian.json");
    }

    //6.下载天气预报集合接口 /weather     city key lang
    @Test
    public void test07() throws IOException {
        urls += "weather?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        urls += "&lang=zh_cn";
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/weather_huxian.json");
    }

    //7.下载景点天气 /scenic      city key lang
    @Test
    public void test08() throws IOException {
        urls += "scenic?";
        urls += "city=CN101110106"; //仅支持id
        urls += "&key=" + keys;
        urls += "&lang=zh_cn";
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/scenic_huxian.json");
    }

    //8.下载历史天气 /historical        city date   key   lang
    @Test
    public void test09() throws IOException {
        urls += "historical?";
        urls += "city=CN101010100";
        urls += "&date=2016-10-28";
        urls += "&key=" + keys;
        urls += "&lang=zh_cn";
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/historical_huxian.json");
    }

    //9.下载城市查询 /search      city key
    @Test
    public void test10() throws IOException {
        urls += "search?";
        urls += "city=huxian";
        urls += "&key=" + keys;
        System.out.println(urls);
        Downloader.printf(urls);
        Downloader.download(urls, "src/down/v5/search_huxian.json");
    }
}
