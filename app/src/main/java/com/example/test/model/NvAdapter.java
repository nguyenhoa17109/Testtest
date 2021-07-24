package com.example.test.model;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.R;

import java.util.List;

public class NvAdapter extends BaseAdapter {
    private List<NhanVien> list;

    public List<NhanVien> getList(){
        return list;
    }

    public NvAdapter(List<NhanVien> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        if(list != null)    return list.size();
        return 0;
    }

    @Override
    public NhanVien getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if(convertView == null)
            v = View.inflate(parent.getContext(), R.layout.item, null);
        else v = convertView;
        ImageView iv = v.findViewById(R.id.iv);
        TextView tv = v.findViewById(R.id.tv);
        iv.setImageResource(R.drawable.iconp3);
        tv.setText(list.get(position).toString());

        return v;
    }
}
