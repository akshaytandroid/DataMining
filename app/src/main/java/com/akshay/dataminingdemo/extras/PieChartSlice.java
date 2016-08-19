package com.akshay.dataminingdemo.extras;


/**
 * Created by akshay on 06/14/16.
 */
public class PieChartSlice {

	public float count;
    public int color = -1;
	public String label;

    public void percentageCount(float countValue){
        this.count = countValue;
    }

    public void color(int colorValue){
        this.color = colorValue;
    }

    public void label(String labelValue){
        this.label = labelValue;
    }
}
