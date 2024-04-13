/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fourmi;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrateur
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simulation de recherche de nourriture par une colonie de fourmis");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Carte carte = new Carte(800, 600);
            frame.add(carte);

            frame.pack();
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        });
    }
}
