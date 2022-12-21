package com.accidentaldeveloper.graph;




import android.graphics.Color;
import android.hardware.Sensor;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity  {
       private LineChart mChart;
       private Thread thread;
       private int seconds;
       final Handler handler=new Handler();
       Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mChart = (LineChart) findViewById(R.id.lineGraph);

        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);
        mChart.setBackgroundColor(Color.BLACK);


        CountDownTimer timer = new CountDownTimer(15000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                makeGraph(50,80);
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Finish", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }

      //this function is to make graph


     public void makeGraph(int a,int b){
        ArrayList<Entry> dataValues = new ArrayList<>();
        int x=a;
         int y=b;
        for(int i = 0;i<x;i++){
            dataValues.add(new Entry(i,y*random.nextInt(150)+50));
        }
        LineDataSet lineDataSet = new LineDataSet(dataValues,"BANJA NA PLS");
        lineDataSet.setColor(Color.MAGENTA);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);
        LineData lineData = new LineData(lineDataSet);
        mChart.setData(lineData);

        mChart.moveViewToX(lineDataSet.getEntryCount());
        mChart.animateX(500);
         Legend l = mChart.getLegend();

         // modify the legend ...
         l.setForm(Legend.LegendForm.LINE);
         l.setTextColor(Color.WHITE);

         XAxis xl = mChart.getXAxis();
         xl.setTextColor(Color.WHITE);
//        xl.setDrawGridLines(true);
         xl.setAvoidFirstLastClipping(true);
         xl.setEnabled(true);

         YAxis leftAxis = mChart.getAxisLeft();
         leftAxis.setTextColor(Color.WHITE);
         leftAxis.setDrawGridLines(false);
         leftAxis.setDrawGridLines(true);

         YAxis rightAxis = mChart.getAxisRight();
         rightAxis.setEnabled(false);

         mChart.getAxisLeft().setDrawGridLines(false);
         mChart.getXAxis().setDrawGridLines(false);
         mChart.setDrawBorders(false);

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


//// JANVI KA CODE
//handler.post(new Runnable() {
//@Override
//public void run() {
//        setData((int) Math.random(), (int) Math.random());
//        mChart.invalidate();
//        mChart.notifyDataSetChanged();
//        mChart.invalidate();
//        handler.postDelayed(this,800);
//        handler.getLooper();
//        }
//        });
////handler.post(runnable);



// ye code line ko move karta hai
// mChart.moveViewToX(set1.getEntryCount());