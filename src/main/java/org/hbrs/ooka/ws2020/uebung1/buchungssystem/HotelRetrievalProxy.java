package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.extern.LoggingImp1;
import org.hbrs.ooka.ws2020.uebung1.extern.client.Util;
import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.List;

public class HotelRetrievalProxy implements Hotelsuche{
    HotelRetrieval hotelRetrieval = new HotelRetrieval();
    Logging log = new LoggingImp1();
    @Override
    public Hotel[] getHotelByName(String name) throws Exception {
        log.log("getHotelByName", name);
        return hotelRetrieval.getHotelByName(name);
    }

    @Override
    public List<Hotel> getHotelList() throws Exception {
        return hotelRetrieval.getHotelList();
    }

}
