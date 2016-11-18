package domain;

/**
 * Created by ye on 11/18/16.
 */
public class Wstatus {
    //wno varchar(20),chin varchar(20),engl varchar(20),icon varchar(100)
    private String wno;
    private String chin;
    private String engl;
    private String icon;

    public String getWno() {
        return wno;
    }

    public void setWno(String wno) {
        this.wno = wno;
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
                "wno='" + wno + '\'' +
                ", chin='" + chin + '\'' +
                ", engl='" + engl + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
