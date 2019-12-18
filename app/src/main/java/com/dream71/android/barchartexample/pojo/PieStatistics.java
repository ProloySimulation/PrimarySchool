package com.dream71.android.barchartexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PieStatistics {
    @SerializedName("assigned")
    @Expose
    private int assigned;
    @SerializedName("opened")
    @Expose
    private int opened;
    @SerializedName("in-progress")
    @Expose
    private int inProgress;
    @SerializedName("completed")
    @Expose
    private int completed;
    @SerializedName("done")
    @Expose
    private int done;
    @SerializedName("rejected")
    @Expose
    private int rejected;
    @SerializedName("expired")
    @Expose
    private int expired;

    public int getAssigned() {
        return assigned;
    }

    public void setAssigned(int assigned) {
        this.assigned = assigned;
    }

    public int getOpened() {
        return opened;
    }

    public void setOpened(int opened) {
        this.opened = opened;
    }

    public int getInProgress() {
        return inProgress;
    }

    public void setInProgress(int inProgress) {
        this.inProgress = inProgress;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public int getRejected() {
        return rejected;
    }

    public void setRejected(int rejected) {
        this.rejected = rejected;
    }

    public int getExpired() {
        return expired;
    }

    public void setExpired(int expired) {
        this.expired = expired;
    }
}
