package org.hbrs.ooka.ws2020.uebung1.extern;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.*;

public class LoggingImp2 implements Logging {
    private final Logger logger = Logger.getLogger(LoggingImp2.class
            .getName());
    private FileHandler fh = null;

    @Override
    public void log(String name, String value) {

        logger.info("Aufruf der Methode: "+name+" mit dem Inhalt: "+value);

    }

    public LoggingImp2() {
        try {
            fh = new FileHandler("C:\\Users\\Robin\\Documents\\RetrievalLogFile.log");
        } catch (Exception e) {
            e.printStackTrace();
        }
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
    }



    }

