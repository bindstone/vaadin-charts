package com.bindstone.vcharts_example.view;

import com.bindstone.vcharts.ChartContainer;
import com.bindstone.vcharts.ChartData;
import com.bindstone.vcharts.ChartDataItem;
import com.bindstone.vcharts.colors.ColorPalette;

public class BarExample {

    public static ChartContainer myChart(int height, int width) {
        // SVG
        ChartContainer chart = new ChartContainer("myChart", height, width);

        // Chart Data
        ChartData chartData = new ChartData();
        chartData.setType("bar");

        ChartDataItem data1 = new ChartDataItem();
        data1.setLabel("Red");
        data1.setData(12);
        data1.setItemColor(ColorPalette.RED, 0.2);

        ChartDataItem data2 = new ChartDataItem();
        data2.setLabel("Blue");
        data2.setData(19);
        data2.setItemColor(ColorPalette.BLUE, 0.2);

        ChartDataItem data3 = new ChartDataItem();
        data3.setLabel("Yellow");
        data3.setData(3);
        data3.setItemColor(ColorPalette.YELLOW, 0.2);

        ChartDataItem data4 = new ChartDataItem();
        data4.setLabel("Green");
        data4.setData(5);
        data4.setItemColor(ColorPalette.GREEN, 0.2);

        ChartDataItem data5 = new ChartDataItem();
        data5.setLabel("Purple");
        data5.setData(2);
        data5.setItemColor(ColorPalette.PURPLE, 0.2);

        ChartDataItem data6 = new ChartDataItem();
        data6.setLabel("Orange");
        data6.setData(3);
        data6.setItemColor(ColorPalette.ORANGE, 0.2);

        chartData.getChartDataSet().addDataItem(data1);
        chartData.getChartDataSet().addDataItem(data2);
        chartData.getChartDataSet().addDataItem(data3);
        chartData.getChartDataSet().addDataItem(data4);
        chartData.getChartDataSet().addDataItem(data5);
        chartData.getChartDataSet().addDataItem(data6);

        chartData.getChartDataSet().setBorderWidth(1);
        chartData.getChartDataSet().setLabel("# of Votes");

        chart.draw(chartData);

         return chart;

    }
}
