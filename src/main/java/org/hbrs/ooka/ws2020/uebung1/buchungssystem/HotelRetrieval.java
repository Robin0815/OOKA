package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.Hotelsuche.Hotelsuche;
import org.hbrs.ooka.ws2020.uebung1.Objects.Hotel;

public class HotelRetrieval implements Hotelsuche {
    DBAccess a;
    @Override
    public void openSession() {
        a = new DBAccess();
        a.openConnection();
    }

    public Hotel getHotelByName (String Name ) throws Exception {
// Some Sample Code
        return null;
    }
    private boolean checkName( String Name ){
// Some Sample Code
        return false;
    }
}


