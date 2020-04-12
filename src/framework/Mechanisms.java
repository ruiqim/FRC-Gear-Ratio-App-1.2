package framework;

import java.util.ArrayList;
import java.util.List;


public class Mechanisms {
    public List<MechanismsHandler> mechanismList = new ArrayList<MechanismsHandler>();


    
    public Mechanisms() {
        mechanismList.add((new MechanismsHandler("Drivetrain)")));
        mechanismList.add((new MechanismsHandler("Collector")));
        mechanismList.add((new MechanismsHandler("Linear Mechanism")));
        mechanismList.add((new MechanismsHandler("Rotary Mechanism")));
    
    
    }
    
}