package lib.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class Input {
    private static BufferedReader terminalInput;

    static {
        init();
    }

    private static void init(){
        terminalInput = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readInput(){
        String s = null;
        try {
            s = terminalInput.readLine();
        } catch (IOException e) {
//            TODO: Logger.log
        }
        return s;
    }

}
