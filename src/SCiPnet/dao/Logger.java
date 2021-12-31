package SCiPnet.dao;

import java.io.*;
import java.util.*;

public class Logger {
    private static final String     logFolder = "C:\SCiPnet Logs"


    try{
        File file = new File(logFolder);
        if (!file.exists()) {
            file.mkdir();
        }
    }catch(IOException e){

        }
    }