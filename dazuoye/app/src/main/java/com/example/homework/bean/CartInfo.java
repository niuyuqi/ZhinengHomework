package com.example.Homework.bean;

public class CartInfo {
    public long rowid;
    public int sn;
    public long goods_id;
    public int count;
    public String update_time;

    // adapter新增
    public com.example.Homework.bean.GoodsInfo2 goods;

    public CartInfo() {
        rowid = 0L;
        sn = 0;
        goods_id = 0L;
        count = 0;
        update_time = "";
        goods = new com.example.Homework.bean.GoodsInfo2();
    }
}
