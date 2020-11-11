package org.hbrs.ooka.ws2020.uebung1.extern;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.HotelRetrieval;
import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.List;

public class ClientTest {
    public static void main(String[] args){
        HotelRetrieval hotelRetrieval = new HotelRetrieval();
        hotelRetrieval.openSession();
        /*List<Hotel> result = null;
        try {
            result  = hotelRetrieval.getHotelList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Hotel i : result){
            System.out.println(i.toString());
        }*/

        Hotel[] res = new Hotel[0];
        try {
            res = hotelRetrieval.getHotelByName("Hotel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<res.length;i++){
            Hotel a = res[i];
            System.out.println(a.toString());
        }

        hotelRetrieval.closeSession();
    }
}
