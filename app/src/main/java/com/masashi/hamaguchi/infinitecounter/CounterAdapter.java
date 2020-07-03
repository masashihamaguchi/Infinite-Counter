package com.masashi.hamaguchi.infinitecounter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

/**
 * Created by Masashi Hamaguchi on 2020/06/27.
 */

public class CounterAdapter extends RecyclerView.Adapter<CounterAdapter.ViewHolder> {
    private final LayoutInflater mInflater;
    private List<Counter> mCounterList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public Button plusBtn, minusBtn;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);
            plusBtn = view.findViewById(R.id.plusBtn);
            minusBtn = view.findViewById(R.id.minusBtn);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Position Number is " + (getPosition() + 1), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }

    }

    public CounterAdapter(Context context, List<Counter> mCounterList) {
        this.mCounterList = mCounterList;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public CounterAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = mInflater.inflate(R.layout.item_counter, viewGroup, false);
        return new CounterAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Counter counter = mCounterList.get(position);
        holder.textView.setText(String.valueOf(counter.getNumber()));

        holder.plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.plus();
                holder.textView.setText(String.valueOf(counter.getNumber()));
            }
        });

        holder.minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.minus();
                holder.textView.setText(String.valueOf(counter.getNumber()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mCounterList.size();

    }


}
