package org.hbrs.ooka.ws2020.uebung1.extern.client;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.HotelRetrievalProxy;
import org.hbrs.ooka.ws2020.uebung1.buchungssystem.HotelSuche;
import org.hbrs.ooka.ws2020.uebung1.buchungssystem.Util;
import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

public class ClientTest {
    public static void main(String[] args){
        HotelSuche hotelSuche = new Util().HotelSucheProviders(true).next().create();
        hotelSuche.openSession();
        Hotel[] res = new Hotel[0];
        try {
            res = hotelSuche.getHotelByName("Hotel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        hotelSuche.closeSession();
        for(int i=0;i<res.length;i++){
            Hotel a = res[i];
            System.out.println(a.toString());
        }


    }
}
