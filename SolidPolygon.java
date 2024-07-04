package com.example.cmsc330proj1;


import java.awt.*;

/*
 * Class that defines all solid polygons
 */
class SolidPolygon extends Polygon_ {
    private int[] xPoints;
    private int[] yPoints;
    private int nPoints;

    /*
     * Constructor that calls super constructor
     */
    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }
    protected int[] getXPoints() {
        return xPoints;
    }

    protected int[] getYPoints() {
        return yPoints;
    }

    protected int getNPoints() {
        return nPoints;
    }
    /*
     * Draws and fills solid polygon
     */
    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
        graphics.fillPolygon(polygon);
    }



}