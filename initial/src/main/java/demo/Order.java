package demo;

import java.util.Date;

public class Order {

    private String orderId;
    private Date date;
    private Float totalMoney;

    public Order(String orderId, Date date, Float totalMoney) {
        this.orderId = orderId;
        this.date = date;
        this.totalMoney = totalMoney;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }
}
