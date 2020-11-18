package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.extern.cache.CacheProxyProvider;
import org.hbrs.ooka.ws2020.uebung1.extern.cache.CachingProvider;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Util {
    ServiceLoader<HotelSucheProvider> loader1 = ServiceLoader
            .load(HotelSucheProvider.class);

    ServiceLoader<CachingProvider> loader2 = ServiceLoader
            .load(CachingProvider.class);

    ServiceLoader<Logging> loader3 = ServiceLoader
            .load(Logging.class);

    public Iterator<HotelSucheProvider> HotelSucheProviders(boolean refresh) {
        if (refresh) {
            loader1.reload();
        }
        return loader1.iterator();
    }

    public Iterator<CachingProvider> CacheingProviders(boolean refresh) {
        if (refresh) {
            loader2.reload();
        }
        return loader2.iterator();
    }

    public Iterator<Logging> LoggingProviders(boolean refresh) {
        if (refresh) {
            loader3.reload();
        }
        return loader3.iterator();
    }
}

