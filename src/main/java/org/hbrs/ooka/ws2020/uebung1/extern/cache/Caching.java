package org.hbrs.ooka.ws2020.uebung1.extern.cache;

import org.hbrs.ooka.ws2020.uebung1.objects.Hotel;

import java.util.List;

public interface Caching {
    void cacheResult(String key, List<Hotel> value);
    List<Hotel> getEntry(String key);
}
