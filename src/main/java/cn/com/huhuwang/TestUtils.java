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

    public static String getTime() {
        return parse(new Date(), YMDHMS);
    }

    public static String getDate() {
        return parse(new Date(), YMD);
    }

    private static String parse(Date d, String pattern) {
        return new SimpleDateFormat(pattern).format(d);
    }

    public static void main(String[] args) {
        {
            String s3 = new String("0") + new String("0");
            s3.intern();
            String s4 = "00";
            System.out.println(s3 == s4);

        }
        {
            String s = new String("1") + new String("1") + new String("1");
            s.intern();
            String news = s.toString();
            String s2 = "111";
            System.out.println(news == s2);
        }
        {
            String s = new StringBuilder().append("2").append("22").toString();
            s.intern();
            String s2 = "222";
            System.out.println(s == s2);
        }
        {
            String s = new StringBuilder().append("222").toString();
            s.intern();
            String s2 = "222";
            System.out.println(s == s2);
        }
        {
            String s = "3" + "3" + "3";
            String s2 = "333";
            System.out.println(s == s2);
        }


    }
}
