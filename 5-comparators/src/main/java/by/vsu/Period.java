package by.vsu;

import java.util.Calendar;
import java.util.Date;

public class Period {
	public static String get(Date date) {
		Calendar begin = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		begin.setTime(date);
		end.setTime(date);

		time(begin,  0,  0,  0,   0);
		time(end  ,  5, 59, 59, 999);
		if(begin.getTime().before(date) && end.getTime().after(date)) {
			return "ночь";
		}

		time(begin,  6,  0,  0,   0);
		time(end  , 11, 59, 59, 999);
		if(begin.getTime().before(date) && end.getTime().after(date)) {
			return "утро";
		}

		time(begin, 12,  0,  0,   0);
		time(end  , 17, 59, 59, 999);
		if(begin.getTime().before(date) && end.getTime().after(date)) {
			return "день";
		}

		time(begin, 18,  0,  0,   0);
		time(end  , 23, 59, 59, 999);
		if(begin.getTime().before(date) && end.getTime().after(date)) {
			return "вечер";
		}

		return "";
	}

	public static double length(Date start, Date finish) {
		return (finish.getTime() - start.getTime()) / 60_000.0;
	}

	private static void time(Calendar calendar, int hour, int minute, int second, int millisecond) {
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
	}
}
