package com.example.test;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class MainChart extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chart);

        LineChartView lineChartView = findViewById(R.id.chart);
        String[] axisData = {"Day1", "Day2", "Day3"};
        int[] yAxisData = {30, 20, 15};
        int[] yAx2Data = {0, 45, 10};

        List yAxisValues = new ArrayList();
        List yAx2 = new ArrayList();
        List axisValues = new ArrayList();
        Line line = new Line(yAxisValues).setColor(Color.parseColor("#1F78B4"));
        Line line1 = new Line((yAx2)).setColor(Color.parseColor("#B2DF8A"));
        for(int i = 0; i < axisData.length; i++){
            axisValues.add(i, new AxisValue(i).setLabel(axisData[i]));
        }

        for (int i = 0; i < yAxisData.length; i++){
            yAxisValues.add(new PointValue(i, yAxisData[i]));
        }
        for (int i = 0; i < yAx2Data.length; i++){
            yAx2.add(new PointValue(i, yAx2Data[i]));
        }

        List lines = new ArrayList();
        lines.add(line);
        lines.add(line1);

        LineChartData data = new LineChartData();
        data.setLines(lines);
        lineChartView.setLineChartData(data);

        Axis axis = new Axis();
        axis.setValues(axisValues);
        axis.setTextSize(10);
//        axis.set
//        axis.setTextColor(Color.parseColor("#1F78B4"));
        data.setAxisXBottom(axis);

        Axis yAxis = new Axis();
        data.setAxisYLeft(yAxis);
        yAxis.setTextColor(Color.parseColor("#A3A3A3"));
        yAxis.setTextSize(10);
////        yAxis.set
//        yAxis.setName("Sales in millions");


        Viewport viewport = new Viewport(lineChartView.getMaximumViewport());
        viewport.top = 60;
        viewport.bottom = 0;
        lineChartView.setMaximumViewport(viewport);
        lineChartView.setCurrentViewport(viewport);

    }
}
