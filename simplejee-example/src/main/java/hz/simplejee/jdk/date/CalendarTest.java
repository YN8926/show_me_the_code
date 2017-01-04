package hz.simplejee.jdk.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class CalendarTest {

	@Test
	public void testCalendar() {
		Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(c.getTime()));
	}
	
	@Test
	public void nextBirthday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date1 = sdf.parse("2015-04-11");
			Date now = new Date();
			
			if(date1.before(now)){
				Calendar c = Calendar.getInstance();
				c.setTime(date1);
				c.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
				
				if(c.getTime().after(now)) {
				} else {
					c.add(Calendar.YEAR, 1);
				}
				System.out.println(sdf.format(c.getTime()));
				
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
