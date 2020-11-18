package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;
import java.util.ArrayList;
import java.util.List;

public class HotelRetrieval implements HotelSuche {
    DBAccess db;

    public void openSession() {
        db = new DBAccess();
        db.openConnection();
    }
    public void closeSession() {
        db.closeConnection();
    }

    public Hotel[] getHotelByName (String name ) throws Exception {
        List<Hotel> res = getHotelByNameList(name);
        Hotel[] hotelArray = new Hotel[res.size()];
        return res.toArray(hotelArray);
    }
    public List<Hotel> getHotelByNameList (String name) throws Exception {
        //openSession();
        List<String> result = db.getObjects(DBAccess.HOTEL, name);
        List<Hotel> res = new ArrayList<>();
        for( int i = 0; i<result.size(); i=i+3 ){
            res.add(new Hotel(result.get(i+1), result.get(i+2)));
        }
        //closeSession();
        return res;}

    public List<Hotel> getHotelList () throws Exception {
        return getHotelByNameList("*");
    }

    private boolean checkName( String name ){
        try {
            List<Hotel> a = getHotelByNameList(name);
            return !a.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


