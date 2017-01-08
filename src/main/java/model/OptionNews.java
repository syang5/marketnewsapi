package model;

/**
 * Created by syang5 on 12/31/2016.
 */
public class OptionNews extends MarketNews {
    private double top_price;
    private double bottom_price;

    public double getTop_price() {
        return top_price;
    }

    public void setTop_price(double top_price) {
        this.top_price = top_price;
    }

    public double getBottom_price() {
        return bottom_price;
    }

    public void setBottom_price(double bottom_price) {
        this.bottom_price = bottom_price;
    }

    @Override
    public String toString() {
        return "OptionNews{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", event='" + event + '\'' +
                ", price=" + price +
                ", top_price=" + top_price +
                ", bottom_price=" + bottom_price +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}