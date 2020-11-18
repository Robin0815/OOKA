package org.hbrs.ooka.ws2020.uebung1.extern.cache;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.List;

public class CacheProxy implements Caching {
    private EZCache cache = EZCache.getInstance();
    @Override
    public void cacheResult(String key, List<Hotel> value) {
        cache.cacheResult(key, value);
    }

    @Override
    public List<Hotel> getEntry(String key) {
        return cache.getEntry(key);
    }
}
