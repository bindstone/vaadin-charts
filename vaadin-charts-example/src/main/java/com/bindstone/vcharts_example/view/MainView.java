package com.bindstone.vcharts_example.view;


import com.bindstone.vcharts.ChartContainer;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("")
@BodySize(height = "100vh", width = "100vw")
public class MainView extends VerticalLayout {

    public MainView() {

        ChartContainer chart1 = BarExample.myChart(600, 600);
        ChartContainer chart2 = BarExample.myChart(400, 400);
        ChartContainer chart3 = BarExample.myChart(200, 200);

        // Panel
        HorizontalLayout hl = new HorizontalLayout();
        hl.add(chart1);
        hl.add(chart2);
        hl.add(chart3);
        hl.setSizeFull();
        this.add(hl);
    }
}
