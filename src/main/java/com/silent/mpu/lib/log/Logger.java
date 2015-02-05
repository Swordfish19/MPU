package lib.log;


import lib.utility.TimeHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class Logger {
    private static File logFile;
    private static PrintWriter log;
    private static boolean usable;

    static {
        init("log.txt");
    }

    private static void init(String logFilename){
        usable = true;
        logFile = new File(logFilename);
        try {
            if (!logFile.exists()) {
//                logFile.getParentFile().mkdirs();
                logFile.createNewFile();
            }

            log = new PrintWriter(logFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            usable = false;
        } catch (IOException e) {
            e.printStackTrace();
            usable = false;
        }
    }

    public static void setLogFileName(String name){
        init(name);
    }

    public static void log(Level level, String text){

        if(usable){
            log.println(TimeHelper.getTime().concat(text));
            log.flush();
        }
    }

    public static void log(Level level, String format, String text) {
        log(level, String.format(format,text));
    }

    public static void log(Level level, String format, Object... data) {
        log(level, String.format(format, data));
    }

    public static void severe(String format, Object... data)
    {
        log(Level.ERROR, format, data);
    }

    public static void severe(String text)
    {
        log(Level.ERROR, text);
    }

    public static void warning(String format, Object... data)
    {
        log(Level.WARN, format, data);
    }

    public static void warning(String text)
    {
        log(Level.WARN, text);
    }

    public static void info(String format, Object... data)
    {
        log(Level.INFO, format, data);
    }

    public static void info(String text)
    {
        log(Level.INFO, text);
    }

    public static void fine(String format, Object... data)
    {
        log(Level.DEBUG, format, data);
    }

    public static void fine(String text)
    {
        log(Level.DEBUG, text);
    }

    public static void finer(String format, Object... data)
    {
        log(Level.TRACE, format, data);
    }

    public static void finer(String text) {
        log(Level.TRACE, text);
    }

}
