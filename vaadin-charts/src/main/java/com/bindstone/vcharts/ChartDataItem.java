package com.bindstone.vcharts;

import com.bindstone.vcharts.colors.Color;
import com.bindstone.vcharts.colors.ColorAlpha;

public class ChartDataItem {
    private String label;
    private Integer data;
    private ColorAlpha backgroundColor;
    private ColorAlpha borderColor;

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

    public ColorAlpha getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(ColorAlpha backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = new ColorAlpha(backgroundColor,1);
    }

    public ColorAlpha getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(ColorAlpha borderColor) {
        this.borderColor = borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor =  new ColorAlpha(borderColor,1);;
    }

    public void setItemColor(Color color, double alpha) {
        this.backgroundColor = new ColorAlpha(color, alpha);
        this.borderColor = new ColorAlpha(color, 1);
    }
}
