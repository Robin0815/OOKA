package org.hbrs.ooka.ws2020.uebung1.hotelsuche;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.List;

public interface Hotelsuche {
    public void openSession();
    public void closeSession();
    public Hotel[] getHotelByName(String name) throws Exception;
    public List<Hotel> getHotelList() throws Exception;
}
