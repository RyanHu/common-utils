package cn.com.huhuwang;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : Ryan Hu
 * @Date : 2020/4/21
 */
public class TestUtils {

    private final static String YMDHMS = "yyyy-MM-dd HH:mm:ss";
    private final static String YMD = "yyyy-MM-dd";
    public static String getTime(){
        return parse(new Date(),YMDHMS);
    }
    public static String getDate(){
        return parse(new Date(),YMD);
    }
    private static String parse(Date d,String pattern ){
        return new SimpleDateFormat(pattern).format(d);
    }
}
