package lib.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeHelper {
    public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DEFAULT_LOG_TIME = DEFAULT_DATE_FORMAT.concat(" ").concat(DEFAULT_TIME_FORMAT);


    public static String getTime(){
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
        return sdf.format(new Date());
    }

    public static String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return sdf.format(new Date());
    }

    public static String getLogTime(){
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_LOG_TIME);
        return sdf.format(new Date());
    }

    public static String getTimeFormatted(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }
}
