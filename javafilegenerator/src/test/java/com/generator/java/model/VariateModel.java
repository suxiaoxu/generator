package com.generator.java.model;

import com.generator.java.constants.AccessSpecifierEnum;
import com.generator.java.constants.DataTypeEnum;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/23 0023.
 */
public class VariateModel implements Serializable{


    private static final long serialVersionUID = -6049929324299968875L;

    //变量的作用范围
    private AccessSpecifierEnum accessSpecifierEnum;

    //是否静态
    private boolean isStaticType = false;

    //变量类型
    private DataTypeEnum dataTypeEnum;

    //变量名称
    private String variateName;


    public AccessSpecifierEnum getAccessSpecifierEnum() {
        return accessSpecifierEnum;
    }

    public void setAccessSpecifierEnum(AccessSpecifierEnum accessSpecifierEnum) {
        this.accessSpecifierEnum = accessSpecifierEnum;
    }

    public boolean isStaticType() {
        return isStaticType;
    }

    public void setStaticType(boolean staticType) {
        isStaticType = staticType;
    }

    public DataTypeEnum getDataTypeEnum() {
        return dataTypeEnum;
    }

    public void setDataTypeEnum(DataTypeEnum dataTypeEnum) {
        this.dataTypeEnum = dataTypeEnum;
    }

    public String getVariateName() {
        return variateName;
    }

    public void setVariateName(String variateName) {
        this.variateName = variateName;
    }
}
