/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agent;

/**
 *
 * @author Administrateur
 */
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class FourmiContainer {

    public static void main(String[] args) {
        Runtime rt = Runtime.instance();
        Profile p = new ProfileImpl();
        p.setParameter(Profile.MAIN_HOST, "localhost");
        p.setParameter(Profile.GUI, "true");
        AgentContainer ac = rt.createAgentContainer(p);

        try {
            AgentController agentController = ac.createNewAgent("FourmiAgent", FourmiAgent.class.getName(), new Object[]{});
            agentController.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
}
