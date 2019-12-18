package com.dream71.android.barchartexample.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PiChart {

    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("pie_statistics")
    @Expose
    private PieStatistics pieStatistics;
    @SerializedName("bar_months")
    @Expose
    private List<String> barMonths = null;
    @SerializedName("bar_pending")
    @Expose
    private List<Integer> barPending = null;
    @SerializedName("bar_rejected")
    @Expose
    private List<Integer> barRejected = null;
    @SerializedName("bar_completed")
    @Expose
    private List<Integer> barCompleted = null;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public PieStatistics getPieStatistics() {
        return pieStatistics;
    }

    public void setPieStatistics(PieStatistics pieStatistics) {
        this.pieStatistics = pieStatistics;
    }

    public List<String> getBarMonths() {
        return barMonths;
    }

    public void setBarMonths(List<String> barMonths) {
        this.barMonths = barMonths;
    }

    public List<Integer> getBarPending() {
        return barPending;
    }

    public void setBarPending(List<Integer> barPending) {
        this.barPending = barPending;
    }

    public List<Integer> getBarRejected() {
        return barRejected;
    }

    public void setBarRejected(List<Integer> barRejected) {
        this.barRejected = barRejected;
    }

    public List<Integer> getBarCompleted() {
        return barCompleted;
    }

    public void setBarCompleted(List<Integer> barCompleted) {
        this.barCompleted = barCompleted;
    }


}
