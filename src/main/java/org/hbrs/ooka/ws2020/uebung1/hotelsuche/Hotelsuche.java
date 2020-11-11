package org.hbrs.ooka.ws2020.uebung1.hotelsuche;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

public interface Hotelsuche {
    public void openSession();
    public Hotel getHotelByName(String name) throws Exception;
}
