package com.generator.java.constants;

/**
 * Created by Administrator on 2017/6/23 0023.
 */
public enum AccessSpecifierEnum {

    PRIVATE("private"),PUBLIC("public"),PROTECTED("protected");

    private String name;

    private AccessSpecifierEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
