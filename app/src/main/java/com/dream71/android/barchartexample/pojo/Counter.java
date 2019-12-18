package com.dream71.android.barchartexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Counter {

    @SerializedName("pending")
    @Expose
    private int pending;
    @SerializedName("rejected")
    @Expose
    private int rejected;
    @SerializedName("completed")
    @Expose
    private int completed;
    @SerializedName("expired")
    @Expose
    private int expired;
    @SerializedName("total")
    @Expose
    private int total;

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getRejected() {
        return rejected;
    }

    public void setRejected(int rejected) {
        this.rejected = rejected;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getExpired() {
        return expired;
    }

    public void setExpired(int expired) {
        this.expired = expired;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
