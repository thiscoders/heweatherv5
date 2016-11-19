## 使用java对he weather的api进行操作，为android的天气软件I'm 天气做预热
### 和风天气的个人认证key请登录http://www.heweather.com/ 网站进行申请

## 一.各个包的相关介绍
| 包名|介绍|类型|
|----|----|----|
|domain|存放一些必须的javabean|文件夹|
|exex01|主要的执行文件|文件夹|
|utils|一些必须的工具类|文件夹|
|down|下载的内容的保存的地方|文件夹|
|c3p0-config.xml|c3p0数据库连接池的配置文件|xml文件|

### 二.数据表的创建代码
1.创建天气状态的sql语句
``` sql
    create table wstatus(
        wsid varchar(20)  primary key, --代码
        chin varchar(20),  --中文
        engl varchar(20),  --英文
        icon varchar(100)  --图标地址
    );
```

2.创建城市列表的sql语句
``` sql
    create table china_cities(
        cityId varchar(30) primary key,   --城市/地区编码
        cityEn varchar(30),  --英文
        cityZh varchar(30),  --中文
        countryCode varchar(30),  --国家代码
        countryEn varchar(30),  --国家英文
        countryZh varchar(30),  --国家中文
        provinceEn varchar(30),  --省英文
        provinceZh varchar(30),  --省中文
        leaderEn varchar(30),  --所属上级市英文
        leaderZh varchar(30),  --所属上级市中文
        lat varchar(30),  --纬度
        lon varchar(30)  --经度
    );
```