package domain;

/**
 * Created by ye on 11/18/16.
 */
public class Wstatus {
    //wno varchar(20),chin varchar(20),engl varchar(20),icon varchar(100)
    private String wsid;
    private String chin;
    private String engl;
    private String icon;

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wno) {
        this.wsid = wsid;
    }

    public String getChin() {
        return chin;
    }

    public void setChin(String chin) {
        this.chin = chin;
    }

    public String getEngl() {
        return engl;
    }

    public void setEngl(String engl) {
        this.engl = engl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Wstatus{" +
                "wsid='" + wsid + '\'' +
                ", chin='" + chin + '\'' +
                ", engl='" + engl + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
