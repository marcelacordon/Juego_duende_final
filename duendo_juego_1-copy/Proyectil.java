 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectil extends Actor
{
    /**
     * Act - do whatever the Proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 10;
     //cambiarle el tamaño al fueguito 
    public Proyectil()
    {
        getImage().scale(20, 20);
    }
    //los metodos que debe de hacer el fueguito
    public void act()
    {
        turnToMouse();
        move(speed);
        // Add your action code here.
    }
    public void turnToMouse()
    {
        
    }
}
