package org.chadliu23;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CountDay {
	public static void main(String[] args) {
		System.out.println(countDownDay(new GregorianCalendar(2017 , 1, 26), 100));
		// System.out.println(UpwardCountDay(new GregorianCalendar(2016 , 2, 26).getTime(), (183 -49)));
		// System.out.println(dayDiff (new GregorianCalendar(2016 , 0, 17), new GregorianCalendar(2016 , 2, 6)) );
	}

	public static Date countDownDay(Calendar target, int numDay) {

		System.out.println(target.getTime());
		Date ahead = target.getTime();
		long diff = Math.abs(ahead.getTime() - target.getTime().getTime() );
		while( diff / (60 * 1000 * 60  *24) < numDay){
			ahead.setTime(ahead.getTime() - 60 * 1000  * 60 *24);
			diff = Math.abs(ahead.getTime() - target.getTime().getTime() );
		}
		return ahead;
	}
	public static Date UpwardCountDay(Date todayDate, int numDay){

		Date ahead =  new Date();
		long diff = Math.abs(ahead.getTime() - todayDate.getTime() );
		while( diff / (60 * 1000 * 60  *24) <numDay ){
			ahead.setTime(ahead.getTime() + 60 * 1000  * 60 *24);
			diff = Math.abs(ahead.getTime() - todayDate.getTime() );
		}
		return ahead;
	}

	public static long dayDiff(Calendar target, Calendar from){
		return  Math.abs(target.getTime().getTime() - from.getTime().getTime() )/ (60 * 1000 * 60  *24);
	}
}
