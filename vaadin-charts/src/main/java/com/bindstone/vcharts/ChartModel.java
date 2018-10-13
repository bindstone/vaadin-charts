package com.bindstone.vcharts;

import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Polymer Template to communicate with <chart-container.html>
 */
public class ChartModel implements TemplateModel {

    // ID
    private String id;
    // Height
    private int height;
    // Width
    private int width;

    /**
     * get Id
     *
     * @return value
     */
    public String getId() {
        return id;
    }

    /**
     * set Id
     *
     * @param id value
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get Height
     *
     * @return value
     */
    public int getHeight() {
        return height;
    }

    /**
     * set Height
     *
     * @param height value
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * get Width
     *
     * @return value
     */
    public int getWidth() {
        return width;
    }

    /**
     * set Width
     *
     * @param width value
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
