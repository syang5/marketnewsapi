package model;

/**
 * Created by syang5 on 12/31/2016.
 */
public class InsiderBuy extends MarketNews {
    private double share_purchase;

    public double getShare_purchase() {
        return share_purchase;
    }

    public void setShare_purchase(double share_purchase) {
        this.share_purchase = share_purchase;
    }

    public String toString() {
        return "InsiderBuy{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", event='" + event + '\'' +
                ", price=" + price +
                ", share_purchase='" + share_purchase + '\'' +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}