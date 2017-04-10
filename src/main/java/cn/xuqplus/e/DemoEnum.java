package cn.xuqplus.e;

import cn.xuqplus.domain.User;

/**
 * Created by Administrator on 2017-04-10.
 */
public enum DemoEnum {
    DELETE("delete"), GET("read"), HEAD("read"), MKCOL("create"), OPTIONS("read"), POST("create"), PUT("update"), TRACE("read") {
        @Override
        public User diy() {
            return new User(0l, "0", "0");
        }
    };

    public String authority;
    public String authority1;

    /**
     * 类似于把构造器单独提出来
     */
    DemoEnum(String httpMethod) {
        authority = httpMethod;
        authority1 = httpMethod;
    }

    public User diy() {
        return new User((long) this.ordinal(), this.name(), this.authority);
    }

    /********************************************************************/

    public static void main(String[] args) {
        //a();//输出
        //b();//遍历输出
        //c();//自定义方法
        d();//
    }

    public static void a() {
        System.out.println(DemoEnum.GET.ordinal());//序号,0是第一个
        System.out.println(DemoEnum.GET);
        System.out.println(DemoEnum.GET.authority);
    }

    public static void b() {
        for (DemoEnum e : DemoEnum.values()) {
            System.out.println(e + "--->" + e.authority);
        }
    }

    public static void c() {
        for (DemoEnum e : DemoEnum.values()) {
            System.out.println(e.diy().toString());
        }
    }

    public static void d() {
        System.out.println(DemoEnum.GET.authority);
        System.out.println(DemoEnum.GET.authority1);
    }
}
