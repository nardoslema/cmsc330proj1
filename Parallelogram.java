package com.example.cmsc330proj1;

import java.awt.*;

import java.awt.*;

class Parallelogram extends SolidPolygon {

    /*
     * Constructor that initializes the vertices of the Parallelogram
     */
    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
        super(color, 4);
        int[] x_points = { upperLeft.x, lowerRight.x + offset, lowerRight.x, upperLeft.x - offset, };
        int[] y_points = { upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y, };
        createPolygon(x_points, y_points);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.setColor(color);
        graphics.fillPolygon(getXPoints(), getYPoints(), getNPoints());
    }
}
