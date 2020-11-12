package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.List;

public interface Hotelsuche {
    Hotel[] getHotelByName(String name) throws Exception;
    List<Hotel> getHotelList() throws Exception;
}
