/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fourmi;

/**
 *
 * @author Administrateur
 */
import javax.swing.*;
import java.awt.*;

public class Carte extends JPanel {
    private final int width;
    private final int height;

    public Carte(int width, int height) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the map components here (e.g., anthill, food source, ants)
    }
}