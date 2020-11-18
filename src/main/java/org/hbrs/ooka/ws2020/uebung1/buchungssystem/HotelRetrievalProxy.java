package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.extern.cache.Caching;
import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.Arrays;
import java.util.List;

public class HotelRetrievalProxy implements HotelSuche {
    HotelRetrieval hotelRetrieval = new HotelRetrieval();
    Logging log = getLogging();
    Caching cache = getCache();

    private Logging getLogging(){
        try {
            return new Util().LoggingProviders(true).next();
        } catch (Exception e) {
            System.out.println("Fehler bei Logging");
            return null;
        }
    }
    private Caching getCache() {
        try {
            return new Util().CacheingProviders(true).next().create();
        } catch (Exception e) {
            System.out.println("Fehler bei dem Cache, kein Cache erzeugt");
            return null;
        }
    }

    @Override
    public Hotel[] getHotelByName(String name) throws Exception {
        log.log("getHotelByName()", name);
        try{
        if (cache != null) {
            List<Hotel> cachedL = cache.getEntry(name);
            if (cachedL != null) {
                return cachedL.toArray(new Hotel[0]);
            } else {
                Hotel[] res = hotelRetrieval.getHotelByName(name);
                cache.cacheResult(name, Arrays.asList(res));
                return res;
            }
        }}catch (Exception e){System.out.println("Fehler beim Caching");}
        return hotelRetrieval.getHotelByName(name);
    }

    @Override
    public List<Hotel> getHotelList() throws Exception {
        return hotelRetrieval.getHotelList();
    }

    @Override
    public void openSession() {
        hotelRetrieval.openSession();
    }

    @Override
    public void closeSession() {
        hotelRetrieval.closeSession();
    }
}
