package com.real.time.entity;

import java.util.Date;

public class Order {
    private Integer user_id;
    private Integer cat_id;
    private Integer buy_mount;
    private Date buy_time;

    public Order(Integer user_id, Integer cat_id, Integer buy_mount) {
        this.user_id = user_id;
        this.cat_id = cat_id;
        this.buy_mount = buy_mount;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public Integer getBuy_mount() {
        return buy_mount;
    }

    public Date getBuy_time() {
        return buy_time;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public void setBuy_mount(Integer buy_mount) {
        this.buy_mount = buy_mount;
    }

    public void setBuy_time(Date buy_time) {
        this.buy_time = buy_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user_id=" + user_id +
                ", cat_id=" + cat_id +
                ", buy_mount=" + buy_mount +
                ", buy_time=" + buy_time +
                '}';
    }
}
