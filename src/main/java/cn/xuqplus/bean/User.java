package cn.xuqplus.bean;

/**
 * Created by Administrator on 2017-04-07.
 */
public class User {
    private Long id;
    private String name;
    private String pwd;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}
