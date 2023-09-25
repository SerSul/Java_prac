package task5.task2;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
@Data
abstract class Shape {
    private Color color;
    private int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}