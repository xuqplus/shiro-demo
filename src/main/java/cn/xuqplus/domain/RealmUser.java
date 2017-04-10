package cn.xuqplus.domain;

import java.util.List;

/**
 * Created by Administrator on 2017-04-08.
 */
public class RealmUser {
    private Long id;
    private String name;
    private String pwd;
    private List role;
    private List permission;

    public void setRole(List role) {
        this.role = role;
    }

    public void setPermission(List permission) {
        this.permission = permission;
    }

    public List getRole() {
        return role;
    }

    public List getPermission() {
        return permission;
    }

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
