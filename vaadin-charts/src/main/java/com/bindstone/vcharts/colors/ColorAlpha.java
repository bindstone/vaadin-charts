package com.bindstone.vcharts.colors;

import java.util.Objects;

public class ColorAlpha {
    private Color color;
    private double alpha;

    public ColorAlpha() {
    }

    public ColorAlpha(int red, int green, int blue, double alpha) {
        this.color = new Color(red, green, blue);
        this.alpha = alpha;
    }

    public ColorAlpha(Color color, double alpha) {
        this.color = color;
        this.alpha = alpha;
    }

    public Color getColor() {
        return color;
    }

    public double getAlpha() {
        return alpha;
    }

    public String value() {
        if(Objects.nonNull(color)) {
            return ("rgba(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ", " + alpha + ")");
        } else {
            return null;
        }
    }
}
