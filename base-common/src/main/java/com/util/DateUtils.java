package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private static final long ONE_MINUTE = 60;
	private static final long ONE_HOUR = 3600;
	private static final long ONE_DAY = 86400;
	private static final long ONE_MONTH = 2592000;
	private static final long ONE_YEAR = 31104000;

	public static Calendar calendar = Calendar.getInstance();

	/**
	 * 
	 * @return yyyy-mm-dd
	 *  2012-12-25
	 */
	public static String getDate() {
		return getYear() + "-" + getMonth() + "-" + getDay();
	}

	/**
	 * @param format
	 * @return 
	 * yyyy年MM月dd HH:mm 
	 * MM-dd HH:mm 2012-12-25
	 * 
	 */
	public static String getDate(String format) {
		SimpleDateFormat simple = new SimpleDateFormat(format);
		return simple.format(calendar.getTime());
	}

	/**
	 * 
	 * @return yyyy-MM-dd HH:mm 
	 * 2012-12-29 23:47
	 */
	public static String getDateAndMinute() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return simple.format(calendar.getTime());
	}

	/**
	 * 
	 * @return
	 *  yyyy-MM-dd HH:mm:ss 
	 *  2012-12-29 23:47:36
	 */
	public static String getFullDate() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simple.format(calendar.getTime());
	}

	/**
	 * 距离今天多久
	 * @param date
	 * @return 
	 * 
	 */
	public static String fromToday(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		long time = date.getTime() / 1000;
		long now = new Date().getTime() / 1000;
		long ago = now - time;
		if (ago <= ONE_HOUR)
			return ago / ONE_MINUTE + "分钟前";
		else if (ago <= ONE_DAY)
			return ago / ONE_HOUR + "小时" + (ago % ONE_HOUR / ONE_MINUTE)
					+ "分钟前";
		else if (ago <= ONE_DAY * 2)
			return "昨天" + calendar.get(Calendar.HOUR_OF_DAY) + "点"
					+ calendar.get(Calendar.MINUTE) + "分";
		else if (ago <= ONE_DAY * 3)
			return "前天" + calendar.get(Calendar.HOUR_OF_DAY) + "点"
					+ calendar.get(Calendar.MINUTE) + "分";
		else if (ago <= ONE_MONTH) {
			long day = ago / ONE_DAY;
			return day + "天前" + calendar.get(Calendar.HOUR_OF_DAY) + "点"
					+ calendar.get(Calendar.MINUTE) + "分";
		} else if (ago <= ONE_YEAR) {
			long month = ago / ONE_MONTH;
			long day = ago % ONE_MONTH / ONE_DAY;
			return month + "个月" + day + "天前"
					+ calendar.get(Calendar.HOUR_OF_DAY) + "点"
					+ calendar.get(Calendar.MINUTE) + "分";
		} else {
			long year = ago / ONE_YEAR;
			int month = calendar.get(Calendar.MONTH) + 1;// JANUARY which is 0 so month+1
			return year + "年前" + month + "月" + calendar.get(Calendar.DATE)
					+ "日";
		}

	}

	/**
	 * 距离截止日期还有多长时间
	 * 
	 * @param date
	 * @return
	 */
	public static String fromDeadline(Date date) {
		long deadline = date.getTime() / 1000;
		long now = (new Date().getTime()) / 1000;
		long remain = deadline - now;
		if (remain <= ONE_HOUR)
			return "只剩下" + remain / ONE_MINUTE + "分钟";
		else if (remain <= ONE_DAY)
			return "只剩下" + remain / ONE_HOUR + "小时"
					+ (remain % ONE_HOUR / ONE_MINUTE) + "分钟";
		else {
			long day = remain / ONE_DAY;
			long hour = remain % ONE_DAY / ONE_HOUR;
			long minute = remain % ONE_DAY % ONE_HOUR / ONE_MINUTE;
			return "只剩下" + day + "天" + hour + "小时" + minute + "分钟";
		}

	}

	/**
	 * 距离今天的绝对时间
	 * 
	 * @param date
	 * @return
	 */
	public static String toToday(Date date) {
		long time = date.getTime() / 1000;
		long now = (new Date().getTime()) / 1000;
		long ago = now - time;
		if (ago <= ONE_HOUR)
			return ago / ONE_MINUTE + "分钟";
		else if (ago <= ONE_DAY)
			return ago / ONE_HOUR + "小时" + (ago % ONE_HOUR / ONE_MINUTE) + "分钟";
		else if (ago <= ONE_DAY * 2)
			return "昨天" + (ago - ONE_DAY) / ONE_HOUR + "点" + (ago - ONE_DAY)
					% ONE_HOUR / ONE_MINUTE + "分";
		else if (ago <= ONE_DAY * 3) {
			long hour = ago - ONE_DAY * 2;
			return "前天" + hour / ONE_HOUR + "点" + hour % ONE_HOUR / ONE_MINUTE
					+ "分";
		} else if (ago <= ONE_MONTH) {
			long day = ago / ONE_DAY;
			long hour = ago % ONE_DAY / ONE_HOUR;
			long minute = ago % ONE_DAY % ONE_HOUR / ONE_MINUTE;
			return day + "天前" + hour + "点" + minute + "分";
		} else if (ago <= ONE_YEAR) {
			long month = ago / ONE_MONTH;
			long day = ago % ONE_MONTH / ONE_DAY;
			long hour = ago % ONE_MONTH % ONE_DAY / ONE_HOUR;
			long minute = ago % ONE_MONTH % ONE_DAY % ONE_HOUR / ONE_MINUTE;
			return month + "个月" + day + "天" + hour + "点" + minute + "分前";
		} else {
			long year = ago / ONE_YEAR;
			long month = ago % ONE_YEAR / ONE_MONTH;
			long day = ago % ONE_YEAR % ONE_MONTH / ONE_DAY;
			return year + "年前" + month + "月" + day + "天";
		}

	}

	public static String getYear() {
		return calendar.get(Calendar.YEAR) + "";
	}

	public static String getMonth() {
		int month = calendar.get(Calendar.MONTH) + 1;
		return month + "";
	}

	public static String getDay() {
		return calendar.get(Calendar.DATE) + "";
	}

	public static String get24Hour() {
		return calendar.get(Calendar.HOUR_OF_DAY) + "";
	}

	public static String getMinute() {
		return calendar.get(Calendar.MINUTE) + "";
	}

	public static String getSecond() {
		return calendar.get(Calendar.SECOND) + "";
	}

	public static void main(String[] args) throws ParseException {
		String dateStart0 = "2018-11-21 21:36:31,140";
		String dateEnd0   = "2018-11-21 21:36:33,962";
		double seconds0 = getSeconds(dateStart0,dateEnd0);
		int num0 = 1000;
		double n0 = num0/seconds0;
		System.out.println("处理1000个告警耗总耗时："+seconds0+"，每秒处理告警数量："+n0);
		
		String dateStart = "2018-11-21 21:12:59,398";
		String dateEnd 	 = "2018-11-21 21:13:03,945";
		double seconds = getSeconds(dateStart,dateEnd);
		int num = 2000;
		double n = num/seconds;
		System.out.println("处理2000个告警耗总耗时："+seconds+"，每秒处理告警数量："+n);
		String dateStart1 = "2018-11-22 00:46:09,762";
		String dateEnd1   = "2018-11-22 00:46:17,601";
		double seconds1 = getSeconds(dateStart1, dateEnd1);
		int num1 = 5000;
		double n1 = num1/seconds1;
		System.out.println("处理5000个告警耗总耗时："+seconds1+"，每秒处理告警数量："+n1);
		String dateStart2 = "2018-11-22 03:21:58,043";
		String dateEnd2   = "2018-11-22 03:22:11,036";
		double seconds2 = getSeconds(dateStart2, dateEnd2);
		int num2 = 10000;
		double n2 = num2/seconds2;
		System.out.println("处理10000个告警耗总耗时："+seconds2+"，每秒处理告警数量："+n2);
		String dateStart3 = "2018-11-22 04:30:44,135";
		String dateEnd3   = "2018-11-22 04:32:25,096";
		double seconds3 = getSeconds(dateStart3, dateEnd3);
		int num3 = 100000;
		double n3 = num3/seconds3;
		System.out.println("处理100000个告警耗总耗时："+seconds3+"，每秒处理告警数量："+n3);
		double d = n1+n2+n3;
		System.out.println("统计五次的平均处理效率是："+d/3);
		
	}
	public static double getSeconds(String dateStr,String dateEndStr) throws ParseException{
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
		Date dateStart = simple.parse(dateStr);
		Date dateEnd = simple.parse(dateEndStr);
		double seconds = (dateEnd.getTime()-dateStart.getTime())*0.001;
		return seconds;
	}

}
