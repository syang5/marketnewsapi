package model;

/**
 * Created by syang5 on 1/7/2017.
 * example data:
 *
 {
 "date":  {"$date": "2017-01-03T00:00:00.000Z"},
 "symbol": "PYPL",
 "event": "target-estimate",
 "price": 41,
 "from_price": 46.43,
 "to_price": 50
 }
 */
public class TargetEstimate extends MarketNews {
    private double from_price;
    private double to_price;

    public double getFrom_price() {
        return from_price;
    }

    public void setFrom_price(double from_price) {
        this.from_price = from_price;
    }

    public double getTo_price() {
        return to_price;
    }

    public void setTo_price(double to_price) {
        this.to_price = to_price;
    }

    @Override
    public String toString() {
        return "TargetEstimate{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", event='" + event + '\'' +
                ", price=" + price +
                ", from_price=" + from_price +
                ", to_price=" + to_price +
                ", note='" + price + '\'' +
                ", date=" + date +
                '}';
    }


}
