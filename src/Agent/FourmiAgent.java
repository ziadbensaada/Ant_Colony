/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agent;

/**
 *
 * @author Administrateur
 */
import jade.core.Agent;

public class FourmiAgent extends Agent {

    protected void setup() {
        // Initialization code for the ant agent
        System.out.println("Ant agent " + getAID().getName() + " is ready.");
    }

    protected void takeDown() {
        // Clean-up operations for the ant agent
        System.out.println("Ant agent " + getAID().getName() + " is shutting down.");
    }
}
