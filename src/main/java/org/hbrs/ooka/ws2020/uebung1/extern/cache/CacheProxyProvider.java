package org.hbrs.ooka.ws2020.uebung1.extern.cache;

public class CacheProxyProvider implements CachingProvider{
    @Override
    public Caching create() {
        return new CacheProxy();
    }
}
