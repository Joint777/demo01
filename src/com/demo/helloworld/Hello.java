package com.demo.helloworld;

/**
 * @author zht
 * @create 2022-07-13 17:35
 */
public class Hello {

    String name = "zht";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hello(String name) {
        this.name = name;
    }
}