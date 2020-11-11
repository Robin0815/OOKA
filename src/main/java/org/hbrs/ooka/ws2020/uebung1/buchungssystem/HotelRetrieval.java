package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.hotelsuche.Hotelsuche;
import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;


import java.util.ArrayList;
import java.util.List;

public class HotelRetrieval implements Hotelsuche {
    DBAccess db;
    @Override
    public void openSession() {
        db = new DBAccess();
        db.openConnection();
    }
    public void closeSession() {
        db.closeConnection();
    }

    public Hotel[] getHotelByName (String name ) throws Exception {
        List<String> result= db.getObjects( DBAccess.HOTEL, name);
        List<Hotel> res = new ArrayList<>();
        for( int i = 0; i<result.size(); i=i+3 ){
            res.add(new Hotel(result.get(i+1), result.get(i+2)));
        }
        Hotel[] hotelArray = new Hotel[res.size()];
        return res.toArray(hotelArray);
    }
    public List<Hotel> getHotelList () throws Exception {
        List<String> result = db.getObjects(DBAccess.HOTEL, "*");
        List<Hotel> res = new ArrayList<>();
        for( int i = 0; i<result.size(); i=i+3 ){
            res.add(new Hotel(result.get(i+1), result.get(i+2)));
        }
        //Hotel[] hotelArray = new Hotel[res.size()];
        return res;
    }
    private boolean checkName( String Name ){
        // Some Sample Code
        return false;
    }
}


