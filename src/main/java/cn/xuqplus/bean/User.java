package cn.xuqplus.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-07.
 */
public class User {
    private Long id;
    private String name;
    private String nick;
    private String pwd;

    public User(Map map) {
        this.id = (Long) map.get("id");
        this.name = (String) map.get("name");
        this.nick = (String) map.get("nick");
        this.pwd = (String) map.get("pwd");
    }

    public Map toMap() {
        Map result = new HashMap();
        result.put("id", id);
        result.put("name", name);
        result.put("nick", nick);
        result.put("pwd", pwd);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public String getNick() {
        return nick;
    }

    public String getPwd() {
        return pwd;
    }
}
