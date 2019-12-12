package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        /* Falta referenciar el objeto de la clase, sin él no se puede hacer el llamado a los métodos de esta
        slowDown();
        moveDown();
        accelerate(); */
        car.slowDown();
        car.moveDown();
        car.accelerate();
        /* En este caso no se debe referenciar al objeto car, sino al objeto g, el cual tiene los metodos de garage.
        car.printGarage();*/
        g.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    /**
     * Accelerate the car
     * @throws InterruptedException 
     */
    public void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    public void slowDown() throws InterruptedException{
    	/*La clase "string" tiene un error de sintaxis, la letra "s" debe estar en mayusculas
    	string c = new string("     *");*/
    	String c = new String("     *");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    public void moveDown() throws InterruptedException{
    	/*La clase "string" tiene un error de sintaxis como en el fallo anterior, la letra "s" debe estar en mayusculas. 
    	 * Además, sobra el ultimo cerrar parentesis
    	string c = new string("\t\t\t\t  *"));*/
    	String c = new String("\t\t\t\t  *");
    	/* En la creación del bucle for, la sintaxis debe separarse mediante ";", no con ","
    	for(int i=0, i<5, i++)*/
    	for(int i=0; i<5; i++)
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
