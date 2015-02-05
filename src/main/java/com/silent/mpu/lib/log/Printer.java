package lib.log;

import lib.utility.TimeHelper;

import java.io.PrintStream;

@SuppressWarnings("unused")
public class Printer {
    private static boolean debug;
    private static boolean printTime;

    private static PrintStream out;
    private static PrintStream err;

    static {
        reinit();
    }

    public static void reinit() {
        debug = false;
        out = System.out;
        err = System.err;
    }

    public static PrintStream getErr() {
        return err;
    }

    public static void setErr(PrintStream err) {
        Printer.err = err;
    }

    public static PrintStream getOut() {
        return out;
    }

    public static void setOut(PrintStream out) {
        Printer.out = out;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        Printer.debug = debug;
    }

    public static void print(Object obj) {
        if (printTime) {
            out.print("[" + TimeHelper.getTime() + "]" + obj.toString());
        } else {
            out.print(obj.toString());
        }
    }

    public static void println(Object obj) {
        if (printTime) {
            err.println("[" + TimeHelper.getTime() + "]" + obj.toString());
        } else {
            err.println(obj.toString());
        }
    }

    public static void debug(String text) {
        if (debug)
            out.println("[" + TimeHelper.getTime() + "]" + text);
    }
}
