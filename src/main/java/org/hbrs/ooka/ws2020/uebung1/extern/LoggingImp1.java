package org.hbrs.ooka.ws2020.uebung1.extern;

public class LoggingImp1 implements Logging{

    @Override
    public void log(String name, String value) {
        System.out.println("Aufruf der Methode: "+name+" mit dem Inhalt: "+value);
    }
}
