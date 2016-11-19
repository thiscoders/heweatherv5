package domain;

/**
 * Created by ye on 11/19/16.
 */
public class City {


    /**
     * id : CN101110805
     * cityEn : yangxian
     * cityZh : 洋县
     * countryCode : CN
     * countryEn : China
     * countryZh : 中国
     * provinceEn : shan-xi
     * provinceZh : 陕西
     * leaderEn : hanzhong
     * leaderZh : 汉中
     * lat : 33.13
     * lon : 107.33
     */
    //id:城市id  cityEn:城市英文  cityZh:城市中文  countryCode:国家代码  countryEn:国家英文  countryZh:国家中文 
    // provinceEn:省英文  provinceEn:省中文  provinceEn:省中文  leaderEn:所属上级市英文  leaderZh:所属上级市中文  lat:纬度  lon:经度

    private String cityId;  //城市id
    private String cityEn; //城市英文
    private String cityZh; //城市中文
    private String countryCode;  //国家代码
    private String countryEn;  //国家英文
    private String countryZh; //国家中文
    private String provinceEn; //省英文
    private String provinceZh; //省中文
    private String leaderEn;  // 所属上级市英文
    private String leaderZh; //所属上级市中文
    private String lat; //纬度
    private String lon; //经度

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public String getCityZh() {
        return cityZh;
    }

    public void setCityZh(String cityZh) {
        this.cityZh = cityZh;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn;
    }

    public String getCountryZh() {
        return countryZh;
    }

    public void setCountryZh(String countryZh) {
        this.countryZh = countryZh;
    }

    public String getProvinceEn() {
        return provinceEn;
    }

    public void setProvinceEn(String provinceEn) {
        this.provinceEn = provinceEn;
    }

    public String getProvinceZh() {
        return provinceZh;
    }

    public void setProvinceZh(String provinceZh) {
        this.provinceZh = provinceZh;
    }

    public String getLeaderEn() {
        return leaderEn;
    }

    public void setLeaderEn(String leaderEn) {
        this.leaderEn = leaderEn;
    }

    public String getLeaderZh() {
        return leaderZh;
    }

    public void setLeaderZh(String leaderZh) {
        this.leaderZh = leaderZh;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", cityEn='" + cityEn + '\'' +
                ", cityZh='" + cityZh + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryEn='" + countryEn + '\'' +
                ", countryZh='" + countryZh + '\'' +
                ", provinceEn='" + provinceEn + '\'' +
                ", provinceZh='" + provinceZh + '\'' +
                ", leaderEn='" + leaderEn + '\'' +
                ", leaderZh='" + leaderZh + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}
