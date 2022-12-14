package com.jingdong.app.mall.bundle.xanimation.bean;

import java.io.Serializable;

public class LottieDemo implements Serializable {
    private int type;
    private String name;

    public LottieDemo(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
