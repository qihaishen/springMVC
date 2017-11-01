package com.springapp.mvc;

import com.springapp.mvc.util.RegexUtil;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Joker on 2017/10/25.
 */
public class TestDec {

    public static void main(String[] args){
        DecimalFormat df1   = new DecimalFormat("#######.##");
        DecimalFormat    df2  = new DecimalFormat("###.00");
        DecimalFormat    df3   = new DecimalFormat("#.##");

        double d1 = 3.23456;
        double d2 = 80000000000000.0;
        double d3 = 2.0;

        System.out.println(df1.format(d1));
        System.out.println(df2.format(d1));
        System.out.println(df1.format(d2));
        System.out.println(df1.format(d2));
        System.out.println(df2.format(d2));
        System.out.println(df3.format(d2));

        String id = "12384X";
        System.out.println("*****" + RegexUtil.checkIdentyCodeTail(id));
        System.out.println("*****12x93:"+RegexUtil.checkIdentyCodeTail("12193"));
        System.out.println("*****12334567:"+RegexUtil.checkIdentyCodeTail("123121212"));
        System.out.println("*****"+RegexUtil.checkIdentyCodeTail("0x"));
        System.out.println("*****19220191:"+RegexUtil.checkBirthday("1922011"));
        System.out.println("*****192201917:"+RegexUtil.checkBirthday("192201917"));

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        String dStr = sdf.format(d);

        System.out.println("*****date::"+ dStr );
        System.out.println("*****dateRegexUtil:"+ RegexUtil.checkBirthday(dStr));
        System.out.println("*****dateRegexUtil1:"+ RegexUtil.checkBirthday("2017127"));
        System.out.println("*****dateRegexUtil3:"+ RegexUtil.checkBirthday("20171024"));
        System.out.println("*****dateRegexUtil:"+ RegexUtil.checkBirthday(dStr));


    }
}
