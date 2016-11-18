package exec01;

import domain.Wstatus;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import utils.Downloader;
import utils.JDBCUtils;

import java.io.*;
import java.sql.SQLException;
import java.util.List;

/**
 * 获取一般来说长期保存的消息
 * Created by ye on 11/18/16.
 */
public class Case02 {
    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    @Test
    public void test00() {
        System.out.println("\\s");
    }

    //获取天气状况代码和图标对照表
    @Test
    public void test01() throws IOException {
        String urls = "http://files.heweather.com/condition-code.txt";
        Downloader.download(urls);
    }

    //解析天气状态并且保存到sqlite3数据库,以制表符分割
    @Test
    public void test011() throws IOException, SQLException {
        //1.准备数据库
        queryRunner.update("drop table if exists wstatus");
        queryRunner.update("create table wstatus(wno varchar(20),chin varchar(20),engl varchar(20),icon varchar(100))");
        //1.1.准备sql语句
        String sql = "insert into wstatus values(?,?,?,?)";
        //2.解析数据
        File file = new File("src/down/wstatus.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int num = 1;
        while ((line = reader.readLine()) != null) {
            if (num < 3) {
                num++;
                continue;
            }
            String[] parts = line.split("\t");
            queryRunner.update(sql, parts);
        }
    }

    //读取数据库的数据
    @Test
    public void test012() throws SQLException {
        String sql = "select * from wstatus";
        List<Wstatus> list = queryRunner.query(sql, new BeanListHandler<Wstatus>(Wstatus.class));
        System.out.println(list.size());
        for (Wstatus wstatus : list) {
            System.out.println(wstatus.toString());
        }
    }


    //解析天气状态并且保存到sqlite3数据库
    @Test
    public void test013() throws IOException {
        File file = new File("src/down/wstatus.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\t");
            for (int i = 0; i < parts.length; i++) {
                System.out.println(i + 1 + ">" + parts[i]);
            }
            System.out.println("---------------------");
            count++;
        }
        System.out.println(count);
    }


    //获取城市列表
    @Test
    public void test02() throws IOException {
        String urls = "http://files.heweather.com/china-city-list.json";
        Downloader.download(urls);
    }
}
