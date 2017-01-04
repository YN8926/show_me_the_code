package hz.simplejee.temp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T3 {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = sdf.parse("2016-04-01 23:59:59");
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day -1);
		
		System.out.println(sdf.format(c.getTime()));
	}
}
