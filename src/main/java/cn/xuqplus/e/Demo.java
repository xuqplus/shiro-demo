package cn.xuqplus.e;

import cn.xuqplus.domain.User;

/**
 * Created by Administrator on 2017-04-10.
 */
public enum Demo {
    CREATE("read", "--"),
    DELETE("delete", "--"),
    UPDATE("update", "--"),
    READ("read", "--"),
    DEMO(new User(0l, "0", "0"));

    String a, b;
    User user;

    public void demo() {
        System.out.println("a:" + a + ",b:" + b + ",user:" + user);
    }

    Demo(String a, String b) {
        this.a = a;
        this.b = b;
    }

    Demo(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
        for (Demo e : Demo.values()) {
            e.demo();
        }
    }
}
