package Yahav_Yehoshua_Bariah;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	private static final String format = "yyyy_MM_dd_hh_mm";

	public static String dateFormat() {
		// Output: The function returns the current specific date.
		SimpleDateFormat dateF = new SimpleDateFormat(format);
		Date date = new Date();
		return dateF.format(date);
	}
}
