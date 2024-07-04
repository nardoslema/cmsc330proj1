package com.example.cmsc330proj1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Text extends Image {
    private Point location;
    private String text;

    private Color color;

    public Text(Color color, Point location, String text) {
        super(color);
        this.location = location; // Set the location separately
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawString(text, location.x, location.y);
    }
}
