package com.akshay.dataminingdemo.extras;

/**
 * Created by akshay on 06/14/16.
 */
public enum PieChartState {

    WAIT(0),
    IS_READY_TO_DRAW(1),
    IS_DRAW(2),
    START_INC(3);

    public int stateCode;

    PieChartState(int stateCode){
        this.stateCode = stateCode;
    }
}
