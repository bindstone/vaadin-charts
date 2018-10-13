package com.bindstone.vcharts;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * Vaadin Polymer Template: Chart Container
 */
@Tag("chart-container")
@HtmlImport("components/chart-container.html")
public class ChartContainer extends PolymerTemplate<ChartModel> {

    /**
     * Constuctor of Chart Container
     *
     * @param id Id
     * @param height Height
     * @param width  Width
     */
    public ChartContainer(String id, int height, int width) {
        setId(id);
        setHeight(height);
        setWidth(width);
    }

    /**
     * Setter Id
     * @param id Id
     */
    public void setId(String id) {
        getModel().setId(id);
    }

    /**
     * Setter Height
     * @param height Height
     */
    public void setHeight(int height) {
        getModel().setHeight(height);
    }

    /**
     * Setter Width
     * @param width Width
     */
    public void setWidth(int width) {
        getModel().setWidth(width);
    }

    /**
     * Draw a Charts Container (Remote JS-Script)
     * @param container Charts Container
     */
    public void draw(ChartData container) {
        getElement().callFunction("drawChart", container.getJson());
    }
}
