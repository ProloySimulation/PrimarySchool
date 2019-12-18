package com.dream71.android.barchartexample.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dream71.android.barchartexample.R;
import com.dream71.android.barchartexample.pojo.PieStatistics;

import java.util.List;

public class EmployeesAdapter extends RecyclerView.Adapter<EmployeesAdapter.CustomViewHolder> {
    private List<PieStatistics> employees;

    public EmployeesAdapter(List<PieStatistics> employees) {
        this.employees = employees;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_pi_chart, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        PieStatistics pieStatistics = employees.get(position);
        holder.assigned.setText(pieStatistics.getAssigned());
        holder.opened.setText(pieStatistics.getOpened());
        holder.in_progress.setText(pieStatistics.getInProgress());
        holder.completed.setText(pieStatistics.getCompleted());
        holder.done.setText(pieStatistics.getDone());
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView assigned, opened, in_progress, completed, done;

        public CustomViewHolder(View view) {
            super(view);
            assigned = (TextView) view.findViewById(R.id.assigned);
            opened = (TextView) view.findViewById(R.id.opened);
            in_progress = (TextView) view.findViewById(R.id.in_progress);
            completed = (TextView) view.findViewById(R.id.completed);
            done = (TextView) view.findViewById(R.id.done);
        }
    }
}