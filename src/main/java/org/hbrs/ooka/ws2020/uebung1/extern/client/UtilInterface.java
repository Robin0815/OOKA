package org.hbrs.ooka.ws2020.uebung1.extern.client;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.Hotelsuche;
import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.extern.Logging;

public interface UtilInterface{

    Hotelsuche getHotelSuche();
    Caching getCaching();
    Logging getLogging();
}
