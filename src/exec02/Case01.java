package exec02;

import org.junit.Test;
import utils.InitData;

import java.io.IOException;

/**
 * Created by ye on 11/19/16.
 */
public class Case01 {
    private String urls;
    private String keys;

    //获取urlv5的地址和key
    @Test
    public void before() throws IOException {
        urls = InitData.getUrlsV5();
        keys = InitData.getKeys();
    }

    //1.下载7-10天预报
    @Test
    public void test01() {

    }


    //2.下载实况天气
    //3.下载每小时预报
    //4.下载生活指数
    //5.下载灾害预警
    //6.下载天气预报集合接口
    //7.下载景点天气
    //8.下载历史天气
    //9.下载城市查询


}
