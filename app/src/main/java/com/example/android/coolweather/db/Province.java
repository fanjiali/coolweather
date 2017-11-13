package com.example.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/9.
 */

//LitePal中每一个实体类都是必须要继承自DataSupport类的
public class Province extends DataSupport{

    //每个实体类中都应该有的字段
    private int id;

    //记录省的名字
    private String provinceName;

    //记录省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
