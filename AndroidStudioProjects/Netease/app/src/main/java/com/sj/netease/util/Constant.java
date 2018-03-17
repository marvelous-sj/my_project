package com.sj.netease.util;

import com.sj.netease.news.activity.DetailActivity;

/**
 * Created by sj on 2017/8/22.
 */

public class Constant {
    public static final String SPLASH_URL="http://g1.163.com/madr?app=7A16FBB6&platform=android&category=STARTUP&location=1&timestamp=1462779408364&uid=OaBKRDb%2B9FBz%2FXnwAuMBWF38KIbARZdnRLDJ6Kkt9ZMAI3VEJ0RIR9SBSPvaUWjrFtfw1N%2BgxquT0B2pjMN5zsxz13RwOIZQqXxgjCY8cfS8XlZuu2bJj%2FoHqOuDmccGyNEtV%2FX%2FnBofofdcXyudJDmBnAUeMBtnIzHPha2wl%2FQnUPI4%2FNuAdXkYqX028puyLDhnigFtrX1oiC2F7UUuWhDLo0%2BE0gUyeyslVNqLqJCLQ0VeayQa%2BgbsGetk8JHQ";
    public static final String HOT_URL="http://c.m.163.com/nc/article/headline/T1348647909107/%S-%E.html?from=toutiao&size=20&passport=&devId=bMo6EQztO2ZGFBurrbgcMQ%3D%3D&lat=YO6p1koFB04ckeiATuYaGw%3D%3D&lon=SQIt%2FB7%2BSqySYsiVHI%2FDiQ%3D%3D&version=7.0&net=wifi&ts=1463198253&sign=VHsiElahM1HTWFL0pnd52EoxE3w9piu1mp9jiCwGatd48ErR02zJ6%2FKXOnxX046I&encryption=1&canal=goapk_news";
    public static final String CACHE="msj";
    public static final String DETAIL_URL="http://c.m.163.com/nc/article/%D/full.html";
    public static final String FeedBackUrl="http://comment.api.163.com/api/json/post/list/new/hot/news3_bbs/%D/0/10/10/2/2";
    public static String GetUrl(int start,int end){
        String result;
        result=HOT_URL.replace("%S",String.valueOf(start));
        result=result.replace("%E",String.valueOf(end));
        return result;
    }
    public static String GetDetailUrl(String docid){
        String result;
        result= DETAIL_URL.replace("%D",docid);
        return result;
    }
    public static String GetFeedBackUrl(String docid){
        String result;
        result= FeedBackUrl.replace("%D",docid);
        return result;
    }
}
