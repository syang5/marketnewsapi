package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection="test_data")
public class MarketNews {

    @Id
    protected String id;
    protected String symbol;
    protected String event;
    protected double price;
    protected String note;
    protected Date date;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketNews that = (MarketNews) o;
        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MarketNews{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", event='" + event + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}