package com.yang;

/**
 * @author: create by Bingda
 * @version: v1.0
 * @description: com.yang
 * @date:2020/3/20
 **/
public class Yang {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void log() {
        System.out.println("日志打印");
    }
}
