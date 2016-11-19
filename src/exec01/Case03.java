package exec01;

import domain.City;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import utils.Downloader;
import utils.JDBCUtils;

import java.io.*;
import java.sql.SQLException;
import java.util.List;

/**
 * 获取并且转化城市信息
 * Created by ye on 11/19/16.
 */
public class Case03 {
    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    //下载城市列表的json文件
    @Test
    public void test011() throws IOException {
        String urls = "http://files.heweather.com/china-city-list.json";
        Downloader.download(urls, "src/down/citys2.json");
    }

    //解析json文件病规格化打印
    @Test
    public void test012() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/down/citys.json")));
        String line;
        int num = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println(num + ">>>" + line);
            num++;
        }
    }

    //下载城市列表的txt文件
    @Test
    public void test021() throws IOException {
        String urls = "http://files.heweather.com/china-city-list.txt";
        Downloader.download(urls, "src/down/cities.txt");
    }

    //解析城市列表的txt文件
    @Test
    public void test022() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/down/cities.txt")));
        String line;
        int i = 1;
        while ((line = reader.readLine()) != null) {
            System.out.println(i + ">>>" + line);
            i++;
        }
        reader.close();
    }

    //解析城市列表的txt文件
    @Test
    public void test023() throws IOException, SQLException {

        queryRunner.update("drop table if exists china_cities");
        queryRunner.update("create table china_cities(\n" +
                "  cityId varchar(30) primary key,\n" +
                "  cityEn varchar(30),\n" +
                "  cityZh varchar(30),\n" +
                "  countryCode varchar(30),\n" +
                "  countryEn varchar(30),\n" +
                "  countryZh varchar(30),\n" +
                "  provinceEn varchar(30),\n" +
                "  provinceZh varchar(30),\n" +
                "  leaderEn varchar(30),\n" +
                "  leaderZh varchar(30),\n" +
                "  lat varchar(30),\n" +
                "  lon varchar(30)\n" +
                ")");
        String sql = "insert into china_cities values(?,?,?,?,?,?,?,?,?,?,?,?)";
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/down/cities.txt")));
        String line;
        int num = 1;
        while ((line = reader.readLine()) != null) {
            if (num < 4) {
                num++;
                continue;
            }
            String[] parts = line.split("\t");
            queryRunner.update(sql, parts);
        }
        reader.close();
    }

    //从数据库中读取城市列表信息
    @Test
    public void test024() throws SQLException {
        String sql = "select * from china_cities";
        List<City> list = queryRunner.query(sql, new BeanListHandler<City>(City.class));
        int i = 1;
        for (City city : list) {
            System.out.println(i + ">>>" + city.toString());
            i++;
        }
    }
}
