package com.example.Homework.bean;

import com.example.Homework.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "休闲鞋", "篮球鞋", "AJ", "运动鞋", "高帮", "板鞋", "老爹鞋" ,"球鞋"
};
// 声明一个手机商品的描述数组
private static String[] mDescArray = {
        "Nike Vandalised 女子3M镭射反光解构断勾休闲板鞋 CU3003-919",
        "久玖运动 NIKE  CT8453-300 BARRAGE 中帮 红绿 综训 联名",
        "Air Jordan 13 Aurora Green GS AJ13白绿女子篮球鞋 439358-100",
        "乔丹女鞋高帮篮球鞋女战靴2020秋冬季新款皮面篮球运动鞋球鞋鞋子",
        "Nike Air Force 1 AF1浅粉樱花粉薰衣草米白机能板鞋 CQ4810-621",
        "Tom体育 Nike Adapt BB 2.0 Oreo自动绑带 黑白奥利奥 CV2442-101",
        "Nike Air Max 270 React  大气垫糖果炫彩男女跑步鞋 DB5927-161",
        "STY custom换材料 air jordan 1 白北卡 璀璨爆闪 亮片水晶鞋"
        };
    private static float[] mPriceArray = {300, 160, 180, 100, 209,300,1000,1960};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f666_200,
            R.drawable.g777_200,R.drawable.h888_200
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a8, R.drawable.b8, R.drawable.c8,
            R.drawable.d8, R.drawable.e8, R.drawable.f666_800,
            R.drawable.g777_800,R.drawable.h888_800
    };


    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}