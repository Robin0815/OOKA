package org.hbrs.ooka.ws2020.uebung1.Hotelsuche;

import org.hbrs.ooka.ws2020.uebung1.Objects.Hotel;

public interface Hotelsuche {
    public void openSession();
    public Hotel getHotelByName(String name) throws Exception;
}
