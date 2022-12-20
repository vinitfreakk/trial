package com.accidentaldeveloper.graph;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
       private LineChart mChart; // chart of define kara
       private Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mChart = (LineChart) findViewById(R.id.lineGraph);

        setData(40,60);





    }
    private void setData(int count , int range){
        ArrayList<Entry> yvals1 = new ArrayList<>();
        for(int i = 0 ; i<count;i++){
            float val = (float)(Math.random()*range)+0;
            yvals1.add(new Entry(i,val));
        }
        ArrayList<Entry> yvals2 = new ArrayList<>();
        for(int i = 0 ; i<count;i++){
            float val = (float)(Math.random()*range)+0;
            yvals2.add(new Entry(i,val));
        }
        ArrayList<Entry> yvals3 = new ArrayList<>();
        for(int i = 0 ; i<count;i++){
            float val = (float)(Math.random()*range)+0;
            yvals3.add(new Entry(i,val));
        }

        LineDataSet set1,set2,set3;
        set1 = new LineDataSet(yvals1,"dataset1");
        set2 = new LineDataSet(yvals2,"dataset1");
        set3 = new LineDataSet(yvals3,"dataset1");

        LineData data = new LineData(set1,set2,set3);
        mChart.animateX(2000);


        mChart.setData(data);
    }

}
              // phele ka code//
//        ArrayList<Entry> info = new ArrayList<>();
//        int i =0;
//        while (i<600){
//            info.add(new Entry(random.nextInt(10),random.nextInt(10)));
//            i++;
//        }
//        LineDataSet dataSet = new LineDataSet(info,"report");
//        dataSet.setColor(Color.MAGENTA);
//        dataSet.setValueTextColor(Color.BLACK);
//        dataSet.setValueTextSize(20f);
//        dataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
//        dataSet.setLineWidth(3f);
//        dataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
//        dataSet.setCubicIntensity(0.2f);
//
//
//        LineData lineData = new LineData(dataSet);
//        krChart.setData(lineData);
//        krChart.getDescription().setText("Line Report");
//        krChart.setMaxVisibleValueCount(150);
//        krChart.animateX(2000);
//        krChart.setBackgroundColor(Color.BLACK);


             //  Stack overflow ka code
//    Handler handler = new Handler();
//    Random random = new Random();
//    Integer delay = 2000;
//        handler.postDelayed(new Runnable() {
//@Override
//public void run() {
//        //Do something after 20 seconds
//        int ChartValue = 10 + random.nextInt(90);
//        // calling the graph generator function
//        generateGraph(ChartValue);
//        handler.postDelayed(this, delay);
//        }
//        }, delay);

//    public void generateGraph(Integer val) {
//        final Integer delay = 2000;
//        ArrayList<Entry> yValues = new ArrayList<>();
//        yValues.add(new Entry(0, val));
//        LineDataSet set = new LineDataSet(yValues, "Data");
//        set.setFillAlpha(110);
//        set.setColor(Color.MAGENTA);
//        set.setLineWidth(3f);
//        set.setValueTextSize(10f);
//        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
//        dataSets.add(set);
//        LineData data = new LineData(dataSets);
//        mChart.setData(data);
//        mChart.animateX(1000);
//        mChart.notifyDataSetChanged();
//        mChart.invalidate();
//
//
//    }