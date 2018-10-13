package com.bindstone.vcharts;

public class ChartDataItem {
    private String label;
    private Integer data;
    private Rgba backgroundColor;
    private Rgba borderColor;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Rgba getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Rgba backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Rgba getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Rgba borderColor) {
        this.borderColor = borderColor;
    }
}
