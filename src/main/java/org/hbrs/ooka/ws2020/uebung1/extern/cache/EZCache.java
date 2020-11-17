package org.hbrs.ooka.ws2020.uebung1.extern.cache;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;

import java.util.HashMap;
import java.util.List;

public class EZCache implements Caching {
    private HashMap<String, List<Object>> cache= new HashMap<String, List<Object>>();
    @Override
    public void cacheResult(String key, List<Object> value) {
        cache.put(key,value);
    }

}
