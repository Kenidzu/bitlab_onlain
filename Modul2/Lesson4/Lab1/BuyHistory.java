package Lesson4.Lab1;

import java.util.Date;

public class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;


    @Override
    public String toString() {
        return goodName+" - "+goodPrice + " EUR " + buyTime;
    }

    public BuyHistory() {
    }

    public BuyHistory(String goodName, int goodPrice) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = new Date();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }
}
