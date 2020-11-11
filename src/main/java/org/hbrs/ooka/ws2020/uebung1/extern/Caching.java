package org.hbrs.ooka.ws2020.uebung1.extern;

import java.util.List;

public interface Caching {
    public void cacheResult(String key, List<Object> value);
}
