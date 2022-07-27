package com.tianzhuo.vxapplets.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/18 18:07
 */
public class DateUtil {

    /**
     * string转date
     * @param strDate
     * @return
     */
    public static Date strToDate(String strDate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

}
