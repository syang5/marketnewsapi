package model;

/**
 * Created by syang5 on 12/31/2016.
 */
public class EarningBeat extends MarketNews {
    @Override
    public String toString() {
        return "EarningBeat{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", event='" + event + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}