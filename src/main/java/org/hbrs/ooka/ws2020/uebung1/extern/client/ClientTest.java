package org.hbrs.ooka.ws2020.uebung1.extern.client;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.HotelRetrieval;
import org.hbrs.ooka.ws2020.uebung1.buchungssystem.Hotelsuche;
import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

public class ClientTest {
    public static void main(String[] args){
        Hotelsuche hotelSuche = new HotelRetrieval();
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
            res = hotelSuche.getHotelByName("Hotel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<res.length;i++){
            Hotel a = res[i];
            System.out.println(a.toString());
        }


    }
}
