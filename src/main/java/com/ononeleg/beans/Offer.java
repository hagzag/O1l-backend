package com.ononeleg.beans;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by ilya on 07/12/2016.
 */
public class Offer {

    @Id
    private String id;
    private User user;
    private String content;
    private double price;
    private View view;
    private Date date;
    private long viewCount;

    public Offer(User user, String content, double price, View view, Date date, long viewCount) {
        this.user = user;
        this.content = content;
        this.price = price;
        this.view = view;
        this.date = date;
        this.viewCount = viewCount;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public double getPrice() {
        return price;
    }

    public View getView() {
        return view;
    }

    public Date getDate() {
        return date;
    }

    public long getViewCount() {
        return viewCount;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", view=" + view +
                ", date=" + date +
                ", viewCount=" + viewCount +
                '}';
    }
}
