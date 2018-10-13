package com.bindstone.vcharts_example.view;


import com.bindstone.vcharts.ChartContainer;
import com.bindstone.vcharts.ChartData;
import com.bindstone.vcharts.ChartDataItem;
import com.bindstone.vcharts.Rgba;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("")
@BodySize(height = "100vh", width = "100vw")
public class MainView extends VerticalLayout {

    public MainView() {

        // SVG
        ChartContainer chart = new ChartContainer("myChart", 400, 400);

        // Chart Data
        ChartData chartData = new ChartData();
        chartData.setType("bar");

        ChartDataItem data1 = new ChartDataItem();
        data1.setLabel("Red");
        data1.setData(12);
        data1.setBackgroundColor(new Rgba(255, 99, 132, 0.2));
        data1.setBorderColor(new Rgba(255, 99, 132, 1));

        ChartDataItem data2 = new ChartDataItem();
        data2.setLabel("Blue");
        data2.setData(19);
        data2.setBackgroundColor(new Rgba(54, 162, 235, 0.2));
        data2.setBorderColor(new Rgba(54, 162, 235, 1));

        ChartDataItem data3 = new ChartDataItem();
        data3.setLabel("Yellow");
        data3.setData(3);
        data3.setBackgroundColor(new Rgba(255, 206, 86, 0.2));
        data3.setBorderColor(new Rgba(255, 206, 86, 1));

        ChartDataItem data4 = new ChartDataItem();
        data4.setLabel("Green");
        data4.setData(5);
        data4.setBackgroundColor(new Rgba(75, 192, 192, 0.2));
        data4.setBorderColor(new Rgba(75, 192, 192, 1));

        ChartDataItem data5 = new ChartDataItem();
        data5.setLabel("Purple");
        data5.setData(2);
        data5.setBackgroundColor(new Rgba(153, 102, 255, 0.2));
        data5.setBorderColor(new Rgba(153, 102, 255, 1));

        ChartDataItem data6 = new ChartDataItem();
        data6.setLabel("Orange");
        data6.setData(3);
        data6.setBackgroundColor(new Rgba(255, 159, 64, 0.2));
        data6.setBorderColor(new Rgba(255, 159, 64, 1));

        chartData.getChartDataSet().addDataItem(data1);
        chartData.getChartDataSet().addDataItem(data2);
        chartData.getChartDataSet().addDataItem(data3);
        chartData.getChartDataSet().addDataItem(data4);
        chartData.getChartDataSet().addDataItem(data5);
        chartData.getChartDataSet().addDataItem(data6);

        chartData.getChartDataSet().setBorderWidth(1);
        chartData.getChartDataSet().setLabel("# of Votes");

        chart.draw(chartData);

        // Panel
        HorizontalLayout hl = new HorizontalLayout();
        hl.add(chart);
        hl.setSizeFull();
        this.add(hl);
    }
}
