/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import becker.robots.*;
import java.awt.Color;
public class EjercicioKarel {
    private City ciudad;
    private Robot robot;
    
    public EjercicioKarel(){
        this.ciudad = new City();
        
        for (int i = 1; i <= 6; i++) {
            Wall pared = new Wall(ciudad, 1, i, Direction.NORTH);
        }
        for (int i = 1; i <= 6; i++) {
            Wall pared = new Wall(ciudad, i, 6, Direction.EAST);
        }
        for (int i = 6; i >= 1; i--) {
            Wall pared = new Wall(ciudad, 6, i, Direction.SOUTH);
        }
        for (int i = 6; i >= 1; i--) {
            Wall pared = new Wall(ciudad, i, 1, Direction.WEST);
        }
        
        Thing thing = new Thing(ciudad,2,2);
        thing.getIcon().setColor(Color.cyan);
        thing.getIcon().setLabel("Placa");
        
        this.robot = new Robot(ciudad, 3, 3, Direction.EAST);
        robot.setLabel("Robot");
        robot.setColor(Color.RED);
        
    }
    
    public void solucionarReto(){
        for(int i=0;i<3;i++){
            this.robot.move();            
        }
    }
    
}
