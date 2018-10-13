package com.bindstone.vcharts;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

public class ChartData {

    private String type;
    private ChartDataSet chartDataSet;

    public ChartData() {
        chartDataSet = new ChartDataSet();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChartDataSet getChartDataSet() {
        return chartDataSet;
    }

    public void setChartDataSet(ChartDataSet chartDataSet) {
        this.chartDataSet = chartDataSet;
    }

    public JsonObject getJson() {

        JsonObject rtn = Json.createObject();
        rtn.put("type", type);
        rtn.put("data", chartDataSet.getJson());

        // TODO BONUS Create Java Wrappers...
        JsonObject begin = Json.createObject();
        begin.put("beginAtZero", "true");

        JsonObject ticks = Json.createObject();
        ticks.put("ticks", begin);
        
        JsonArray yAxes = Json.createArray();
        yAxes.set(0, ticks);

        JsonObject axes = Json.createObject();
        axes.put("yAxes", yAxes);

        JsonObject scales = Json.createObject();
        scales.put("scales", axes);

        rtn.put("options" , scales);

        return rtn;
    }
}
