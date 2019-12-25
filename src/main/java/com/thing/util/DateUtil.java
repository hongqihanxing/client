package com.thing.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

  private static final String DAY_FORMAT_STR = "yyyy-MM-dd";
  private static final String DAY_TIME_FORMAT_STR = "yyyy-MM-dd HH:mm:ss";

  private static DateFormat getFormat(String dayForamt) {
    return new SimpleDateFormat(dayForamt);
  }

  /** 按天格式化日期 */
  public static String getDayFormat(Date dateTime) {
    if (dateTime == null) {
      return "";
    }
    return getFormat(DAY_FORMAT_STR).format(dateTime);
  }

  /** 按秒格式化日期 */
  public static String getDayTimeFormat(Date addtime) {
    if (addtime == null) {
      return "";
    }
    return getFormat(DAY_TIME_FORMAT_STR).format(addtime);
  }

  public static Date parseDateTime(String string) {
    try {
      return getFormat(DAY_TIME_FORMAT_STR).parse(string);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static Date parseDateDay(String day) {
    try {
      return getFormat(DAY_FORMAT_STR).parse(day);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static Date getThisWeekMonday(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
    if (1 == dayWeek) {
      cal.add(Calendar.DAY_OF_MONTH, -1);
    }
    // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
    cal.setFirstDayOfWeek(Calendar.MONDAY);
    // 获得当前日期是一个星期的第几天
    int day = cal.get(Calendar.DAY_OF_WEEK);
    // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
    cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
    return cal.getTime();
  }

  public static Date getToday(){
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(Calendar.HOUR_OF_DAY,0);
    calendar.set(Calendar.MINUTE,0);
    calendar.set(Calendar.SECOND,0);
    calendar.set(Calendar.MILLISECOND,0);
    return calendar.getTime();
  }

  public static Date getBeforeMinute(){
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.MINUTE,-2);
    return calendar.getTime();
  }
}
