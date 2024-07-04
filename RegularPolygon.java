package com.example.cmsc330proj1;

import java.awt.*;

public class RegularPolygon extends Polygon_ {
    public RegularPolygon(Color color, Point center, int sides, int radius) {
        super(color, sides);
        int[] xPoints = new int[sides];
        int[] yPoints = new int[sides];
        for (int i = 0; i < sides; i++) {
            xPoints[i] = (int) (center.x + radius * Math.cos(2 * Math.PI * i / sides));
            yPoints[i] = (int) (center.y + radius * Math.sin(2 * Math.PI * i / sides));
        }
        createPolygon(xPoints, yPoints);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.setColor(color);
        graphics.fillPolygon(polygon);
    }
}

