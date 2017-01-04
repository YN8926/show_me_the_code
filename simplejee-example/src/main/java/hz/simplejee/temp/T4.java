package hz.simplejee.temp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class T4 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse("2016-04-28 23:00:00");
		Date d2 = DateUtils.truncate(d, Calendar.DATE);
		System.out.println(sdf.format(d2));
	}
}
