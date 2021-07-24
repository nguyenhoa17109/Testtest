package com.example.test.model_cycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.Main_Recycle;
import com.example.test.R;

import java.util.List;

public class StadiumAdapter extends RecyclerView.Adapter<StadiumAdapter.StadiumViewHolder>{
    private Context context;
    private List<Stadium> list;

    public StadiumAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Stadium> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public StadiumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_stadium,parent, false
        );
        return new StadiumViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StadiumAdapter.StadiumViewHolder holder, int position) {
        Stadium s = list.get(position);
        if(s == null)   return;
        holder.iv.setImageResource(s.getImg());
        holder.et1.setText(s.getName());
        holder.et2.setText(s.getAddress());
    }

    @Override
    public int getItemCount() {
        if(list!=null)  return list.size();
        return 0;
    }

    public class StadiumViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView et1, et2;

        public StadiumViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imgStadium);
            et1 = itemView.findViewById(R.id.tva);
            et2 = itemView.findViewById(R.id.tvb);
        }
    }
}