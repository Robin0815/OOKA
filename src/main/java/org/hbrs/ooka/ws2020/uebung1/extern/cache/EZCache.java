package org.hbrs.ooka.ws2020.uebung1.extern.cache;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.HashMap;
import java.util.List;

public class EZCache implements Caching {
    private static EZCache ezCache = new EZCache();
    public static EZCache getInstance(){
        return ezCache;
    }
    private EZCache(){}
    private HashMap<String, List<Hotel>> cache= new HashMap<String, List<Hotel>>();
    @Override
    public void cacheResult(String key, List<Hotel> value) {
        cache.put(key,value);
    }

    @Override
    public List<Hotel> getEntry(String key) {
        return cache.get(key);
    }

}
