package com.lh.nullapk.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lh.nullapk.R;

/**
 * Created by Liaohuan on 2016/10/31.
 */
public class RecyAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private ViewGroup viewGroup;

    public RecyAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        View view2 = LayoutInflater.from(mContext).inflate(R.layout.item2, parent, false);
        Viewholder viewholder = new Viewholder(view);
        Viewholder2 viewholder2 = new Viewholder2(view2);
        Log.d("###########", viewType + "");
        if (viewType % 2 == 0) {
            return viewholder;
        } else {
            return viewholder2;
        }
//        viewGroup = parent;

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position % 2 == 0) {
            Viewholder viewholder = (Viewholder) holder;
            viewholder.textView.setText(position + "");
        } else {
            Viewholder2 viewholder2 = (Viewholder2) holder;
            viewholder2.textView.setText(position + "");
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }



    class Viewholder extends RecyclerView.ViewHolder {
        public TextView textView;

        public Viewholder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tx);
        }
    }

    class Viewholder2 extends RecyclerView.ViewHolder {
        public TextView textView;

        public Viewholder2(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tx2);
        }
    }
}
