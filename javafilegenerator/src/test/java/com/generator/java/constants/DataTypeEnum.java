package com.generator.java.constants;

/**
 * Created by Administrator on 2017/6/23 0023.
 */
public enum DataTypeEnum {

    INT("int"),Long("long"),DOUBLIE("double"),STRING("String"),DATE("Date");

    private String name;
    DataTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
