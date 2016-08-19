package com.akshay.dataminingdemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.akshay.dataminingdemo.extras.PieChartMain;
import com.akshay.dataminingdemo.extras.PieChartSlice;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {


    PieChartMain pieChartMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChartMain = (PieChartMain) findViewById(R.id.pacpieChart);
        pieChartMain.setValues(generateSomeSlices());


    }

    public void toggle(View view) {
        pieChartMain.toggle();
    }

    private List<PieChartSlice> generateSomeSlices() {
        List<PieChartSlice> slices = new ArrayList<>();

        PieChartSlice slice1 = new PieChartSlice();
        slice1.percentageCount(40);
        slice1.color(Color.parseColor("#DE87F7"));
        slice1.label("SLICE1 LABEL");
        slices.add(slice1);


        PieChartSlice slice2 = new PieChartSlice();
        slice2.percentageCount(20);
        slice2.color(Color.parseColor("#F5DBB2"));
        slice2.label("SLICE2 LABEL");
        slices.add(slice2);

        PieChartSlice slice3 = new PieChartSlice();
        slice3.percentageCount(10);
        slice3.color(Color.parseColor("#B1C1F3"));
        slice3.label("SLICE3 LABEL");
        slices.add(slice3);

        //here we let the color value empty (default value inside library will be used)
        PieChartSlice slice4 = new PieChartSlice();
        slice4.percentageCount(10);
        slice4.label("SLICE4 LABEL");
        slices.add(slice4);

        PieChartSlice slice5 = new PieChartSlice();
        slice5.percentageCount(20);
        slice5.color(Color.parseColor("#81FBAE"));
        slice5.label("SLICE5 LABEL");
        slices.add(slice5);

        return slices;


    }


}
