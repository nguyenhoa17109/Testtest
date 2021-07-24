package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.test.model.NhanVien;
import com.example.test.model.NvAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main_model extends AppCompatActivity {
    private EditText edt1, edt2;
    private Button bt;
    private RadioGroup rg;
    private ListView listView;
    private NvAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex);
        init();
        bt.setOnClickListener(this::add);
    }

    private void init() {
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        bt = findViewById(R.id.btNv);
        rg  = findViewById(R.id.rg);
        listView = findViewById(R.id.lv);
        adapter = new NvAdapter(creatData());
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private List<NhanVien> creatData() {
        List<NhanVien> list = new ArrayList<>();
        list.add(new NhanVien("ma1", "Nguyen", R.drawable.iconp2));
        return list;
    }

    private void add(View view) {
        NhanVien nv = new NhanVien();
        nv.setCode(edt1.getText().toString());
        nv.setName(edt2.getText().toString());

        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        nv.setImg(R.drawable.iconp3);
        nv.setGender(rb.getText().toString());
        List<NhanVien> list = adapter.getList();
        list.add(nv);
        adapter.notifyDataSetChanged();
    }
}
