package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

public class RetrievalProvider implements HotelSucheProvider{
    @Override
    public HotelSuche create() {
        return new HotelRetrieval();
    }
}
