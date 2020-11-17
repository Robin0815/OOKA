package org.hbrs.ooka.ws2020.uebung1.extern.client;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.*;
import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.extern.LoggingImp1;
import org.hbrs.ooka.ws2020.uebung1.extern.cache.EZCache;

public class Util implements UtilInterface {
    private static Util util;

    private Util() {
    }

    public static Util getInstance() {
        if (util == null)
            synchronized (Util.class) {
                if (util == null) {
                    util = new Util();
                }
            }
        return util;
    }
    private Hotelsuche hotelSuche = new HotelRetrieval();
    private Caching caching = new EZCache();
    private Logging logging = new LoggingImp1();

    @Override
    public Hotelsuche getHotelSuche() {
        return hotelSuche;
    }

    @Override
    public Caching getCaching() {
        return caching;
    }

    @Override
    public Logging getLogging() {
        return logging;
    }
    // Diese Klasse setzt die ganzen Referenzen zu den Schnittstellen

}
