package com.bindstone.vcharts;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class ChartDataSet {
    private String label;
    private List<ChartDataItem> datasets;
    private Integer borderWidth;

    public ChartDataSet() {
        datasets = new ArrayList<ChartDataItem>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<ChartDataItem> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<ChartDataItem> datasets) {
        this.datasets = datasets;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void addDataItem(ChartDataItem data) {
        this.datasets.add(data);
    }

    public JsonArray getLabels() {
        JsonArray labels = Json.createArray();
        int i = 0;
        for (ChartDataItem dataset : datasets) {
            labels.set(i++, dataset.getLabel());
        }
        return labels;
    }

    public JsonArray getDataSet() {
        JsonArray rtn = Json.createArray();

        JsonArray datas = Json.createArray();
        JsonArray bordercolors = Json.createArray();
        JsonArray backcolors = Json.createArray();

        int i = 0;
        for (ChartDataItem dataset : datasets) {
            datas.set(i, dataset.getData());
            bordercolors.set(i, dataset.getBorderColor().value());
            backcolors.set(i, dataset.getBackgroundColor().value());
            i = i + 1;
        }

        JsonObject item = Json.createObject();
        item.put("label", getLabel());
        item.put("data", datas);
        item.put("backgroundColor", backcolors);
        item.put("borderColor", bordercolors);
        item.put("borderWidth", getBorderWidth());

        rtn.set(0,item);
        return rtn;
    }

    public JsonObject getJson() {
        JsonObject rtn = Json.createObject();

        rtn.put("labels", getLabels());
        rtn.put("datasets", getDataSet());

        return rtn;
    }
}
